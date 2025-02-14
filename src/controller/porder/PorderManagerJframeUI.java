package controller.porder;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.impl.PorderServiceImpl;
import util.Tool;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class PorderManagerJframeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField updateId;
	private JTextField username;
	private JTextField americano;
	private JTextField latte;
	private JTextField espresso;
	private JTextField caramelmacchiato;
	private JTextField cappuccino;
	private JTextField mochaccino;
	private JTextField blacktea;
	private JTextField earlgreytea;
	private JTextField matchalatte;
	private JTextField milktealatte;
	private JTextField milk;
	private JTextField deleteId;
	private static PorderServiceImpl porderserviceimpl=new PorderServiceImpl();
	private LocalDateTime seminarStart;
	private String formattedDateTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PorderManagerJframeUI frame = new PorderManagerJframeUI();
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
	public PorderManagerJframeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("訂單管理");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBounds(175, 6, 126, 23);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 37, 444, 355);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 438, 126);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 34, 416, 86);
		panel_2.add(scrollPane);
		JTextArea output = new JTextArea();
		scrollPane.setViewportView(output);
		
		JButton btnNewButton = new JButton("查詢");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//output.setText(porderserviceimpl.printAllPorder());
				output.setText(porderserviceimpl.AllPorder());
			}
		});
		btnNewButton.setBounds(6, 0, 117, 29);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1_1_1 = new JButton("回訂單首頁");
		btnNewButton_1_1_1.setBounds(315, 0, 117, 29);
		panel_2.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.gotoPorderMain();
				dispose();
			}
		});
		

		

		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 130, 438, 143);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("修改");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Id=Integer.parseInt(updateId.getText());
				String Username=username.getText();
				int Americano=Integer.parseInt(americano.getText());
				int Latte=Integer.parseInt(latte.getText());
				int Espresso=Integer.parseInt(espresso.getText());
				int Caramelmacchiato=Integer.parseInt(caramelmacchiato.getText());
				int Cappuccino=Integer.parseInt(cappuccino.getText());
				int Mochaccino=Integer.parseInt(mochaccino.getText());
				int Blacktea=Integer.parseInt(blacktea.getText());
				int Earlgreytea=Integer.parseInt(earlgreytea.getText());
				int Matchalatte=Integer.parseInt(matchalatte.getText());				
				int MilkTeaLatte=Integer.parseInt(milktealatte.getText());
				int Milk=Integer.parseInt(milk.getText());
				
				porderserviceimpl.updatePorder(Username,Americano, Latte, Espresso,Caramelmacchiato,
						Cappuccino,Mochaccino,Blacktea,Earlgreytea,Matchalatte,MilkTeaLatte,Milk,Id);
			}
			
		});

		btnNewButton_1.setBounds(6, 6, 117, 29);
		panel_3.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setBounds(158, 11, 38, 16);
		panel_3.add(lblNewLabel_1);
		
		updateId = new JTextField();
		updateId.setBounds(208, 6, 67, 26);
		panel_3.add(updateId);
		updateId.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("username");
		lblNewLabel_1_1.setBounds(287, 11, 61, 16);
		panel_3.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(360, 6, 67, 26);
		panel_3.add(username);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Americano");
		lblNewLabel_1_1_1.setBounds(6, 44, 90, 16);
		panel_3.add(lblNewLabel_1_1_1);
		
		americano = new JTextField();
		americano.setColumns(10);
		americano.setBounds(79, 39, 67, 26);
		panel_3.add(americano);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Latte");
		lblNewLabel_1_1_1_1.setBounds(148, 44, 61, 16);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		latte = new JTextField();
		latte.setColumns(10);
		latte.setBounds(221, 39, 67, 26);
		panel_3.add(latte);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Espresso");
		lblNewLabel_1_1_1_1_1.setBounds(287, 44, 61, 16);
		panel_3.add(lblNewLabel_1_1_1_1_1);
		
		espresso = new JTextField();
		espresso.setColumns(10);
		espresso.setBounds(360, 39, 67, 26);
		panel_3.add(espresso);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Caramelmacchiato");
		lblNewLabel_1_1_1_2.setBounds(6, 68, 128, 16);
		panel_3.add(lblNewLabel_1_1_1_2);
		
		caramelmacchiato = new JTextField();
		caramelmacchiato.setColumns(10);
		caramelmacchiato.setBounds(137, 63, 33, 26);
		panel_3.add(caramelmacchiato);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Cappuccino");
		lblNewLabel_1_1_1_1_2.setBounds(172, 68, 80, 16);
		panel_3.add(lblNewLabel_1_1_1_1_2);
		
		cappuccino = new JTextField();
		cappuccino.setColumns(10);
		cappuccino.setBounds(250, 63, 38, 26);
		panel_3.add(cappuccino);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mochaccino");
		lblNewLabel_1_1_1_1_1_1.setBounds(287, 68, 90, 16);
		panel_3.add(lblNewLabel_1_1_1_1_1_1);
		
		mochaccino = new JTextField();
		mochaccino.setColumns(10);
		mochaccino.setBounds(389, 63, 38, 26);
		panel_3.add(mochaccino);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Blacktea");
		lblNewLabel_1_1_1_2_1.setBounds(6, 94, 61, 16);
		panel_3.add(lblNewLabel_1_1_1_2_1);
		
		blacktea = new JTextField();
		blacktea.setColumns(10);
		blacktea.setBounds(79, 89, 67, 26);
		panel_3.add(blacktea);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Earlgreytea");
		lblNewLabel_1_1_1_1_2_1.setBounds(172, 94, 80, 16);
		panel_3.add(lblNewLabel_1_1_1_1_2_1);
		
		earlgreytea = new JTextField();
		earlgreytea.setColumns(10);
		earlgreytea.setBounds(250, 89, 38, 26);
		panel_3.add(earlgreytea);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("matchalatte");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(287, 94, 106, 16);
		panel_3.add(lblNewLabel_1_1_1_1_1_1_1);
		
		matchalatte = new JTextField();
		matchalatte.setColumns(10);
		matchalatte.setBounds(389, 89, 38, 26);
		panel_3.add(matchalatte);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("MilkTeaLatte");
		lblNewLabel_1_1_1_2_1_1.setBounds(6, 116, 90, 16);
		panel_3.add(lblNewLabel_1_1_1_2_1_1);
		
		milktealatte = new JTextField();
		milktealatte.setColumns(10);
		milktealatte.setBounds(102, 111, 44, 26);
		panel_3.add(milktealatte);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Milk");
		lblNewLabel_1_1_1_1_2_1_1.setBounds(148, 116, 61, 16);
		panel_3.add(lblNewLabel_1_1_1_1_2_1_1);
		
		milk = new JTextField();
		milk.setColumns(10);
		milk.setBounds(221, 111, 67, 26);
		panel_3.add(milk);
		
		JButton btnNewButton_1_1 = new JButton("刪除");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Id=Integer.parseInt(deleteId.getText());
				porderserviceimpl.deletePorderById(Id);
			}
		});
		btnNewButton_1_1.setBounds(0, 285, 117, 29);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("id");
		lblNewLabel_1_2.setBounds(158, 290, 32, 16);
		panel_1.add(lblNewLabel_1_2);
		
		deleteId = new JTextField();
		deleteId.setColumns(10);
		deleteId.setBounds(202, 285, 67, 26);
		panel_1.add(deleteId);
		
		//顯示時鐘
		JLabel clockLabel = new JLabel("Clock Label");
		clockLabel.setBounds(10, 333, 137, 16);
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		clockLabel.setFont(new Font("Symbol", Font.PLAIN, 13));

        // 使用 Timer 每秒更新一次 JLabel 的時間
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    //String currentTime = LocalTime.now().format(timeFormatter);
                    seminarStart =  LocalDateTime.now();
					formattedDateTime = seminarStart.format(timeFormatter);
					clockLabel.setText(formattedDateTime);
                    //clockLabel.setText(currentTime);
                });
            }
        }, 0, 1000);
		//panelLeft_1.add(clockPanel);
        panel_1.add(clockLabel);
        
        JButton btnNewButton_2 = new JButton("離 開");
        btnNewButton_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton_2.setBounds(321, 320, 117, 29);
        panel_1.add(btnNewButton_2);
		
	}
}
