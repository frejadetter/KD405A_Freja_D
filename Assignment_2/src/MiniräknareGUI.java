import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniräknareGUI extends JFrame {

	private JPanel contentPane;
private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniräknareGUI frame = new MiniräknareGUI();
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
	public MiniräknareGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Miniräknare minMiniräknare = new Miniräknare();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 21, 214, 50);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.plus();
				textArea.append("+");
			}
		});
		btnNewButton.setBounds(20, 83, 40, 43);
		contentPane.add(btnNewButton);
		
		
		
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.minus();
				textArea.append("-");
			}
		});
		button.setBounds(60, 83, 40, 43);
		contentPane.add(button);
		
		
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.mult();
				textArea.append("x");
			}
		});
		btnX.setBounds(102, 83, 40, 43);
		contentPane.add(btnX);
		
			
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(4);
				textArea.append("4");
			}
		});
		button_3.setBounds(20, 200, 61, 43);
		contentPane.add(button_3);
		
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(1);
				textArea.append("1");
			}
		});
		
		button_4.setBounds(20, 255, 61, 43);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(0);
				textArea.append("0");
			}
		});
		button_5.setBounds(20, 310, 61, 43);
		contentPane.add(button_5);
		
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(8);
				textArea.append("8");
			}
		});
		button_6.setBounds(95, 145, 61, 43);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(5);
				textArea.append("5");
			}
		});
		button_7.setBounds(95, 200, 61, 43);
		contentPane.add(button_7);
		
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(2);
				textArea.append("2");
			}
		});
		button_8.setBounds(95, 255, 61, 43);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(9);
				textArea.append("9");
			}
		});
		button_9.setBounds(168, 145, 61, 43);
		contentPane.add(button_9);
		
		
		JButton button_10 = new JButton("6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(6);
				textArea.append("6");
			}
		});
		button_10.setBounds(168, 200, 61, 43);
		contentPane.add(button_10);
		
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(3);
				textArea.append("3");
			}
		});
		button_11.setBounds(168, 255, 61, 43);
		contentPane.add(button_11);
		
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.equals();
				int i = minMiniräknare.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		button_12.setBounds(168, 310, 61, 43);
		contentPane.add(button_12);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minMiniräknare.numberButtonPressed(7);
				textArea.append("7");
			}
		});
		button_1.setBounds(20, 145, 61, 43);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("/");
				minMiniräknare.divide();
				
			}
		});
		button_2.setBounds(145, 83, 40, 43);
		contentPane.add(button_2);
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(".");
			}
		});
		button_13.setBounds(95, 310, 61, 43);
		contentPane.add(button_13);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				minMiniräknare.clear();
			}
		});
		btnAc.setBounds(194, 83, 40, 43);
		contentPane.add(btnAc);
		
	}
}
