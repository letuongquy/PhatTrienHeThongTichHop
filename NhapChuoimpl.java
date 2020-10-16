package bai5RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NhapChuoimpl extends UnicastRemoteObject implements NhapChuoi{
   public NhapChuoimpl() throws RemoteException{
	   super();
   }
   public String chuoi(String x) throws RemoteException{
	   String reverse= new StringBuffer(x).reverse().toString();
	   return reverse;
   }
}
