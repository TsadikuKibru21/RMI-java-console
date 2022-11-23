
package rmi;

import java.rmi.*;
import java.util.*;
public class Client {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      try{
          CalculatorInterface cal=(CalculatorInterface) Naming.lookup("localhost/cal");
          int x,y;
          x=in.nextInt();
          y=in.nextInt();
          
           System.out.println("The sum is....."+cal.add(x, y));
      }catch(Exception e){
         System.out.println("error....."+e);
      }
        
        
        
    }
    
}
