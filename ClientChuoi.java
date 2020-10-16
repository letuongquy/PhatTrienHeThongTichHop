package bai5RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientChuoi {

public static void main(String[] args) throws NotBoundException {
	Scanner scn=new Scanner(System.in);
	try {
		Registry reg=LocateRegistry.getRegistry("localhost",9999);
		NhapChuoi nc= (NhapChuoi) reg.lookup("RMInc");
		System.out.println("Nhap chuoi ki tu: ");
		String x=scn.nextLine();
		System.out.println("Chuoi dao nguoc la: "+ nc.chuoi(x));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
