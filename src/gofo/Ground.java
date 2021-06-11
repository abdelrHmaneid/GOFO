package gofo;
import java.util.ArrayList;

public class Ground {
    private double Area;
    private String Loction;
    public ArrayList<String>AvailbleHours=new ArrayList<String>();
    private double Price;
    private String GroundName;
    public Ground(){
        Area=0.0;
        Loction="";
        Price=0.0;
        GroundName="";
    }
    public Ground(double a,String l,double p,String n){
        Area=a;
        Loction=l;
        Price=p;
        GroundName=n;
    }
    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setLoction(String Loction) {
        this.Loction = Loction;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setGroundName(String GroundName) {
        this.GroundName = GroundName;
    }

    public double getArea() {
        return Area;
    }

    public String getLoction() {
        return Loction;
    }

    public double getPrice() {
        return Price;
    }

    public String getGroundName() {
        return GroundName;
    }
    public void AddHour(String H){
        AvailbleHours.add(H);
    }
    public void DelHour(String D){
        int k=0;
        for (int i=0;i<AvailbleHours.size();i++){
            if (AvailbleHours.get(i)==D){
              k=i;
              break;
            }
        }
        AvailbleHours.remove(k);
    }
}
