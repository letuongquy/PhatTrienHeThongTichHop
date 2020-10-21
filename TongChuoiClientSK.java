package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TongChuoiClientSK {
public static void main(String[] args) {
	System.out.println("Client.....");
	try {
		Socket socket= new Socket("localhost",8888);
		
		Scanner input=new Scanner(socket.getInputStream());
		PrintStream output= new PrintStream(socket.getOutputStream());
		
		Scanner scn=new Scanner(System.in);

		System.out.println("Nhap phan tu: ");
		while(true) {
			int a=scn.nextInt();
			output.println(a);
			if(a==0) {
				int s=input.nextInt();
				System.out.println("Ket Qua: "+s);
				break;
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
