### 咖啡點餐系統 - Java課程教學練習  <br>
+ [簡介](####1.簡介)  <br>
  + [1-1.課程目標說明](####1-1.課程目標說明)  <br>
  + [1-2.系統功能需求說明](####1-2.系統功能需求說明)  <br>
  + [1-3.專案目錄結構說明](####1-3.專案目錄結構說明)  <br>
+ [安裝](####2.下載/安裝)  
+ [使用方法](####3.使用方法)  <br>
+ [學習重點單元](####4.學習重點)  <br>
+ [附錄](####附錄.參考資訊)  <br>
  + [參考資訊](####A.參考資訊)  <br>
  + [相關工具下載安裝](####B.相關工具下載安裝)  <br>
<HR>

#### 1.簡介:  <br>
#### 1-1.課程目標說明:  <br>
+ 藉由Java Application 程式撰寫(使用Eclipse IDE),  <br>
+ 導入Design Pattern/MVC/DAO/UML及Iterative型態設計開發,  <br>
+ 熟習物件導向/資料處理/資料庫存取/流程控制/多工/錯誤訊息攔截/UI及相關元件操作  <br>
+ 並使用GitHub Desktop 上傳專案至GitHub  <br>
#### 1-2.系統功能需求說明  <br>
+ 登入/註冊作業 (Regrex/Captcha/CookieFile)  <br>
+ 訂單作業 (Grid選單/JTable/結帳/收現/找零)  <br>
+ 後台管理 (CRUD)  <br>
#### 1-3.專案目錄結構說明  <br>
+ Table_Import_Files (測試資料表)  <br>
+ jar (可執行轉案JAR檔)  <br>
+ sql (專案中相關SQL檔)  <br>
+ src (程式碼存放區)  <br>
  + controller (LoginUI/RegisterUI/OrderUI)  <br>
  + service (called by controllerUI+BizHandle)  <br>
  + dao (DAO Interface)  <br>
    + impl (DAO Implement)  <br>
  + model (Data Model:Reference DB Schema / Table)  <br>
  + util (DbConnection)  <br>
+ READEME.md (專案說明文件)  <br>
<HR>

#### 2.下載/安裝  <br>
+ 下載/安裝 MySQl/MySQL WorkBench/Eclipse開發工具  <br>
+ 下載/安裝 WindowBuilder as Java/Application/UI(Swing)  <br>
+ 下載/安裝 MySQl JDBC JConnect to Eclipse/Project/buildpath  <br>
+ 下載/安裝 GitHub Desktop 

#### 3.使用方法  <br>
+ 開啟 Eclipse => 匯入專案
+ 開啟 MySQL WorkBench
  + 1.create Schema: iVAS_StartOrder_Cafe
  + 2.點選iVAS_StartOrder_Cafe ＝> 按右鍵 ＝> import Table => 逐一點選*.csv 匯入(參考Table_import_Files)
  + 3.點選iVAS_StartOrder_Cafe ＝> 按右鍵 =>Refresh
#### 4.學習重點  <br>
|Design Pattern  |MVC         |DAO          |Flow Chart    |Iteration         |Maven/pom.xml   |
|:--             |:--:        |:--:         |:--:          |:--:              |--:             | 
|資料處理與轉型    |運算子       |流程控制       |if-else       |Switch            |ForEach         |  <br>
|List            |Stream      |Collections  |IO處理         |Annotation        |Exception Handle|  <br>
|物件導向         |Static      |Final         |Scope         ||Object Injection |                |  <br>
|物件導向         |Object      |Instance      |UML Diagram   |                  |                |  <br>
|Class          |Extends      |Abstracts     |Interface     |Implements        |                |  <br>
|多工處理        |Thread       |Run           |Start          |Syncronize       |Time            |  <br>
|Attribute      |Construct    |Method        |匿名函數＆Lambda|gwtter/setter     |toString        |  <br>
|Static         |Final        |Public        |Private       |Protected         |Default         |  <br>
|Array           |List         |HashMap     |Collection     |Set               |Directory       |  <br>
|Boxing          |UnBoxing     |多工處理      |toString      |LocalDateTime      |Event           |  <br>
|SQL             |Schema       |Export      |import         |join               |                |  <br>
|WindowBuilder UI|JSwing       |AWT          |JFrame        |JContentPanel      |JPanel          |  <br>
|JLayout         |JGridLayout  |JBoaderLayout |JScroll      |                   |                |  <br>
|Regex           |JTextFill    |JTextArea     |JButton      |JLabel             |Image           |  <br>
|JDBC            |Class.forName|Connection   |DriverManager  |PreparedStatement |ResultSet       |  <br>
|iOFile          |OutputFile   |InputFile    |OutputStream  |InputStream       |Seriaziable     |  <br>
|print           |PDF          |CSV          |Excel         |Word               |PPT             |  <br>
|JFreeChart      |Bar          |Pi           |              |                   |                |  <br>
|HashCode|Annotation|Event||||  <br>
<HR>

|Ｄesgn Pattern|MVC|Dao|匿名函數/Lambda|ForEach|List|
|:--|:--:|:--:|:--:|:--:|--:|



|Injection||

|Boxing|UnBoxing|t


#### 附錄  <br>
##### A.專案說明文件  <br>
##### B.參考資訊  <br>
+ [Java SE 8 API Web Site : Package Reference](https://docs.oracle.com/javase/8/docs/api/)  <br>
+ [SQL Syntex Reference](https://www.w3schools.com/)  <br>
+ [UML(Unified Modeling Language)](https://zh.wikipedia.org/zh-tw/%E7%BB%9F%E4%B8%80%E5%BB%BA%E6%A8%A1%E8%AF%AD%E8%A8%80)   <br>
+ [MarkDown語法大全](https://hackmd.io/@eMP9zQQ0Qt6I8Uqp2Vqy6w/SyiOheL5N/%2FBVqowKshRH246Q7UDyodFA)  <br>

##### C.相關工具下載安裝  <br>
+ [Java 11.0.24 下載/安裝](https://www.oracle.com/tw/java/technologies/javase/jdk11-archive-downloads.html)
+ [[MySQL v8.0.41下載/安裝](https://dev.mysql.com/downloads/mysql/8.0.html)]  <br>
+ [MySQL WorkBench v8.0.33 下載/安裝](https://dev.mysql.com/downloads/workbench/) <br>
+ [MySQL JDBC Connector 下載/安裝](https://downloads.mysql.com/archives/c-j/)  <br>
+ [Eclipse Version: 2024-12 (4.34.0)](https://www.eclipse.org/downloads/)  <br>
+ [Eclipse WindowBuilder](https://projects.eclipse.org/projects/tools.windowbuilder/downloads)  <br>
+ [Create GitHub Account](https://github.com/) <br>
+ [GitHub Desktop 下載/安裝](https://desktop.github.com/download/)  <br>
+ [免費圖庫](https://www.iconarchive.com/)  <br>

<HR>

## Memo
### 前置準備  <br>
### 學習重點 Design Pattern <br>


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
- import時留意,password 資料型態為Text
- import之後,設定id Index: PK/NN/AI
4.import table: porder   (from table_porder_export.csv)
- import之後,設定id Index: PK/NN/AI



### 待完成
+ 1.列印待完成
+ 2.Report待完成 (訂單/發票/會員歷史查詢)
+ 3.BI Chart待完成(訂單分析/銷售分析)
+ 4.New Add Tables
  + Employee/Product Tables/Models/Dao/DaoImpl/Service..
+ 5.Create New Views for Reports
+ 6.新增多角色登入UI

