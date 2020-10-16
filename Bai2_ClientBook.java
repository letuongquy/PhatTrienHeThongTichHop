package bai2RMIn;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import bai5RMI.NhapChuoi;

public class Bai2_ClientBook {
public static void main(String[] args) throws NotBoundException {
	Scanner scn=new Scanner(System.in);
	try {
		Registry reg=LocateRegistry.getRegistry("localhost",9999);
		Bai2_TimBook tb= (Bai2_TimBook) reg.lookup("RMItb");
		System.out.println("Nhap ma sach can tim: ");
	    String ma=scn.nextLine();
	    System.out.println("Thong Tin Sach can tim la: "+tb.timbook(ma));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
