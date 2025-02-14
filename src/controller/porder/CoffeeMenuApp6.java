package controller.porder;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import model.Porder;
import util.Tool;

import service.impl.PorderServiceImpl;

import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CoffeeMenuApp6 extends JFrame{
    private static final long serialVersionUID = 1L;
	private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JLabel totalLabel;
    private HashMap<String, Integer> coffeeOrder;
    private HashMap<String, Integer> coffeePrices;
    
	private LocalDateTime seminarStart;
	private String formattedDateTime;
	private JTextField textField;
	private JTextField payTextField;
	private JTextField return1000TextField;
	private JTextField return500TextField;
	private JTextField return100TextField;
	private JTextField return50TextField;
	private JTextField return10TextField;
	private JTextField return5TextField;
	private JTextField return1TextField;
	private int total;
	private static PorderServiceImpl porderserviceimpl=new PorderServiceImpl();
	private static Porder porder=new Porder("user",0,0,0,0,0,0,0,0,0,0,0);
	private int Americano=0;
	private int Latte=0;
	private int Espresso=0;
	private int Caramelmacchiato=0;
	private int Cappuccino=0;
	private int Mochaccino=0;
	private int Blacktea=0;
	private int Earlgreytea=0;
	private int Matchalatte=0;
	private int Milktealatte=0;
	private int Milk=0;

    public CoffeeMenuApp6() {
        //frame = new JFrame("咖啡點餐系統");
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(662, 500);

        coffeeOrder = new HashMap<>();
        coffeePrices = new HashMap<>();

        // 設定咖啡價格
        coffeePrices.put("美式咖啡", 70);
        coffeePrices.put("經典拿鐵", 100);
        coffeePrices.put("義式濃縮", 130);
        coffeePrices.put("焦糖瑪奇朵", 140);
        coffeePrices.put("卡布奇諾", 130);
        coffeePrices.put("摩卡咖啡", 120);
        coffeePrices.put("16號紅茶", 150);
        coffeePrices.put("皇家伯爵茶", 150);
        coffeePrices.put("瑪奇朵", 110);
        coffeePrices.put("鴛鴦拿鐵", 110);
        coffeePrices.put("芋香拿鐵", 100);
        JPanel firstPanel = new JPanel();
        firstPanel.setBounds(10, 0, 646, 40);
        
        // 左側菜單面板
        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(10, 40, 233, 398);
        leftPanel.setLayout(new GridLayout(5, 1));

        for (String coffee : coffeePrices.keySet()) {
            JButton button = new JButton(coffee);
            button.addActionListener(new CoffeeButtonListener(coffee));
            leftPanel.add(button);
        }

        // 右側表格面板
        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(243, 40, 413, 199);
        tableModel = new DefaultTableModel(new Object[]{"咖啡名稱", "數量", "單價", "合計", "+", "-"}, 0) {
        

			//private static final long serialVersionUID = 1L;

			private static final long serialVersionUID = -6612169201296458677L;

			@Override
            public boolean isCellEditable(int row, int column) {
                return column == 4 || column == 5; // 只允許 "+", "-" 按鈕欄位可點擊
            }
        };
        
                table = new JTable(tableModel);
                table.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer6());
                table.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor6(new JButton("+")));
                
                        table.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer6());
                        table.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor6(new JButton("-")));
                                rightPanel.setLayout(null);
                        
                                JScrollPane scrollPane = new JScrollPane(table);
                                scrollPane.setBounds(0, 0, 410, 198);
                                rightPanel.add(scrollPane);
        frame.getContentPane().setLayout(null);

        // 加入到主視窗
        frame.getContentPane().add(firstPanel);
        firstPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("新增訂單");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblNewLabel.setBounds(211, 6, 136, 28);
        firstPanel.add(lblNewLabel);
		
		JLabel usernameLabel = new JLabel("登入帳號:");
		usernameLabel.setBounds(6, 13, 69, 16);
		firstPanel.add(usernameLabel);
		
		textField = new JTextField();
		textField.setBounds(76, 8, 130, 26);
		firstPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1_1_1 = new JButton("回訂單首頁");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tool.gotoPorderMain();
				frame.dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBounds(523, 14, 117, 26);
		firstPanel.add(btnNewButton_1_1_1);
        frame.getContentPane().add(leftPanel);
        frame.getContentPane().add(rightPanel);
        
                // 右側下方總計區域
                totalLabel = new JLabel("總計: 0 元", SwingConstants.RIGHT);
                totalLabel.setBounds(492, 251, 153, 19);
                frame.getContentPane().add(totalLabel);
                totalLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        JButton btnNewButton = new JButton("新增訂單");
        btnNewButton.setEnabled(true);
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
//        		Americano=coffeeOrder.get("美式咖啡");
//        		Latte=coffeeOrder.get("經典拿鐵");
//        		Espresso=coffeeOrder.get("義式濃縮");
//        		Caramelmacchiato=coffeeOrder.get("焦糖瑪奇朵");
//        		Cappuccino=coffeeOrder.get("卡布奇諾");
//        		Mochaccino= coffeeOrder.get("摩卡咖啡");
//        		Blacktea=coffeeOrder.get("16號紅茶");
//        		Earlgreytea=coffeeOrder.get("皇家伯爵茶");
//        		Matchalatte=coffeeOrder.get("瑪奇朵");
//        		Milktealatte =coffeeOrder.get("鴛鴦拿鐵");
//        		Milk=coffeeOrder.get("芋香拿鐵");
        		//Milk=((coffeeOrder.get("芋香拿鐵"))==null) ? 0 : coffeeOrder.get("芋香拿鐵");
  	          
			  System.out.println("coffeeOrder美式咖啡:"+(coffeeOrder.get("美式咖啡")));
			  System.out.println("coffeeOrder經典拿鐵:"+(coffeeOrder.get("經典拿鐵")));
	          System.out.println("coffeeOrder義式濃縮:"+(coffeeOrder.get("義式濃縮")));
	          System.out.println("coffeeOrder焦糖瑪奇朵:"+(coffeeOrder.get("焦糖瑪奇朵")));
	          System.out.println("coffeeOrder卡布奇諾:"+(coffeeOrder.get("卡布奇諾")));
	          System.out.println("coffeeOrder摩卡咖啡:"+(coffeeOrder.get("摩卡咖啡")));
	          System.out.println("coffeeOrder16號紅茶:"+(coffeeOrder.get("16號紅茶")));
	          System.out.println("coffeeOrder皇家伯爵茶:"+(coffeeOrder.get("皇家伯爵茶")));
	          System.out.println("coffeeOrder瑪奇朵:"+(coffeeOrder.get("瑪奇朵")));
	          System.out.println("coffeeOrder鴛鴦拿鐵:"+(coffeeOrder.get("鴛鴦拿鐵")));
	          System.out.println("coffeeOrder芋香拿鐵:"+(coffeeOrder.get("芋香拿鐵")));
        		
        		
        	   porder.setAmericano(Americano);
               porder.setLatte(Latte);
               porder.setEspresso(Espresso);
               porder.setCaramelmacchiato(Caramelmacchiato);
               porder.setCappuccino(Cappuccino);
               porder.setMochaccino(Mochaccino);
               porder.setBlacktea(Blacktea);
               porder.setEarlgreytea(Earlgreytea);
               porder.setMatchalatte(Matchalatte);
               porder.setMilktealatte(Milktealatte);
               porder.setMilk(Milk);
