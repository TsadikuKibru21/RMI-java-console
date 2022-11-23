/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;
import java.rmi.*;

public class CalculatorRMI extends UnicastRemoteObject implements CalculatorInterface{
  public CalculatorRMI() throws RemoteException{
      super();
  } 
    public int add(int x,int y) throws RemoteException{
        return x+y;
    }
     public int sub(int x,int y) throws RemoteException{
        return x-y;
    }       
     public int mul(int x,int y) throws RemoteException{
        return x*y;
    }       
    public int div(int x,int y) throws RemoteException{
        return x/y;
    }
}
