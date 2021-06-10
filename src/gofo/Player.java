
package gofo;


public class Player {
    private String Name;
    private String Password;
    private String Email;
//    private Ewallet wallet;
    public Player(){
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

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }
    public void Login(String em,String p){
        Email = em;
        Password = p;
    }
//    public void Booking(Ground g){
//        
//    }
//    public void CancelBook(Ground g){
//        
//    }
//    public boolean Search(Ground g){
//        
//    }
    
    public void Payment(double c){
        
    }
}
