package controller.member;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;
import util.Tool;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class LoginJFrameUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	//private JTextField password;
	private JPasswordField passwordField;
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
					LoginJFrameUI frame = new LoginJFrameUI();
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
	public LoginJFrameUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 6, 410, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("咖啡點餐系統");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBounds(152, 18, 225, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LoginJFrameUI.class.getResource("/icon/Mono-Coffee.48.png")));
		lblNewLabel_1.setBounds(79, 6, 55, 42);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 60, 410, 206);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAccount = new JLabel("帳 號:");
		lblAccount.setBounds(25, 25, 61, 16);
		lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblAccount);
		
		username = new JTextField();
		username.setBounds(87, 20, 130, 26);
		
		username.setColumns(10);
		panel_1.add(username);
		username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				regrexOutput.setText(" <Username Regrex>:\n 0-9,\n a-z,A-Z,\n @_.!#,\n Length<31");
				regrexOutput.setForeground(Color.BLUE);
				regrexOutput.setBackground(new Color(237, 218, 185));
			}
			@Override
			public void focusLost(FocusEvent e) {
				regrexOutput.setText("");
				
			}
		}); 
		 
		 
		
		
		JLabel lblNewLabel_1_1 = new JLabel("密 碼:");
		lblNewLabel_1_1.setBounds(25, 63, 61, 16);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(87, 58, 130, 26);
		panel_1.add(passwordField);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				regrexOutput.setText(" <Password Regrex>:\n input masked\n at least:\n one letter,\n one digit,\n one special(@_.!#)\n limited 6~30");
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
//		password.setColumns(10);
//		password.setBounds(137, 62, 130, 26);
//		panel_1.add(password);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setBounds(82, 105, 117, 43);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Username=username.getText();
				//String Password=password.getText();
				String Password = new String(passwordField.getPassword());
				//String Password2=passwordField.getPassword().toString();
				System.out.println("passwordField.getPassword():"+Password);
				//System.out.println("passwordField.getPassword():"+Password2);
				
                String safeSpecialChars = "@_.!#";
                String usernameRegex = "^[a-zA-Z0-9" + Pattern.quote(safeSpecialChars) + "]{1,30}$";
             	String passwordRegex = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[" + Pattern.quote(safeSpecialChars) + "]).{6,30}$";

                
                //Validation
                if (!Pattern.matches(usernameRegex, Username)) {
                	regrexOutput.setText("Invalid Username!");
                	regrexOutput.setForeground(Color.RED);
                    return;
                }
				
                if (!Pattern.matches(passwordRegex, Password)) {
                	regrexOutput.setText("Invalid Password!");
                	regrexOutput.setForeground(Color.RED);
                    return;
                } 
                //regrexOutput.setText("Validation Success!");
                //regrexOutput.setForeground(Color.GREEN);
                
				
				
				Member member=new MemberServiceImpl().login(Username, Password);
				
				if(member!=null)
				{
					Tool.save(member, "member.txt");
					LoginSuccessJframeUI loginsuccess=new LoginSuccessJframeUI();
					loginsuccess.setVisible(true);
					
					dispose();
				}
				else
				{
					LoginErrorJframeUI loginerror=new LoginErrorJframeUI();
					loginerror.setVisible(true);
					dispose();
				}
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnRegister = new JButton("註冊新帳號");
		btnRegister.setBounds(254, 160, 130, 40);
		btnRegister.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegisterJframeUI addmember=new RegisterJframeUI();
				addmember.setVisible(true);
				dispose();
			}
		});
		panel_1.add(btnRegister);
		
		regrexOutput = new JTextArea();
		regrexOutput.setBounds(262, 25, 142, 123);
		regrexOutput.setBackground(new Color(237, 218, 185));
		regrexOutput.setEditable(false);
		regrexOutput.setFocusable(false);
		panel_1.add(regrexOutput);
		
		//顯示時鐘
		JLabel clockLabel = new JLabel("Clock Label");
		clockLabel.setBounds(6, 184, 177, 16);
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
