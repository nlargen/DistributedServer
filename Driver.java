import java.net.ServerSocket;
import java.net.Socket;


public class Driver {

	public static void main(String[] goat) throws Exception
	{
		//Just added this line
		ServerSocket ss = new ServerSocket(1234);
		int count = 0;
		ResponseThread rt = null; 
		for(int i = 0; i < 2; i++)
		{
			System.out.println("Waiting...");
			Socket connection = ss.accept();
			if(rt == null)
			{
			 rt = new ResponseThread(connection);
			rt.start();
			}
			else 
			{
				rt.addClient(connection); 
			}
			System.out.println("connected!");
		
			
		}

	}

}
