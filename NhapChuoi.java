package bai5RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NhapChuoi extends Remote{
   String chuoi(String x) throws RemoteException;
}
