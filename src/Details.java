import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.io.*;
import javax.swing.JScrollPane;

public class Details extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea_1;
	
	public Details() {
		super("Flight Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 280);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea_1 = new JTextArea();
	    textArea_1.setEditable(false);
	    
	    JScrollPane scrollPane = new JScrollPane(textArea_1);
	    scrollPane.setBounds(0, 0, 280, 250);
	    contentPane.add(scrollPane);
		
		
		try {
		show_detailes();
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
	
	}
	
	
	private void show_detailes() throws FileNotFoundException{
		File csv = new File("Flights.csv");
		Scanner reader = new Scanner(csv);
		
		while(reader.hasNext()) 
		{
			String row_information =  reader.nextLine();
			String col[] = row_information.split(",");
			
		
			if(col[6].equals("MEX")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}

			else if(col[6].equals("DFW")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("YYZ")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("JFK")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("GRU")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("ARN")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("DUB")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("BCL")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("AMS")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("SVO")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("LIS")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("MAD")) 
			{
			
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("FCO")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("ATH")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("CDG")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("RAK")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("CAI")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("DXB")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("LOS")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("JNB")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("DEL")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("BKK")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("HKG")) 
			{
				
				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			
			else if(col[6].equals("HND")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}
			else if(col[6].equals("SYD")) 
			{

				textArea_1.append(" "+col[1] +" "+col[9]+" "+col[8]+" "+col[10]+"\n");
			
			}

		}
		reader.close();
	
		
	}
}
