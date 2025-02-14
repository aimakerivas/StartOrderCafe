package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import javax.swing.JTextArea;

public class RegisterJframeUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	//private JTextField password;
	private JPasswordField passwordField ;
	private JTextField email;
	private JTextField address;
	private JTextField phone;
	private JTextField mobile;
	private JTextField birthdate;
	//private JTextField createdate;
	private JTextArea regrexOutput;
	private LocalDateTime seminarStart;
	private String formattedDateTime;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterJframeUI frame = new RegisterJframeUI();
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
	public RegisterJframeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(30, 6, 559, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("會員註冊");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(109, 6, 183, 43);
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		panel.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("回登入頁");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginJFrameUI login=new LoginJFrameUI();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(430, 20, 110, 29);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(30, 65, 559, 314);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓 名:");
		lblNewLabel.setBounds(36, 31, 46, 18);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳 號:");
		lblNewLabel_1.setBounds(36, 59, 46, 18);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("密 碼:");
		lblNewLabel_2.setBounds(36, 88, 46, 18);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email :");
		lblNewLabel_3.setBounds(36, 116, 62, 18);
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("地 址:");
		lblNewLabel_4.setBounds(36, 144, 46, 18);
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("市 話:");
		lblNewLabel_5.setBounds(36, 172, 46, 18);
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_1.add(lblNewLabel_5);
		
		name = new JTextField();
		name.setBounds(114, 30, 257, 21);
		name.setColumns(10);
		panel_1.add(name);
		
		username = new JTextField();
		username.setBounds(114, 58, 257, 21);
		username.setColumns(10);
		panel_1.add(username);
		
		username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				regrexOutput.setText("<Username Regrex>:\nLength<31,\n0-9,\na-z,A-Z,\n@_.!#");
				regrexOutput.setForeground(Color.BLUE);
				regrexOutput.setBackground(new Color(237, 218, 185));
			}
			@Override
			public void focusLost(FocusEvent e) {
				regrexOutput.setText("");
				
			}
		}); 
		 
 
		/*
 		passwordField = new JPasswordField();
		//char[] Password = passwordField.getPassword();
		//String Password = passwordField.getPassword().toString();
		passwordField.setBounds(137, 62, 130, 26);
		panel_1.add(passwordField); 
 
		 */
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 87, 257, 21);
		passwordField.setColumns(10);
		panel_1.add(passwordField);
		
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				regrexOutput.setText("<Password Regrex>:\ninput masked,\nlimited 6~30,\nat least:\none letter,\none digit,\nspecial(@_.!#)");
				regrexOutput.setForeground(Color.BLUE);
				regrexOutput.setBackground(new Color(237, 218, 185));
			}
			@Override
			public void focusLost(FocusEvent e) {
				regrexOutput.setText("");
				//regrexOutput.setBackground(Color.YELLOW);
			}
		});
		
