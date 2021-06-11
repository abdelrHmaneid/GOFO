package gofo;

import java.util.Scanner;

public class GoFO {

    public static void main(String[] args) {
        Ground G1 = new Ground();
        Ground G2 = new Ground();
        while (true) {
            System.out.println("Wellcome to GO Football");
            System.out.println("1-Sign up player");
            System.out.println("2-Sign up Playground owner");
            System.out.println("3-Exit");
            Scanner in = new Scanner(System.in);
            int S = in.nextInt();
            if (S == 1) {
                Player p = new Player();
                System.out.print("Enter your email ");
                String em = in.next();
                System.out.print("Enter your password ");
                String pass = in.next();
                p.Login(em, pass);
                System.out.println("login succeeded");
                while (true) {
                    System.out.println("1-Sign deposit");
                    System.out.println("2-Book");
                    System.out.println("3-Exit");
                    int B = in.nextInt();
                    if (B == 1) {
                        System.out.println("Enter amount");
                        double m = in.nextDouble();
                        Ewallet e = new Ewallet(1,m);
                        p.setWallet(e);
                    } else if (B == 2) {
                        p.Booking(G2);
                        p.Payment(G2.getPrice());
                        System.out.println("Booked  The price has been deducted from your balance");

                    } else {
                        break;
                    }
                }
            } else if (S == 2) {
                ThePlayGroundOwner o = new ThePlayGroundOwner();
                System.out.print("Enter your email ");
                String em = in.next();
                System.out.print("Enter your password ");
                String pass = in.next();
                o.Login(em, pass);
                System.out.println("login succeeded");
                while (true) {
                    System.out.println("1-Add ground");
                    System.out.println("2-Add hours");
                    System.out.println("3-Requests");
                    System.out.println("4-Exit");
                    int B = in.nextInt();
                    if (B == 1) {
                        System.out.println("Enter Ground details (Area, loction, price, name)");
                        double a = in.nextDouble();
                        G1.setArea(a);
                        String l = in.next();
                        G1.setLoction(l);
                        double p = in.nextDouble();
                        G1.setPrice(p);
                        String n = in.next();
                        G1.setGroundName(n);
                        System.out.println("1-Add one more");
                        System.out.println("2-Exit");
                        int c = in.nextInt();
                        if (c == 1){
                            System.out.println("Enter Ground details (Area, loction, price, name)");
                            double a1 = in.nextDouble();
                            G1.setArea(a);
                            String l1 = in.next();
                            G1.setLoction(l);
                            double p1 = in.nextDouble();
                            G1.setPrice(p);
                            String n1 = in.next();
                            G1.setGroundName(n);
                            System.out.println("done");
                        }
                        
                    } else if (B == 2) {
                        while (true) {
                            System.out.println("choose ground (G1, G2) or any key to exit");
                            String gs = in.next();
                            if ("G1".equals(gs)) {
                                System.out.println("How many hours will add");
                                int i = in.nextInt();
                                String h;
                                for (int j = 0; j < i; j++) {
                                    System.out.print("Enter hour (00:00)");
                                    h = in.next();
                                    G1.AddHour(h);
                                }
                            } else if ("G2".equals(gs)) {
                                System.out.println("How many hours will add");
                                int i = in.nextInt();
                                String h;
                                for (int j = 0; j < i; j++) {
                                    System.out.print("Enter hour (00:00)");
                                    h = in.next();
                                    G2.AddHour(h);
                                }

                            } else {
                                break;
                            }
                        }
                        o.AddGround(G1);
                        o.AddGround(G2);

                    } else if (B == 3){
                        if(o.Request(G1, "01:00")){
                            System.out.println("the book is avaible" );
                        }
                    }
                    else{
                        break;
                    }
                }
            } else {
                
                break;
            }
        }
    }
}


