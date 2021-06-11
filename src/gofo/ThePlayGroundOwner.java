package gofo;

import java.util.ArrayList;

public class ThePlayGroundOwner {

    private String Name;
    private String Password;
    private String Email;
    private ArrayList<Ground> ListOfGrounds = new ArrayList<Ground>();
    private Ewallet wallet;

    public ThePlayGroundOwner() {
        Name = "";
        Password = "";
        Email = "";
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    
    public void Login(String E, String Pass) {
        Email = E;
        Password = Pass;
    }

    public void AddGround(Ground g) {
        ListOfGrounds.add(g);
    }
    public boolean Request(Ground g ,String h){
        int k=0,flag=0;
        for(int i=0;i<ListOfGrounds.size();i++){
            if(ListOfGrounds.get(i).getGroundName()==g.getGroundName()){
                k=i;
                break;
            }
        }
        for(int i=0;i<ListOfGrounds.get(k).AvailbleHours.size();i++){
            if(ListOfGrounds.get(k).AvailbleHours.get(i)==h){
                flag=1;
                ListOfGrounds.get(k).DelHour(h);
            }
        }
        if (flag == 1 ){
            return true;
            
        }
        else {
            return false;
        }
    }
    public void Payment(double c) {
        wallet.setBalance(wallet.getBalance()+c);
    }
    
}
