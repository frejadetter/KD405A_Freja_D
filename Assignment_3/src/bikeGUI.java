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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JScrollPane;

public class bikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textSize;
	private JTextField textColor;
	private JTextField textPrice;
	private JTextField txtSize;
	private JTextField txtColor;
	private JTextField txtPrice;
	private JScrollPane scrollPane;

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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 62, 392, 111);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
		textArea.setForeground(Color.GRAY);
		textArea.setFont(new Font("Avenir", Font.PLAIN, 15));

		textSize = new JTextField();
		textSize.setBounds(112, 185, 147, 29);
		contentPane.add(textSize);
		textSize.setColumns(10);

		textColor = new JTextField();
		textColor.setColumns(10);
		textColor.setBounds(112, 213, 147, 29);
		contentPane.add(textColor);

		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(112, 243, 147, 29);
		contentPane.add(textPrice);

		JButton btnNewButton = new JButton("NEW BIKE");
		btnNewButton.setFont(new Font("Avenir", Font.BOLD, 15));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BikeStore.addBike(textColor.getText(), Integer.parseInt(textSize.getText()),Integer.parseInt(textPrice.getText()));
				textArea.setText(BikeStore.getAllBikes1());
				textColor.setText("");
				textSize.setText("");
				textPrice.setText("");
			}
		});
		btnNewButton.setBounds(271, 185, 155, 87);
		contentPane.add(btnNewButton);

		txtSize = new JTextField();
		txtSize.setForeground(Color.DARK_GRAY);
		txtSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtSize.setFont(new Font("Avenir", Font.BOLD, 14));
		txtSize.setText("SIZE");
		txtSize.setBounds(34, 185, 66, 26);
		contentPane.add(txtSize);
		txtSize.setColumns(10);

		txtColor = new JTextField();
		txtColor.setForeground(Color.DARK_GRAY);
		txtColor.setHorizontalAlignment(SwingConstants.CENTER);
		txtColor.setFont(new Font("Avenir", Font.BOLD, 14));
		txtColor.setText("COLOR");
		txtColor.setColumns(10);
		txtColor.setBounds(34, 213, 66, 28);
		contentPane.add(txtColor);

		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Avenir", Font.PLAIN, 14));
		txtPrice.setForeground(Color.DARK_GRAY);
		txtPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrice.setText("PRICE");
		txtPrice.setColumns(10);
		txtPrice.setBounds(34, 243, 66, 29);
		contentPane.add(txtPrice);

		JLabel lblNewLabel = new JLabel("FREJA'S BIKE STORE");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Avenir", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 16, 438, 45);
		contentPane.add(lblNewLabel);
	}
}
