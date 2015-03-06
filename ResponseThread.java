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
	{// wait for second connection
		
		while(this.s2 == null)
		{
			System.out.println("Waiting for the second connection"); 
			
		}
		try
		{
			Scanner sinput = new Scanner(this.s.getInputStream());
			Scanner s2input = new Scanner(this.s2.getInputStream()); 
			PrintWriter soutput = new PrintWriter(this.s.getOutputStream(), true);
			PrintWriter s2output = new PrintWriter(this.s2.getOutputStream(), true);
			soutput.println("Connected");
			s2output.println("Connected");
			
			while(true)
			{
			soutput.println("Your turn: ");
			s2output.println("From s:" + sinput.nextLine());
			s2output.println("Your turn");
			soutput.println(s2input.nextLine());
			s2output.println("From s2:" + s2input.nextLine());
			}
		} 
		catch(Exception e)
		{
			
		}
		
	}
}
