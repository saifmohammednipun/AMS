import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.JScrollBar;


public class FlightGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		FlightGUI frame = new FlightGUI();
		frame.setVisible(true);
	}

	
	public FlightGUI() {
		setResizable(false);
		setTitle("Flight Departure Map");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1200, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DFW");
		lblNewLabel.addMouseListener(new Controller());
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(116, 154, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YYZ");
		lblNewLabel_1.addMouseListener(new Controller());
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(182, 106, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("JFK");
		lblNewLabel_2.addMouseListener(new Controller());
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(182, 134, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GRU");
		lblNewLabel_3.addMouseListener(new Controller());
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(252, 367, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ARN");
		lblNewLabel_4.addMouseListener(new Controller());
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(459, 52, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DUB");
		lblNewLabel_5.addMouseListener(new Controller());
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setBounds(377, 86, 61, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("BCL");
		lblNewLabel_6.addMouseListener(new Controller());
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setBounds(416, 86, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("AMS");
		lblNewLabel_7.addMouseListener(new Controller());
		lblNewLabel_7.setForeground(Color.BLUE);
		lblNewLabel_7.setBounds(444, 86, 61, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("SVO");
		lblNewLabel_8.addMouseListener(new Controller());
		lblNewLabel_8.setForeground(Color.BLUE);
		lblNewLabel_8.setBounds(526, 86, 61, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("CDG");
		lblNewLabel_9.addMouseListener(new Controller());
		lblNewLabel_9.setForeground(Color.BLUE);
		lblNewLabel_9.setBounds(426, 106, 61, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("LIS");
		lblNewLabel_10.addMouseListener(new Controller());
		lblNewLabel_10.setForeground(Color.BLUE);
		lblNewLabel_10.setBounds(391, 134, 47, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("MAD");
		lblNewLabel_11.addMouseListener(new Controller());
		lblNewLabel_11.setForeground(Color.BLUE);
		lblNewLabel_11.setBounds(419, 134, 47, 16);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("FCO");
		lblNewLabel_12.addMouseListener(new Controller());
		lblNewLabel_12.setForeground(Color.BLUE);
		lblNewLabel_12.setBounds(458, 134, 47, 16);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("ATH");
		lblNewLabel_13.addMouseListener(new Controller());
		lblNewLabel_13.setForeground(Color.BLUE);
		lblNewLabel_13.setBounds(488, 154, 61, 16);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("RAK");
		lblNewLabel_14.addMouseListener(new Controller());
		lblNewLabel_14.setForeground(Color.BLUE);
		lblNewLabel_14.setBounds(391, 154, 61, 16);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("CAI");
		lblNewLabel_15.addMouseListener(new Controller());
		lblNewLabel_15.setForeground(Color.BLUE);
		lblNewLabel_15.setBounds(498, 174, 61, 16);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("LOS");
		lblNewLabel_16.addMouseListener(new Controller());
		lblNewLabel_16.setForeground(Color.BLUE);
		lblNewLabel_16.setBounds(426, 226, 61, 16);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("JNB");
		lblNewLabel_17.addMouseListener(new Controller());
		lblNewLabel_17.setForeground(Color.BLUE);
		lblNewLabel_17.setBounds(498, 367, 61, 16);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("DXB");
		lblNewLabel_18.addMouseListener(new Controller());
		lblNewLabel_18.setForeground(Color.BLUE);
		lblNewLabel_18.setBounds(567, 190, 61, 16);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("DEL");
		lblNewLabel_19.addMouseListener(new Controller());
		lblNewLabel_19.setForeground(Color.BLUE);
		lblNewLabel_19.setBounds(648, 174, 61, 16);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("BKK");
		lblNewLabel_20.addMouseListener(new Controller());
		lblNewLabel_20.setForeground(Color.BLUE);
		lblNewLabel_20.setBounds(734, 212, 61, 16);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("HKG");
		lblNewLabel_21.addMouseListener(new Controller());
		lblNewLabel_21.setForeground(Color.BLUE);
		lblNewLabel_21.setBounds(757, 174, 61, 16);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("HND");
		lblNewLabel_22.addMouseListener(new Controller());
		lblNewLabel_22.setForeground(Color.BLUE);
		lblNewLabel_22.setBounds(813, 134, 61, 16);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("SYD");
		lblNewLabel_23.addMouseListener(new Controller());
		lblNewLabel_23.setForeground(Color.BLUE);
		lblNewLabel_23.setBounds(862, 367, 61, 16);
		contentPane.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("MEX");
		lblNewLabel_24.addMouseListener(new Controller());
		lblNewLabel_24.setForeground(Color.BLUE);
		lblNewLabel_24.setBounds(98, 182, 61, 16);
		contentPane.add(lblNewLabel_24);
		
		
		JLabel label1 = new JLabel("Map");
		label1.setIcon(new ImageIcon("map.jpg"));
		label1.setBounds(0, 0, 944, 469);
		contentPane.add(label1);
		
		JLabel lblNewLabel_26 = new JLabel("Delays");
		lblNewLabel_26.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_26.setBounds(956, 0, 236, 27);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_25 = new JLabel();
		lblNewLabel_25.setBounds(956, 37, 236, 433);
		contentPane.add(lblNewLabel_25);
		
		textArea = new JTextArea();
	    textArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(955, 36, 237, 433);
		contentPane.add(scrollPane);
		

	    
		
		try {
		delays();
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
	}
	
	private void delays() throws FileNotFoundException  {
		File csv = new File("Flights.csv");
		Scanner reader = new Scanner(csv);
		
		while(reader.hasNext()) 
		{
			String row_information =  reader.nextLine();
			String col[] = row_information.split(",");
			
			
			textArea.append(" "+col[5] +" "+col[6]+" "+col[8]+" "+col[1]+" "+col[3]+" "+col[2]+"\n");
		}
	}
}