//        	   porder.setAmericano(coffeeOrder.get("美式咖啡"));
//               porder.setLatte(coffeeOrder.get("經典拿鐵"));
//               porder.setEspresso(coffeeOrder.get("義式濃縮"));
//               porder.setCaramelmacchiato(coffeeOrder.get("焦糖瑪奇朵"));
//               porder.setCappuccino(coffeeOrder.get("卡布奇諾"));
//               porder.setMochaccino(coffeeOrder.get("摩卡咖啡"));
//               porder.setBlacktea(coffeeOrder.get("16號紅茶"));
//               porder.setEarlgreytea(coffeeOrder.get("皇家伯爵茶"));
//               porder.setMatchalatte(coffeeOrder.get("瑪奇朵"));
//               porder.setMilktealatte(coffeeOrder.get("鴛鴦拿鐵"));
//               porder.setMilk(coffeeOrder.get("芋香拿鐵"));
        		//Porder porder=new Porder();
//				porder.setUsername(username.getText());
               
                
//                porder.setAmericano(coffeeOrder.get("美式咖啡").equals(null)? 0 :coffeeOrder.get("美式咖啡"));
//                porder.setLatte(coffeeOrder.get("經典拿鐵").equals(null)? 0 :coffeeOrder.get("經典拿鐵"));
//                porder.setEspresso(coffeeOrder.get("義式濃縮").equals(null)? 0 :coffeeOrder.get("義式濃縮"));
//                porder.setCaramelmacchiato(coffeeOrder.get("焦糖瑪奇朵").equals(null)? 0 :coffeeOrder.get("焦糖瑪奇朵"));
//                porder.setCappuccino(coffeeOrder.get("卡布奇諾").equals(null)? 0 :coffeeOrder.get("卡布奇諾"));
//                porder.setMochaccino(coffeeOrder.get("摩卡咖啡").equals(null)? 0 :coffeeOrder.get("摩卡咖啡"));
//                porder.setBlacktea(coffeeOrder.get("16號紅茶").equals(null)? 0 :coffeeOrder.get("16號紅茶"));
//                porder.setEarlgreytea(coffeeOrder.get("皇家伯爵茶").equals(null)? 0 :coffeeOrder.get("皇家伯爵茶"));
//                porder.setMatchalatte(coffeeOrder.get("瑪奇朵").equals(null)? 0 :coffeeOrder.get("瑪奇朵"));
//                porder.setMilktealatte(coffeeOrder.get("鴛鴦拿鐵").equals(null)? 0 :coffeeOrder.get("鴛鴦拿鐵"));
//                porder.setMilk(coffeeOrder.get("芋香拿鐵").equals(null)? 0 :coffeeOrder.get("芋香拿鐵"));
                
        		// porder.setAmericano(coffeeOrder.get(coffee));
