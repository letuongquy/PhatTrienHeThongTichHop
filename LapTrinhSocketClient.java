package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class LapTrinhSocketClient {
	public static void main(String[] args) {
		try {
			Socket client= new Socket("LocalHost",9540);
			System.out.println("Client da duoc khoi tao");
			
			Scanner scn=new Scanner(client.getInputStream());
			PrintStream p= new PrintStream(client.getOutputStream());
			
			System.out.println("Sever"+scn.nextLine());
			
			Scanner scan = new Scanner(System.in);
			String ten=scan.nextLine();
			
			p.println(ten);
			
			System.out.println("Sever:"+scn.nextLine());
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
