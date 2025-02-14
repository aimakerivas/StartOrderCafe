package controller.porder;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Porder;
import service.impl.PorderServiceImpl;
import util.Tool;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

//import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AddPorderJframUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	private static PorderServiceImpl porderserviceimpl=new PorderServiceImpl();
	private LocalDateTime seminarStart;
	private String formattedDateTime;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPorderJframUI frame = new AddPorderJframUI();
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
	public AddPorderJframUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 0, 600, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("新增訂單");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(215, 6, 138, 30);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1_1 = new JButton("回訂單首頁");
		btnNewButton_1_1_1.setBounds(477, 13, 117, 26);
		panel_1.add(btnNewButton_1_1_1);
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.gotoPorderMain();
				dispose();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 40, 604, 404);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(18, 5, 119, 16);
		panel.add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(147, 0, 130, 26);
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblAmericano = new JLabel("Americano");
		lblAmericano.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmericano.setBounds(18, 31, 119, 16);
		panel.add(lblAmericano);
		
		americano = new JTextField();
		americano.setColumns(10);
		americano.setBounds(147, 26, 130, 26);
		panel.add(americano);
		
		JLabel lblNewLabel_1_1 = new JLabel("Latte");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(18, 60, 119, 16);
		panel.add(lblNewLabel_1_1);
		
		latte = new JTextField();
		latte.setColumns(10);
		latte.setBounds(147, 55, 130, 26);
		panel.add(latte);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Espresso");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(18, 83, 119, 16);
		panel.add(lblNewLabel_1_1_1);
		
		espresso = new JTextField();
		espresso.setColumns(10);
		espresso.setBounds(147, 78, 130, 26);
		panel.add(espresso);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("caramelmacchiato");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(18, 107, 119, 16);
		panel.add(lblNewLabel_1_1_1_1);
		
		caramelmacchiato = new JTextField();
		caramelmacchiato.setColumns(10);
		caramelmacchiato.setBounds(147, 102, 130, 26);
		panel.add(caramelmacchiato);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("cappuccino");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setBounds(18, 133, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		cappuccino = new JTextField();
		cappuccino.setColumns(10);
		cappuccino.setBounds(147, 128, 130, 26);
		panel.add(cappuccino);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("mochaccino");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setBounds(18, 159, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		mochaccino = new JTextField();
		mochaccino.setColumns(10);
		mochaccino.setBounds(147, 154, 130, 26);
		panel.add(mochaccino);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("blacktea");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1.setBounds(18, 188, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		blacktea = new JTextField();
		blacktea.setColumns(10);
		blacktea.setBounds(147, 183, 130, 26);
		panel.add(blacktea);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("earlgreytea");
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(18, 214, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		earlgreytea = new JTextField();
		earlgreytea.setColumns(10);
		earlgreytea.setBounds(147, 209, 130, 26);
		panel.add(earlgreytea);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("matchalatte");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(18, 243, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		matchalatte = new JTextField();
		matchalatte.setColumns(10);
		matchalatte.setBounds(147, 238, 130, 26);
		panel.add(matchalatte);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("milktealatte");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(18, 269, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		milktealatte = new JTextField();
		milktealatte.setColumns(10);
		milktealatte.setBounds(147, 264, 130, 26);
		panel.add(milktealatte);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("milk");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1_1.setBounds(18, 296, 119, 16);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1_1);
		
		milk = new JTextField();
		milk.setColumns(10);
		milk.setBounds(147, 291, 130, 26);
		panel.add(milk);
		
		JButton btnNewButton = new JButton("新增訂單");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Porder porder=new Porder();
				porder.setUsername(username.getText());
				porder.setAmericano(americano.getText().isEmpty()? 0 :Integer.parseInt(americano.getText()));
				porder.setLatte(latte.getText().isEmpty()? 0 :Integer.parseInt(latte.getText()));
				porder.setEspresso(espresso.getText().isEmpty()? 0 :Integer.parseInt(espresso.getText()));
				porder.setCaramelmacchiato(caramelmacchiato.getText().isEmpty()? 0 :Integer.parseInt(caramelmacchiato.getText()));
				porder.setCappuccino(cappuccino.getText().isEmpty()? 0 :Integer.parseInt(cappuccino.getText()));
				porder.setMochaccino(mochaccino.getText().isEmpty()? 0 :Integer.parseInt(mochaccino.getText()));
				porder.setBlacktea(blacktea.getText().isEmpty()? 0 :Integer.parseInt(blacktea.getText()));
				porder.setEarlgreytea(earlgreytea.getText().isEmpty()? 0 :Integer.parseInt(earlgreytea.getText()));
				porder.setMatchalatte(matchalatte.getText().isEmpty()? 0 :Integer.parseInt(matchalatte.getText()));
				porder.setMilktealatte(milktealatte.getText().isEmpty()? 0 :Integer.parseInt(milktealatte.getText()));
				porder.setMilk(milk.getText().isEmpty()? 0 :Integer.parseInt(milk.getText()));
				
				//int Mouse=Integer.parseInt(mouse.getText());
				//System.out.println("Lcd/Ram/Mouse:"+Lcd+",\t"+Ram+",\t"+Mouse);
				
				//Porder p=new Porder(Name,Lcd,Ram,Mouse);
				
				porderserviceimpl.addPorder(porder);
				//PorderServiceImpl().add(porder);
			}
		});
		btnNewButton.setBounds(301, 325, 100, 39);
		panel.add(btnNewButton);
		
		//顯示時鐘
		JLabel clockLabel = new JLabel("Clock Label");
		clockLabel.setBounds(6, 382, 137, 16);
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
        panel.add(clockLabel);
        
        JButton btnNewButton_1 = new JButton("現收/找零");
        btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        btnNewButton_1.setBounds(412, 325, 108, 39);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_1_1_2 = new JButton("列印");
        btnNewButton_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        btnNewButton_1_1_2.setBounds(521, 325, 73, 39);
        panel.add(btnNewButton_1_1_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(317, 5, 277, 312);
        panel.add(panel_3);
        panel_3.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(6, 6, 265, 300);
        panel_3.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
		//panel_2.add(textArea);
	}
}
