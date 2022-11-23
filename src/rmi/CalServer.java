/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.*;

public class CalServer {
  public static void main(String [] args){
      
      try{
        Registry r = LocateRegistry.createRegistry(1099);
          r.rebind("cal",new CalculatorRMI());
          System.out.println("server is connected ...");
      }catch(Exception e){
          System.out.println("server is not connected ..."+e);
      }
  }   
    
}
