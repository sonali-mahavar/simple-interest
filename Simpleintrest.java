
package simpleintrest;
import java.util.Scanner;
public class Simpleintrest {


    public static void main(String[] args) {
       float p,r,t,si;
       Scanner sc=new Scanner(System.in);
       System.out.print("ENTER PRINCIPLE:");
       p=sc.nextFloat();
       System.out.print("ENTER RATE:");
       r=sc.nextFloat();
       System.out.print("ENTER TIME:");
       t=sc.nextFloat();
       si =(r*t*p)/100;
       System.out.print("SIMPLE INTEREST IS:"+si);
    }
    
}
