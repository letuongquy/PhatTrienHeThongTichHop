package bai2RMIn;

import java.rmi.RemoteException;

public interface Bai2_TimBook {
   Bai2_Book timbook(String ma) throws RemoteException;
}
