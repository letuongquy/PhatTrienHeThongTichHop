package bai5RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import testRMI.CalculatorImpl;

public class SerVerChuoi {
public static void main(String[] args) throws AlreadyBoundException {
	Registry reg;
	try {
		reg = LocateRegistry.createRegistry(9999);
		NhapChuoimpl pl=new NhapChuoimpl();
		reg.bind("RMInc",pl);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
