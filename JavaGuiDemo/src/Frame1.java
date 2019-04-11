import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JButton btnNewButton;
	private JButton btnMinus;
	private JTextField textFieldAns;
	private JLabel lblTheAsnwerIs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Dialog", Font.PLAIN, 18));
		textFieldNum1.setBounds(36, 36, 177, 47);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Dialog", Font.PLAIN, 18));
		textFieldNum2.setBounds(225, 36, 191, 47);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
			}
		});
		btnNewButton.setBounds(73, 116, 114, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnMinus = new JButton("Minus");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Please enter valid number");
					}
			
			}
		});
		btnMinus.setBounds(267, 116, 114, 25);
		frame.getContentPane().add(btnMinus);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Dialog", Font.PLAIN, 18));
		textFieldAns.setBounds(225, 202, 191, 40);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		lblTheAsnwerIs = new JLabel("The answer is:");
		lblTheAsnwerIs.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTheAsnwerIs.setBounds(73, 214, 114, 15);
		frame.getContentPane().add(lblTheAsnwerIs);
	}
}
