package gofo;
import java.util.ArrayList;

public class ThePlayGroundOwner {
    private String Name;
    private String Password;
    private String Email;
    private ArrayList<Ground>ListOfGrounds=new ArrayList<Ground>();
    private String hour;
    private String Ground;
    public ThePlayGroundOwner(){
        Name="";
        Password="";
        Email="";
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

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setGround(String Ground) {
        this.Ground = Ground;
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

    public String getHour() {
        return hour;
    }

    public String getGround() {
        return Ground;
    }
    
    public void Login(String E,String Pass){
        Email=E;
        Password=Pass;
    }
    public void AddGround(Ground g){
        ListOfGrounds.add(g);
    }
//    public boolean Request(){
//        int k=0,flag=0;
//        for(int i=0;i<ListOfGrounds.size();i++){
//            if(ListOfGrounds.get(i).getGroundName()==Ground){
//                k=i;
//                break;
//            }
//        }
//        for(int i=0;i<ListOfGrounds.get(k).AvailbleHours.size();i++){
//            if(ListOfGrounds.get(k).AvailbleHours.get(i)==hour){
//                flag=1;
//                ListOfGrounds.get(k).AvailbleHours
//            }
//        }
//    }
//    
}

