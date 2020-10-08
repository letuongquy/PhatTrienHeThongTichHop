package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class LapTrinhSocketSever {
    public static void main(String[] args) {
		try {
			ServerSocket sever= new ServerSocket(9540);
			System.out.println("Server da duoc khoi tao");
			
			Socket client=sever.accept();
			System.out.println("Client da ket noi den server");
			
			Scanner scn=new Scanner(client.getInputStream());
			PrintStream p=new PrintStream(client.getOutputStream());
			
			p.println("Hi, Ban ten la gi?");
			
			String ten=scn.nextLine();
			System.out.println("Client"+ten);
			
			p.println("Rat vui duoc tro chuyen voi"+ten);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
