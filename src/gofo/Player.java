package gofo;

public class Player {

    private String Name;
    private String Password;
    private String Email;
    public Ewallet wallet;

    public Player() {
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

    public void setWallet(Ewallet wallet) {
        this.wallet = wallet;
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

    public Ewallet getWallet() {
        return wallet;
    }
    

    public void Login(String em, String p) {
        Email = em;
        Password = p;
    }
    public void Booking(Ground g){
        
    }

    public void Payment(double c) {
        wallet.setBalance(wallet.getBalance()-c);
    }
}
