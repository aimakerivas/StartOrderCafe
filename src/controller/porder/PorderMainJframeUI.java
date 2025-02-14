package controller.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class PorderMainJframeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderMainJframeUI frame = new PorderMainJframeUI();
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
	public PorderMainJframeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(33, 24, 373, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("新增訂單");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				AddPorderJframUI addPorderJframUI=new AddPorderJframUI();
//				addPorderJframUI.setVisible(true);
		        CoffeeMenuApp6 coffeeMenuApp6=new CoffeeMenuApp6();
		        coffeeMenuApp6.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(125, 48, 150, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("訂單管理");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PorderManagerJframeUI porderManagerJframeUI =new PorderManagerJframeUI();
				porderManagerJframeUI .setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(125, 104, 150, 50);
		panel.add(btnNewButton_1);
	}
}
