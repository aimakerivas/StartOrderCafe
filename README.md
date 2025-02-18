## 咖啡點餐系統-Ｊava課程教學練習  <br>
> Project Name: StartOrderCafe:<br>
>> 摘要:藉由Java Application 程式撰寫,瞭解Design Pattern/MVC/DAO,
>> 並熟習物件導向/資料處理與轉型/流程控制/資料庫存取/多工/錯誤訊息攔截與設計
>> 及其他:Swing/Event/Annotion/DateTime/toString/clock..<br>

#### 1.前置準備 <br>
+ 下載/安裝 MySQl/MySQL WorkBench/Eclipse開發工具
+ 下載/安裝 MySQl JDBC JConnect to MySQL DB
+ 下載/安裝 WindowBuilder as Java/Application/UI(Swing)

#### 2.系統功能 <br>
+ 登入/註冊作業 (Regrex/Captcha/CookieFile)
+ 訂單作業 (Grid選單/JTable/結帳/收現/找零)
+ 後台管理 (CRUD)

#### 3.學習重點 <br>
* Design Pattern | MVC | DAO | UML  <br>
* 物件導向 | 流程控制 | 資料處理 | Lambda | Exception Handle  <br>
* IO處理 | 多工處理   <br>
* UI元件設計與處理 | Event   <br>

#### Appendix: A.參考資訊  <br>
+ Java SE 8 API Web Site : Package Reference
+ W3School : SQL Reference
+ 鳥哥
+ Wikipedia Search: UML/DesignPattern

#### Appendix: B.相關工具下載安裝  <br>
+ MySQL v8.0.41下載/安裝
+ MySQL WorkBench v8.0.33 下載/安裝
+ MySQL JDBC Driver Connection 下載/安裝
+ Eclipse Version: 2024-12 (4.34.0)
+ Eclipse WindowBuilder
* Create GitHub   <br>
* GitHub Desktop 下載/安裝   <br>

<HR>
## 前置準備  <br>
## 學習重點 Design Pattern <br>
|Ｄesgn Pattern|MVC|Dao|匿名函數/Lambda|ForEach|List|
|:--|:--:|:--:|:--:|:--:|--:|
|JDBC|DriverManager|Connection|PreparedStatement|ResultSet||
|Class|Object|Instance|Attribute|Construct|Method|
|Extends|Abstract|Interface|Implements|getter|setter|
|Static|Final|Public|Private|Protected|Default|
|Injection|Time|Thread|Syncronize|Seriziable||
|iOFile|OutputFile|InputFile|OutputStream|InputStream||
|Boxing|UnBoxing|toString|HashCode|Annotation|Ｅ素Ｈㄍㄠ|
|WindowBuilder|JSwing|AWT|JFrame|JConentPanel|JPanel|
|Jscroll|JGrid|JTable|Layout|BoardLayout|GridLayout|
|Regex|JTextFill|JTextArea|JButton|JLabel|Image|
|Print|Report|PDF|CSV|PPT|Word Doc||
|JFreeChart||||||

前置準備
Part I: Download Project File

PartII : 
下載/安裝 MySQL(8.0.42)/WorkBench(8.0.33)
設定WorkBench 帳號密碼

Ｐart III:
修改Connect to MySQL DB 帳號密碼
=>修改DbConnection.java 帳號密碼
user="xxxxxx";
password="xxxxyyyy"

Part IV:
Import Test Data (member.csv,porder.csv) to tables(member,porder)

1.Login to MySQL WorkBench
2.Create Database Schema: iVAS_StartOrder_Cafe
3.import table: member   (from table_member_export.csv)
-import時留意,password 資料型態為Text
-import之後,設定id Index: PK/NN/AI
4.import table: porder   (from table_porder_export.csv)
-import之後,設定id Index: PK/NN/AI



待完成
1.點餐後,訂單出現在JTable後,JTable取值null判斷=>除錯中(有Exception)
先以(user,0,0,0,0,0,0,0,0,0,0,0)填入Porder Table 

2.列印待完成