//		password = new JTextField();
//		password.setBounds(135, 87, 236, 21);
//		password.setColumns(10);
//		panel_1.add(password);
		
		email = new JTextField();
		email.setBounds(114, 115, 257, 21);
		email.setColumns(10);
		panel_1.add(email);
		
		address = new JTextField();
		address.setBounds(114, 143, 257, 21);
		address.setColumns(10);
		panel_1.add(address);
		
		phone = new JTextField();
		phone.setBounds(114, 171, 257, 21);
		phone.setColumns(10);
		panel_1.add(phone);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                String safeSpecialChars = "@_.!#";
                String usernameRegex = "^[a-zA-Z0-9" + Pattern.quote(safeSpecialChars) + "]{1,30}$";
             	String passwordRegex = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[" + Pattern.quote(safeSpecialChars) + "]).{6,30}$";

                
                //Validation
                if (!Pattern.matches(usernameRegex, username.getText())) {
                	regrexOutput.setText("Invalid Username!");
                	regrexOutput.setForeground(Color.RED);
                    return;
                }
				
                if (!Pattern.matches(passwordRegex, new String(passwordField.getPassword()))) {
                	regrexOutput.setText("Invalid Password!");
                	regrexOutput.setForeground(Color.RED);
                    return;
                } 
                
				String Username=username.getText();
				if(Username.trim().isEmpty()) {
					RegisterErrorJframeUI addmembererror=new RegisterErrorJframeUI("帳號不能空白");
					
					//addmembererror.setErrMsg("帳號不能空白"); 
					addmembererror.setVisible(true);
					//dispose();
				}
				else {	
					if(new MemberServiceImpl().isUsernameBeenUse(Username) )
					{
						RegisterErrorJframeUI addmembererror=new RegisterErrorJframeUI("帳號重複");
						//addmembererror.setErrMsg("帳號不能重複"); 
						addmembererror.setVisible(true);
						//dispose();
					}
					else
					{
						String Name=name.getText();
						//String Username=username.getText();
						//String Password=password.getText();
						
						String Password = new String(passwordField.getPassword());
						//String Password2 = passwordField.getPassword().toString();
						String Email=email.getText();
						String Address=address.getText();
						String Phone=phone.getText();
						String Mobile=mobile.getText();
						String Birthdate=birthdate.getText();
						
						LocalDateTime seminarStart =  LocalDateTime.now();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						String formattedDateTime = seminarStart.format(formatter);
						String Createdate=formattedDateTime;
						
						
						Member member=new Member(Name,Username,Password,Email,Address,Phone,Mobile,Birthdate,Createdate);
						
						new MemberServiceImpl().add(member);
						
						RegisterSuccessJframeUI addmembersuccess=new RegisterSuccessJframeUI();
						addmembersuccess.setVisible(true);
						dispose();
					}
				}
			}
		});
		btnNewButton.setBounds(284, 285, 87, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("行動電話:");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(36, 203, 87, 18);
		panel_1.add(lblNewLabel_3_1);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(114, 202, 257, 21);
		panel_1.add(mobile);
		
		JLabel lblNewLabel_4_1 = new JLabel("生 日:");
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(36, 231, 46, 18);
		panel_1.add(lblNewLabel_4_1);
		
		birthdate = new JTextField();
		birthdate.setColumns(10);
		birthdate.setBounds(114, 230, 257, 21);
		panel_1.add(birthdate);
		
//		JLabel lblNewLabel_5_1 = new JLabel("建立日期:");
//		lblNewLabel_5_1.setFont(new Font("Dialog", Font.BOLD, 15));
//		lblNewLabel_5_1.setBounds(36, 259, 87, 18);
//		panel_1.add(lblNewLabel_5_1);
		
//		createdate = new JTextField();
//		createdate.setEnabled(false);
//		createdate.setFocusable(false);
//		createdate.setColumns(10);
//		createdate.setBounds(114, 258, 257, 21);
		//createdate.setText=LocalDateTime();
		
		//LocalDate flightDate = LocalDate.of(2016, Month.JULY, 3);
		//LocalTime flightTime = LocalTime.of(21, 45);
		//LocalDateTime seminarStart = LocalDateTime.of(flightDate2, flightTime2);
		//LocalDateTime seminarStart =  LocalDateTime.now();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//String formattedDateTime = seminarStart.format(formatter);
		//System.out.println( formattedDateTime);
		//createdate.setText(formattedDateTime);
		//panel_1.add(createdate);
		
		regrexOutput = new JTextArea();
		regrexOutput.setBackground(new Color(237, 218, 185));
		regrexOutput.setEditable(false);
		regrexOutput.setFocusable(false);
		regrexOutput.setBounds(383, 26, 157, 251);
		panel_1.add(regrexOutput);
		
		JLabel lblNewLabel_7 = new JLabel("(*)");
		lblNewLabel_7.setForeground(new Color(255, 38, 0));
		lblNewLabel_7.setBounds(83, 61, 28, 16);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("(*)");
		lblNewLabel_7_1.setForeground(new Color(255, 38, 0));
		lblNewLabel_7_1.setBounds(83, 89, 28, 16);
		panel_1.add(lblNewLabel_7_1);
		
		//顯示時鐘
		JLabel clockLabel = new JLabel("Clock Label");
		clockLabel.setBounds(6, 289, 177, 16);
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
		
	}
}
