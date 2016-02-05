import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textSize;
	private JTextField textColor;
	private JTextField textPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bikeGUI frame = new bikeGUI();
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
	public bikeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(24, 27, 177, 218);
		contentPane.add(textArea);
		
		textSize = new JTextField();
		textSize.setBounds(213, 27, 168, 42);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		
		textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(213, 88, 168, 42);
		contentPane.add(textColor);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(213, 158, 168, 42);
		contentPane.add(textPrice);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BikeStore.addBike(textColor.getText(), Integer.parseInt(textSize.getText()), Integer.parseInt(textPrice.getText()));
			}
		});
		btnNewButton.setBounds(244, 216, 117, 29);
		contentPane.add(btnNewButton);
	}
}
