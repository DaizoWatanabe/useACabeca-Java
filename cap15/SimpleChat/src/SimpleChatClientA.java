/*import java.awt.*;                  // VERSÃO SEM THREAD (APRIMORADA ANEXADA)
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class SimpleChatClientA {
	
	JTextField outgoing;
	//JTextArea income;
	PrintWriter writer;
	Socket sock;
	
	public void go() {
		
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		JPanel textPanel = new JPanel();
		
		//income = new JTextArea(15,30);
				
		outgoing = new JTextField(20);
		
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		
		//textPanel.add(income);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
			
		//mainPanel.setBorder(BorderFactory.createEmptyBorder(70,50,70,50));
		//mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		
		frame.getContentPane().add(BorderLayout.NORTH, textPanel);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		
		setUpNetworking();
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
		
	}
	
	private void setUpNetworking() {
		
		try {			
			sock = new Socket("127.0.0.1", 5000);			
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("networking established");
					
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public class SendButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			outgoing.setText("");
			outgoing.requestFocus();
		}
		
	}
	
	public static void main(String[] args) {
		SimpleChatClientA sc = new SimpleChatClientA();
		sc.go();
	}
}
*/