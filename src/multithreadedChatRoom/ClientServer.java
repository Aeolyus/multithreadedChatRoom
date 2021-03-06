package multithreadedChatRoom;

import javax.swing.*;

//Class to precise who is connected : Client or Server
public class ClientServer {

	
	public static void main(String [] args){
		
		Object[] selectioValues = {"Client", "Server"};
		String initialSection = "Client";
		
		Object selection = JOptionPane.showInputDialog(null, "Login as : ", "Chat Room", JOptionPane.QUESTION_MESSAGE, null, selectioValues, initialSection);
		if(selection.equals("Server")){
                   String[] arguments = new String[] {};
			new MultiThreadChatServerSync();
			MultiThreadChatServerSync.main(arguments);
		}else if(selection.equals("Client")){
			String IPServer = JOptionPane.showInputDialog("Enter the Server ip adress");
                        String[] arguments = new String[] {IPServer};
			new ChatClient();
			ChatClient.main(arguments);
		}
		
	}

}
