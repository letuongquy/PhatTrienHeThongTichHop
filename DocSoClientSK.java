package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class DocSoClientSK {
public static void main(String[] args) {
	System.out.println("Client....");
	try {
		Socket socket= new Socket("localhost",7788);
		Scanner input= new Scanner(socket.getInputStream());
		PrintStream output= new PrintStream(socket.getOutputStream());
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Nhap so can doc: ");
		
		while(true) {
			String s=scn.nextLine();
			output.println(s);
			if(s.equals(".")) {
				break;
			}
			String c=input.nextLine();
			System.out.println(c);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