//				porder.setAmericano(americano.getText().isEmpty()? 0 :Integer.parseInt(americano.getText()));
//				porder.setLatte(latte.getText().isEmpty()? 0 :Integer.parseInt(latte.getText()));
//				porder.setEspresso(espresso.getText().isEmpty()? 0 :Integer.parseInt(espresso.getText()));
//				porder.setCaramelmacchiato(caramelmacchiato.getText().isEmpty()? 0 :Integer.parseInt(caramelmacchiato.getText()));
//				porder.setCappuccino(cappuccino.getText().isEmpty()? 0 :Integer.parseInt(cappuccino.getText()));
//				porder.setMochaccino(mochaccino.getText().isEmpty()? 0 :Integer.parseInt(mochaccino.getText()));
//				porder.setBlacktea(blacktea.getText().isEmpty()? 0 :Integer.parseInt(blacktea.getText()));
//				porder.setEarlgreytea(earlgreytea.getText().isEmpty()? 0 :Integer.parseInt(earlgreytea.getText()));
//				porder.setMatchalatte(matchalatte.getText().isEmpty()? 0 :Integer.parseInt(matchalatte.getText()));
//				porder.setMilktealatte(milktealatte.getText().isEmpty()? 0 :Integer.parseInt(milktealatte.getText()));
//				porder.setMilk(milk.getText().isEmpty()? 0 :Integer.parseInt(milk.getText()));
				
				porderserviceimpl.addPorder(porder);
				btnNewButton.setEnabled(false);
        	}
        });
        btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        btnNewButton.setBounds(255, 242, 100, 39);
        frame.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1_1_2 = new JButton("清 除");
        btnNewButton_1_1_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                tableModel.setRowCount(0); // 清空表格
                total = 0;
                totalLabel.setText("總計: " + total + " 元");
                payTextField.setText("");
				return1000TextField.setText("");
				return500TextField.setText("");
				return100TextField.setText("");
				return50TextField.setText("");
				return10TextField.setText("");
				return5TextField.setText("");
				return1TextField.setText("");
				btnNewButton.setEnabled(true);
				Americano=0;
				Latte=0;
				Espresso=0;
				Caramelmacchiato=0;
				Cappuccino=0;
				Mochaccino=0;
				Blacktea=0;
			    Earlgreytea=0;
				Matchalatte=0;
				Milktealatte=0;
				Milk=0;
        	}
        });
        btnNewButton_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        btnNewButton_1_1_2.setBounds(358, 242, 63, 39);
        frame.getContentPane().add(btnNewButton_1_1_2);

		//顯示時鐘
		JLabel clockLabel = new JLabel("Clock Label");
		clockLabel.setBounds(10, 450, 137, 16);
		frame.getContentPane().add(clockLabel);
		clockLabel.setFont(new Font("Symbol", Font.PLAIN, 13));
		
		payTextField = new JTextField();
		payTextField.setBounds(336, 286, 165, 31);
		frame.getContentPane().add(payTextField);
		payTextField.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("找 零");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				//total = (int)(totalCount);
				int pay = Integer.parseInt(payTextField.getText());
			    int payReturn = pay-total;
				int D1000Return = 0 ;
				int D1000Temp = 0 ;
				int D500Return = 0 ;
				int D500Temp =  0 ;
				int D100Return =  0 ;
				int D100Temp =  0 ;
				int D50Return =  0 ;
				int D50Temp =  0 ;
				int D10Return =  0 ;
				int D10Temp =  0 ;
				int D5Return =  0 ;
				int D5Temp =  0 ;
				int D1Return =  0 ;

				if(payReturn > 0){
					D1000Return = payReturn / 1000;
					D1000Temp = payReturn % 1000;
					D500Return = D1000Temp / 500;
					D500Temp = D1000Temp % 500;
					D100Return = D500Temp/ 100;
					D100Temp = D500Temp % 100;
					D50Return = D100Temp / 50;
					D50Temp = D100Temp % 50;
					D10Return = D50Temp / 10;
					D10Temp = D50Temp % 10;
					D5Return = D10Temp / 5;
					D5Temp = D10Temp % 5;
					D1Return = D5Temp / 1;
					System.out.println("D1000Return:"+String.valueOf(D1000Return));
					System.out.println("D500Return:"+String.valueOf(D500Return));
					System.out.println("D100Return:"+String.valueOf(D100Return));
					System.out.println("D50Return:"+String.valueOf(D50Return));
					System.out.println("D10Return:"+String.valueOf(D10Return));
					System.out.println("D5Return:"+String.valueOf(D5Return));
					System.out.println("D1Return:"+String.valueOf(D1Return));
					if(D1000Return>0){return1000TextField.setText(String.valueOf(D1000Return));}
					if(D500Return>0){return500TextField.setText(String.valueOf(D500Return));}
					if(D100Return>0){return100TextField.setText(String.valueOf(D100Return));}
					if(D50Return>0){return50TextField.setText(String.valueOf(D50Return));}
					if(D10Return>0){return10TextField.setText(String.valueOf(D10Return));}
					if(D5Return>0){return5TextField.setText(String.valueOf(D5Return));}
					if(D1Return>0){return1TextField.setText(String.valueOf(D1Return));}
				} //End of (payReturn > 0)
			} //End of public void mouseClicked(MouseEvent e)
		});
		btnNewButton_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(257, 325, 75, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("收 現");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(275, 288, 57, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("找500元");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(336, 346, 80, 19);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("找100元");
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(336, 369, 80, 16);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("找50元");
		lblNewLabel_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(336, 389, 80, 16);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("找10元");
		lblNewLabel_1_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_3.setBounds(336, 409, 83, 19);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("找5元");
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(336, 428, 83, 19);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("找1元");
		lblNewLabel_1_1_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_2_1.setBounds(336, 447, 83, 19);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		return500TextField = new JTextField();
		return500TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return500TextField.setBounds(420, 346, 80, 19);
		frame.getContentPane().add(return500TextField);
		return500TextField.setColumns(10);
		
		return100TextField = new JTextField();
		return100TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return100TextField.setColumns(10);
		return100TextField.setBounds(420, 366, 80, 19);
		frame.getContentPane().add(return100TextField);
		
		return50TextField = new JTextField();
		return50TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return50TextField.setColumns(10);
		return50TextField.setBounds(420, 386, 80, 19);
		frame.getContentPane().add(return50TextField);
		
		return10TextField = new JTextField();
		return10TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return10TextField.setColumns(10);
		return10TextField.setBounds(420, 406, 80, 19);
		frame.getContentPane().add(return10TextField);
		
		return5TextField = new JTextField();
		return5TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return5TextField.setColumns(10);
		return5TextField.setBounds(420, 426, 80, 19);
		frame.getContentPane().add(return5TextField);
		
		return1TextField = new JTextField();
		return1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return1TextField.setColumns(10);
		return1TextField.setBounds(420, 446, 80, 19);
		frame.getContentPane().add(return1TextField);
		
		JLabel lblNewLabel_2 = new JLabel("張");
		lblNewLabel_2.setBounds(500, 346, 32, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("張");
		lblNewLabel_2_1.setBounds(500, 367, 32, 18);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("枚");
		lblNewLabel_2_1_1.setBounds(500, 389, 32, 18);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("枚");
		lblNewLabel_2_1_2.setBounds(500, 409, 32, 18);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("枚");
		lblNewLabel_2_1_3.setBounds(500, 430, 32, 18);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("枚");
		lblNewLabel_2_1_4.setBounds(500, 448, 32, 18);
		frame.getContentPane().add(lblNewLabel_2_1_4);
		
		JButton btnNewButton_1_1_2_1 = new JButton(" 離 開");
		btnNewButton_1_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_1_1_2_1.setBounds(567, 282, 57, 39);
		frame.getContentPane().add(btnNewButton_1_1_2_1);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("找1000元");
		lblNewLabel_1_1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1_1_4.setBounds(336, 326, 80, 16);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		return1000TextField = new JTextField();
		return1000TextField.setHorizontalAlignment(SwingConstants.CENTER);
		return1000TextField.setColumns(10);
		return1000TextField.setBounds(420, 326, 81, 19);
		frame.getContentPane().add(return1000TextField);
		
		JLabel lblNewLabel_2_2 = new JLabel("張");
		lblNewLabel_2_2.setBounds(500, 325, 32, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JButton btnNewButton_1_1_2_2 = new JButton("列 印");
		btnNewButton_1_1_2_2.setEnabled(false);
		btnNewButton_1_1_2_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton_1_1_2_2.setBounds(433, 242, 63, 39);
		frame.getContentPane().add(btnNewButton_1_1_2_2);
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

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
        
        
        frame.setVisible(true);
    }

    private class CoffeeButtonListener implements ActionListener {
        private String coffeeName;

        public CoffeeButtonListener(String coffeeName) {
            this.coffeeName = coffeeName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            coffeeOrder.put(coffeeName, coffeeOrder.getOrDefault(coffeeName, 0) + 1);
            updateTable();
        }
    }

    private void updateTable() {
        tableModel.setRowCount(0); // 清空表格
        total = 0;

        for (String coffee : coffeeOrder.keySet()) {
            int quantity = coffeeOrder.get(coffee);
            int price = coffeePrices.get(coffee);
            int subtotal = quantity * price;
            total += subtotal;

            tableModel.addRow(new Object[]{coffee, quantity, price, subtotal, "+", "-"});
            
        }

        totalLabel.setText("總計: " + total + " 元");
    }

    // 按鈕渲染器（讓 JTable 可以顯示 JButton）

	private class ButtonRenderer6 extends JButton implements TableCellRenderer {
        private static final long serialVersionUID = 6596290550528524741L;

		public ButtonRenderer6() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // 按鈕編輯器（讓 JTable 內的 JButton 可以被點擊）
    private class ButtonEditor6 extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private static final long serialVersionUID = -7465550167835446110L;
		private JButton button;
        private String label;
        private int row;

        public ButtonEditor6(JButton button) {
            this.button = button;
            this.button.addActionListener(this);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.label = value.toString();
            this.row = row;
            button.setText(label);
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return label;
        }

        @Override
        public boolean isCellEditable(EventObject e) {
            return true;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String coffee = (String) tableModel.getValueAt(row, 0);
            if (label.equals("+")) {
                coffeeOrder.put(coffee, coffeeOrder.get(coffee) + 1);
            } else if (label.equals("-")) {
                if (coffeeOrder.get(coffee) > 0) {
                    coffeeOrder.put(coffee, coffeeOrder.get(coffee) - 1);
                } else {
                	if(!coffeeOrder.isEmpty()) {
                		coffeeOrder.remove(coffee);
                	}else {
                		//coffeeOrder.put(coffee,0);
                		//coffeeOrder.put(coffee, coffeeOrder.get(coffee) - 1);
                		//coffee = (String) tableModel.getValueAt(row, 0);
                		//coffeeOrder.remove(coffee);
                	}
                }
            }
            updateTable();
            fireEditingStopped();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CoffeeMenuApp6::new);
    }
}
