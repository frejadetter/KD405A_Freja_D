import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class AnimalGUI extends JFrame {
	
	private JTextArea textArea;
	
	private ArrayList <Animals> allAnimals = new ArrayList <Animals>();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 47, 602, 354);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		scrollPane.setViewportView(textArea_1);
		
		
		allAnimals.add(new Snake("LaGuerta Maria", false));
		allAnimals.add(new Dog("ChiChi Angel", "Dogilicous", 30, true)); 
		allAnimals.add(new Cat("Rodriquez Pin", 4, 9));
		allAnimals.add(new Snake("RÜFÜFUS Du Sol", true));
		allAnimals.add(new Dog("José Gonzalez", 20, false));
		allAnimals.add(new Snake("Batista Quinn", true));
		allAnimals.add(new Cat("Phillipé Stark",10, 9));
		allAnimals.add(new Dog("Simone Lorch", 3, true));

		
		for(int i = 0; i < allAnimals.size(); i++){
			textArea_1.append(allAnimals.get(i).getInfo() + "\n");
		}
		
		
		 
		JLabel lblNewLabel = new JLabel("ANIMAL STORE");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Avenir", Font.PLAIN, 40));
		lblNewLabel.setBounds(6, 0, 608, 45);
		contentPane.add(lblNewLabel);
	}
}