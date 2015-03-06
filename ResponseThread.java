import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ResponseThread extends Thread

{
	private Socket s;
	private Socket s2; 

	public ResponseThread(Socket s)
	{
		this.s = s;
	}
	public void addClient(Socket s)
	{
		this.s2 = s; 
		this.s2 = null; 
	}
	public void run()
	{
		
	}
}
