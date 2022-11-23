/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.*;

public interface CalculatorInterface extends Remote {
     int add(int x,int y) throws RemoteException;
      int sub(int x,int y) throws RemoteException;
        int mul(int x,int y) throws RemoteException;
          int div(int x,int y) throws RemoteException;
}
