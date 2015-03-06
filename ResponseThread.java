import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ResponseThread extends Thread

{
	private Socket s;
	

	public ResponseThread(Socket s)
	{
		this.s = s;
	}
	
	public void run()
	{
		try
		{
			Scanner input = new Scanner(this.s.getInputStream());
			PrintWriter output = new PrintWriter(this.s.getOutputStream());
			while(true)
			{
			
			String req = input.nextLine();
			output.println(req);
			System.out.println(req);
			}
		} 
		catch(Exception e)
		{
			
		}
		
	}
}
