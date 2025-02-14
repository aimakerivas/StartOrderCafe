package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.porder.PorderMainJframeUI;
//import controller.porder.PorderMainJframeUI;
import model.Member;
import util.Tool;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginSuccessJframeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Member member=(Member)Tool.read("member.txt");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessJframeUI frame = new LoginSuccessJframeUI();
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
	public LoginSuccessJframeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(63, 38, 333, 161);
		contentPane.add(panel);
		
		JLabel lbltej = new JLabel("登入成功..");
		lbltej.setHorizontalAlignment(SwingConstants.CENTER);
		lbltej.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lbltej.setBounds(105, 25, 127, 29);
		panel.add(lbltej);
		
		JButton btnNewButton = new JButton("訂購登入");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PorderMainJframeUI pordermainjframe=new PorderMainJframeUI();
				pordermainjframe.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(105, 115, 117, 29);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel .setText(member.getName()+"  歡迎您!");
		lblNewLabel.setBounds(87, 66, 164, 29);
		panel.add(lblNewLabel);
	}

}
