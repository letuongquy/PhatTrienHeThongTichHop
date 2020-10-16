package bai2RMIn;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Bai2_TimBookmpl extends UnicastRemoteObject implements Bai2_TimBook{
	public Bai2_TimBookmpl() throws RemoteException{
		super();
	}
    public Bai2_Book timbook(String ma) throws RemoteException {
    	Bai2_Book bk[] = null;
    	int n=5;
    	for(int i=0;i<n;i++) {
    		if(bk[i].getMaSach().equalsIgnoreCase(ma)) {
    			return bk[i];
    		}
    	}
    	return null;
    }
}
