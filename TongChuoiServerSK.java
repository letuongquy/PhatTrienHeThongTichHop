package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.sun.corba.se.spi.activation.Server;

public class TongChuoiServerSK {
public static void main(String[] args) {
	System.out.println("Server....");
	try {
		ServerSocket server=new ServerSocket(8888);
		Socket socket=server.accept();
		
		Scanner input=new Scanner(socket.getInputStream());
		PrintStream output=new PrintStream(socket.getOutputStream());
		
		int s=0;
		while(true) {
			int a=input.nextInt();
			s=s+a;
			if(a==0) {
				output.println(s);
				break;
			}
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
