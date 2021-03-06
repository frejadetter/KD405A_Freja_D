import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouse;
	private int randomYear;
	private int randomSize;
	private Random random = new Random();
	
	private ArrayList<House> houseArmy = new ArrayList<House>();
	private JTextField textField;
	
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 27, 404, 224);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		textArea.append("UPPGIFT 1.2"+"\n");
		
		House house1 = new House(1920,500);
		House house2 = new House(2000,900);
		House house3 = new House(1700,100);
		
		
		
		
		System.out.println("Ett hus byggt "  +  house1.getYearBuilt()+ " som är " + house1.getSize()+ " stort");
		System.out.println("Ett hus byggt "  +  house2.getYearBuilt()+ " som är " + house2.getSize()+ " stort");
		System.out.println("Ett hus byggt "  +  house3.getYearBuilt()+ " som är " + house3.getSize()+ " stort");
		
		textArea.append("Ett hus byggt "  +  house1.getYearBuilt()+ " som är " + house1.getSize()+ " stort" +"\n");
		textArea.append("Ett hus byggt "  +  house2.getYearBuilt()+ " som är " + house2.getSize()+ " stort"+"\n");
		textArea.append("Ett hus byggt "  +  house3.getYearBuilt()+ " som är " + house3.getSize()+ " stort"+"\n");
		
		textArea.append("\n");
		textArea.append("UPPGIFT 1.3"+"\n");
		
	myHouse = new House[10];
		
		myHouse[0] = new House(1900,980);
		myHouse[1] = new House(2005,400);
		myHouse[2] = new House(1840,500);
		myHouse[3] = new House(1890,900);
		myHouse[4] = new House(2006,800);
		myHouse[5] = new House(1985,560);
		myHouse[6] = new House(1934,980);
		myHouse[7] = new House(2003,700);
		myHouse[8] = new House(1940,700);
		myHouse[9] = new House(1813,590);
		
		for(int i = 0; i < 10; i++){
			textArea.append("Ett hus byggt "+ myHouse[i].getYearBuilt()+ " som är " + myHouse[i].getSize()+ " stort" +"\n");
		}
	
		textArea.append("\n");
		textArea.append("UPPGIFT 1.4"+"\n");
		
		for(int i=0; i < 100; i++){
			

			randomYear = random.nextInt(House.getMaxYear() - House.getMinYear() + 1) + House.getMinYear();
			randomSize = random.nextInt(House.getMaxSize() - House.getMinSize() + 1) + House.getMinSize();
			
			houseArmy.add(new House(randomYear, randomSize));
			
			System.out.println(houseArmy.get(i).getYearBuilt() + "\t" + houseArmy.get(i).getSize());
			textArea.append("House " + (i+1) + " is built " + houseArmy.get(i).getYearBuilt() + " and is " + houseArmy.get(i).getSize() + " kvm" + "\n");
			
		}
		
	 
		
	}

}
