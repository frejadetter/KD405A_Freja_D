import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class assignment1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPetterAlzar;
	private JTextField textField;
	private JTextField txtLngavgen;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtStarkepettermsncom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignment1 frame = new assignment1();
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
	public assignment1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 77, 120, 178);
		contentPane.add(scrollPane);
		
		JTextPane txtpnAnnaAndersonGustav = new JTextPane();
		txtpnAnnaAndersonGustav.setFont(new Font("SansSerif", Font.PLAIN, 10));
		scrollPane.setViewportView(txtpnAnnaAndersonGustav);
		txtpnAnnaAndersonGustav.setText("Anna Anderson\nGustav Josefson\nPetter Alzar \nJohanna Trädgårdar\nAnna Anderson\nGustav Josefson\nPetter Alzar \nJohanna Trädgårdar\nAnna Anderson\nGustav Josefson\nPetter Alzar \nJohanna Trädgårdar\nAnna Anderson\nGustav Josefson\nPetter Alzar \nJohanna Trädgårdar\nAnna Anderson\n");
		
		JLabel lblNewzjhc = new JLabel("ADRESS");
		lblNewzjhc.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewzjhc.setBounds(138, 144, 83, 24);
		contentPane.add(lblNewzjhc);
		
		JLabel lblNamn = new JLabel("NAMN");
		lblNamn.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNamn.setBounds(138, 81, 83, 24);
		contentPane.add(lblNamn);
		
		txtPetterAlzar = new JTextField();
		txtPetterAlzar.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtPetterAlzar.setText("Petter Alzar");
		txtPetterAlzar.setBounds(208, 80, 110, 26);
		contentPane.add(txtPetterAlzar);
		txtPetterAlzar.setColumns(10);
		
		JLabel label = new JLabel("PERSON NR.");
		label.setFont(new Font("SansSerif", Font.BOLD, 11));
		label.setBounds(138, 117, 83, 24);
		contentPane.add(label);
		
		JLabel lblPostNr = new JLabel("POST AD.");
		lblPostNr.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblPostNr.setBounds(138, 165, 83, 24);
		contentPane.add(lblPostNr);
		
		JLabel lblMobilNr = new JLabel("MOBIL NR.");
		lblMobilNr.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblMobilNr.setBounds(138, 195, 83, 24);
		contentPane.add(lblMobilNr);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblEmail.setBounds(138, 231, 83, 24);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setText("790910-3342");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(208, 116, 110, 26);
		contentPane.add(textField);
		
		txtLngavgen = new JTextField();
		txtLngavgen.setText("Långavägen 4");
		txtLngavgen.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtLngavgen.setColumns(10);
		txtLngavgen.setBounds(208, 143, 110, 26);
		contentPane.add(txtLngavgen);
		
		textField_1 = new JTextField();
		textField_1.setText("198 23");
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(208, 164, 110, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0739456575");
		textField_2.setFont(new Font("SansSerif", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(208, 194, 110, 26);
		contentPane.add(textField_2);
		
		txtStarkepettermsncom = new JTextField();
		txtStarkepettermsncom.setText("starkepetter@msn.com");
		txtStarkepettermsncom.setFont(new Font("SansSerif", Font.PLAIN, 11));
		txtStarkepettermsncom.setColumns(10);
		txtStarkepettermsncom.setBounds(181, 229, 137, 26);
		contentPane.add(txtStarkepettermsncom);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/faeson/Documents/Processing/KD405A_Freja_D/Assignment_1/src/Körkortsbild.jpg"));
		lblNewLabel.setBounds(330, 101, 100, 118);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(6, 0, 516, 44);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/faeson/Documents/Processing/KD405A_Freja_D/Assignment_1/src/Skärmavbild 2016-01-21 kl. 14.43.02.png"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setBounds(6, 47, 450, 22);
		contentPane.add(menuBar);
		
		JMenu mnAkriv = new JMenu("ARKIV");
		mnAkriv.setFont(new Font("SansSerif", Font.BOLD, 12));
		menuBar.add(mnAkriv);
		
		JCheckBoxMenuItem chckbxmntmSkrivUt = new JCheckBoxMenuItem("Skriv ut");
		chckbxmntmSkrivUt.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnAkriv.add(chckbxmntmSkrivUt);
		
		JCheckBoxMenuItem chckbxmntmAvsluta = new JCheckBoxMenuItem("Avsluta");
		chckbxmntmAvsluta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnAkriv.add(chckbxmntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("MEDLEMMAR");
		mnMedlemmar.setFont(new Font("SansSerif", Font.BOLD, 12));
		menuBar.add(mnMedlemmar);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		chckbxmntmNyMedlem.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnMedlemmar.add(chckbxmntmNyMedlem);
		
		JCheckBoxMenuItem chckbxmntmAllaMedlemmar = new JCheckBoxMenuItem("Alla medlemmar");
		chckbxmntmAllaMedlemmar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnMedlemmar.add(chckbxmntmAllaMedlemmar);
		
		JCheckBoxMenuItem chckbxmntmHittaMedlem = new JCheckBoxMenuItem("Hitta medlem");
		chckbxmntmHittaMedlem.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnMedlemmar.add(chckbxmntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("HJÄLP");
		mnHjlp.setFont(new Font("SansSerif", Font.BOLD, 12));
		menuBar.add(mnHjlp);
		
		JCheckBoxMenuItem chckbxmntmHjlp = new JCheckBoxMenuItem("Hjälp");
		chckbxmntmHjlp.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnHjlp.add(chckbxmntmHjlp);
		
		JCheckBoxMenuItem chckbxmntmOmProgrammet = new JCheckBoxMenuItem("Om programmet");
		chckbxmntmOmProgrammet.setFont(new Font("SansSerif", Font.PLAIN, 12));
		mnHjlp.add(chckbxmntmOmProgrammet);
		
		JButton btnNewButton = new JButton("Spara");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnNewButton.setBounds(370, 231, 60, 24);
		contentPane.add(btnNewButton);
	}
}
