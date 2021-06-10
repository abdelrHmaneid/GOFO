
package gofo;

import java.util.Scanner;


public class GoFO {

    
    public static void main(String[] args) {
        while(true){
            System.out.println("Wellcome to GO Football");
            System.out.println("1-Sign in");
            System.out.println("2-Sign up");
            System.out.println("3-Exit");
            Scanner in = new Scanner(System.in);
            int Snu =in.nextInt();
            if(Snu == 1){
                //Sign in
            }
            else if(Snu == 2){
                //Sign up
            }
            else{
                //Exit
                break;
            }
        }
    }
    
}
