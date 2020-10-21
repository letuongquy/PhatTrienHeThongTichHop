package baitap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServerSK {
public static void main(String[] args) {
	System.out.println("Day la Server");
	try {
//		ServerSocket server=new ServerSocket(9999);
//		Socket socket=server.accept();
//		
//		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
//		System.out.println("Chat Server");
//		String c1=dataInputStream.readUTF();
//		
//		System.out.println(c1);
//		
//		dataOutputStream.writeUTF(new Scanner(System.in).nextLine());
//		dataOutputStream.flush();
		
		ServerSocket server= new ServerSocket(9998);
		Socket socket=server.accept();
		
		Scanner input= new Scanner(socket.getInputStream());
		PrintStream output=new PrintStream(socket.getOutputStream());
		
		System.out.println("Chat Server");
//		String chat1=input.nextLine();
//		System.out.println(chat1);
//		
//		Scanner scn=new Scanner(System.in);
//		String chat2=scn.nextLine();
//		output.println(chat2);
		
		while(true) {
			String chat1=input.nextLine();
			System.out.println("Client: "+chat1);
			if(chat1.equals(".")) {
				break;
			}
			Scanner scn=new Scanner(System.in);
			String chat2=scn.nextLine();
			output.println(chat2);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
