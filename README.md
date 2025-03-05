### ![image](https://github.com/user-attachments/assets/fe6039ae-64be-461a-b558-da81314cde59) 咖啡點餐系統 - Java課程教學練習    <br>
+ [1.簡介](#1簡介--)  <br>
  + [1-1.課程目標說明](#1-1課程目標說明--)  <br>
  + [1-2.系統功能需求說明(Mac)](#1-2系統功能需求說明--)  <br>
  + [1-3.專案目錄結構說明](#1-3專案目錄結構說明--)  <br>
+ [下載/安裝](#2下載安裝--)  <br>  
+ [使用方法](#3使用方法--)  <br>
+ [學習單元(#Tag)](#4學習單元--)  <br>
+ [附錄](#附錄--)  <br>
  + [專案設計概念說明](#a專案設計概念說明--)  <br>
  + [相關工具下載安裝](#b相關工具下載安裝--)  <br>
  + [Ｍaven自動下載第3方JAR檔設定](#cＭaven自動下載第3方JAR設定--)  <br>
  + [參考資訊](#d參考資訊--)  <br>
  + [ChatGPT程式開發輔助](#eChatGPT程式開發輔助範例--)  <br>
+ [待完成](#待完成--)  <br>
+ [上課心得感想](#上課心得感想--)  <br>

<HR>

#### 1.簡介:  <br>
#### 1-1.課程目標說明:  <br>
+ 藉由撰寫Java Application 程式(IDE開發工具: Eclipse/Maven),  <br>
+ 導入Design Pattern/MVC/DAO/UML,  <br>
+ 開發學習採迭代型態(Iterative)反覆修正/增添功能改版,  <br>
+ 過程中熟習相關技術單元:物件導向/資料處理/資料庫存取/流程控制/IO/多工/錯誤訊息攔截/UI/報表及相關元件操作  <br>
+ 並使用GitHub Desktop 上傳專案至GitHub  <br>
+ 同時學習Markdown,SQL語法  <br>
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
#### 2.下載/安裝  <br>
+ 下載/安裝 Eclipse開發工具  <br>
+ 下載/安裝 MySQl(8.0.41)  <br>
+ 下載/安裝 ＭySQL WorkBench(8.0.33) + 設定帳號密碼 <br>
+ 下載/安裝 WindowBuilder as Java/Application/UI(Swing)  <br>
+ 下載/安裝 MySQl JDBC JConnect to Eclipse/Project/buildpath  <br>
+ 下載/安裝 GitHub Desktop  <br>
#### 3.使用方法  <br>
+ 下載 Project File  <br>
+ 開啟 MySQL WorkBench  (Create Schema / Import Data)  <br>
  + 1.Login
  + 2.Create Database Schema: iVAS_StartOrder_Cafe  <br>
  + 3.匯入Table/Data (import *.csv)
    + 點選iVAS_StartOrder_Cafe ＝> 按右鍵 ＝> import Table => 逐一點選*.csv 匯入(參考Table_import_Files)  <br>
      + import table: member   (from table_member_export.csv/ table_porder_export.csv)
      + import時留意,password 資料型態為Text
      + import之後,設定id Index: PK/NN/AI 
  + 4.Refresh
    + 點選iVAS_StartOrder_Cafe ＝> 按右鍵 =>Refresh  <br>
+ 開啟 Eclipse => 匯入專案/Maven  <br>
  + =>修改DbConnection.java 帳號密碼  <br>
    + user="xxxxxx"  <br>
    + password="xxxxyyyy"  <br>
#### 4.學習單元  <br>
|Design Patterns |物件導向     |MVC           |DAO           |Maven(pom.xml)     |JDBC            |
|:--             |:--:        |:--:          |:--:          |:--:              |--:             |
|資料處理與轉型    |運算子       |三元運算子      |Boxing/Unboxing|intParse/valueOf |InitialValues   |  
|java.lang      |String       |isEquals      |toString/HashCode|LocalDateTime  |System          |  <br>
|Collections    |Array        |List          |ListArray     |Set/HashMap       |Stream          |  <br>
|流程控制         |if-else     |Switch        |ForEach       |for(;;)            |while/do..while|  <br> 
|Exception       |try/catch   |throws        |IO處理         |Annotation        |@Override      |  <br>
|Class           |Object      |Instance      |UML Diagram   |Object Injection  |Serializable               |  <br>
|Extends         |Abstracts    |Interface    |Implements    |Overload          |Overwrite      |  <br>
|Static          |Final        |Public       |Private       |Protected         |Default        |  <br>
|Attribute       |Construct    |Method       |匿名函數＆Lambda|getter/setter     |toString       |  <br>
|多工處理         |Thread       |Run          |Start          |Syncronize       |Time            |  <br>
|SQL             |Schema       |Export/Import|Dump/Restore   |Join Left/Right  |java.sql        |  <br>
|JDBC            |Class.forName|Connection   |DriverManager  |PreparedStatement|ResultSet       |  <br>
|iOFile          |OutputFile   |InputFile    |OutputStream   |InputStream      |cookieFile      |  <br>
|WindowBuilder(UI)|Swing       |AWT          |Regrex         |Eclipse/Plug-in  |                |  <br>
|Window          |JFrame       |JContentPanel|JScroll        |JPanel           |JGridLayout     |  <br>
|Layout          |BorderLayout |FlowLayout   |JGridLayout    |JBoaderLayout     |JScroll        |  <br>
|JPasswordField  |JTextField   |JTextArea    |JLabel         |JButton           |Image          |  <br>
|print           |PDF          |CSV          |Excel          |Word              |PPT            |  <br>
|JFreeChart      |Bar          |Pi           |Line           |                  |               |  <br>
|Annotation      |@Override    |             |               |                  |               |  <br>

<HR>

#### 附錄  <br>
#### A.專案設計概念說明  <br>
+ DAO/MVC/Marven/JDBC/ER設計概念 (初學者階梯學習)  <br>
+ 資料處理/HashMap/List/Stream/Model/Injection/ForEach (初學者階梯學習)  <br>
+ 1.初步分析需求規格  <br>
+ 2.Create Database by ER Model: MySQL Workbench EER  <br>
   + 建立Data所需Tables (可詢問ChatGPT使用步驟)  <br>
   + Created ER(Entity-Relationship) by MySQL Workbench/EER  <br> 
+ 3.自動建立產生 Schema/Tables/Fields/Index
  + ER Diagram => Database => Forward Engineer 自動建立產生DB/Table
+ 4.使用IDE開發工具: Eclipse
   + 下載/安裝
   + 建立Maven Project 
+ 5.下載MySQL JDBC Connector for Java (可詢問ChatGPT產生範例)
   + 更新pom.xml中 MyQL Independancy maven下載參數 (可詢問ChatGPT產生範例)
   + pom.xml更新後,將自動下載MySQL JDBC Connector  + 
+ 6.Create Java DBConnect by JDBC
   + 建立 util.DBConnect.java (by Eclipse/Java Project)
+ 7.Create Model (下層對應ＤataSource存取,上層可提供Data Model/物件注入操作)
   + 開發AutoGenJavaModelFromDB.java (可詢問ChatGPT產生範例)
   + 產生對應DB/Tables
+ 8.Create DAO  (提供DB/Data結構化專業處理:易維護/管理)
   + Create DaoInterface
   + Create DaoImplement
+ 9.Create ServiceDao: (提供UI及商務功能所需)
+ 10.Create ControllerUI : UI Design by Swing/AWT (for Learning Step)
   + 參考需求流程/UI/作業/報表規格
   + Login/SuccessMsg/ErrorMsg
   + Register/SuccessMsg/ErrorMsg
   + OrderUI
   + ConsoleUI
     + ConfiguraionUI
     + ManagementUI
     + QueryUI/ReportUI
     + ChatUI
     + Log/AccessTrackingUI
     + ExceptionHandleUI
+ 11.Create Java Utilities
   + DbConnect
   + AutoGenJavaModelFromDB
   + IOFileAccess(Write,Read)
   + CaptchaGenerator
   + PasswordEncrypt
   + ClockDateTime 
##### Create Database ER Model: Designed by MySQL WorkBench EER(Enhanced Entity-Relationship) Model
![image](https://github.com/user-attachments/assets/1d910853-7d5c-4b61-b214-7d08f362e1a9)

##### B.相關工具下載安裝  <br>
+ [Java 11.0.24 下載/安裝](https://www.oracle.com/tw/java/technologies/javase/jdk11-archive-downloads.html)
+ [[MySQL v8.0.41下載/安裝](https://dev.mysql.com/downloads/mysql/8.0.html)]  <br>
+ [MySQL WorkBench v8.0.33 下載/安裝](https://dev.mysql.com/downloads/workbench/) <br>
+ [MySQL JDBC Connector 下載/安裝](https://downloads.mysql.com/archives/c-j/)  <br>
+ [Eclipse Version: 2024-12 (4.34.0)](https://www.eclipse.org/downloads/)  <br>
+ [Eclipse WindowBuilder](https://projects.eclipse.org/projects/tools.windowbuilder/downloads)  <br>
+ [Create GitHub Account](https://github.com/) <br>
+ [GitHub Desktop 下載/安裝](https://desktop.github.com/download/)  <br>
+ [免費圖庫(iconarchive)](https://www.iconarchive.com/)  <br>
##### C.Ｍaven自動下載第3方JAR設定  <br>
+ [Ｍaven pom.xml設定參數/可由ChatGPT查詢](https://chatgpt.com/)  <br>
  + MySQL Connector/J  <br>
  + JFreeChart  <br>
  + Log4J  <br>
##### D.參考資訊  <br>
+ [Java SE 8 API Web Site : Package Reference](https://docs.oracle.com/javase/8/docs/api/)  <br>
+ [SQL Syntex Reference](https://www.w3schools.com/)  <br>
+ [UML(Unified Modeling Language)](https://zh.wikipedia.org/zh-tw/%E7%BB%9F%E4%B8%80%E5%BB%BA%E6%A8%A1%E8%AF%AD%E8%A8%80)   <br>
+ [MarkDown語法大全](https://hackmd.io/@eMP9zQQ0Qt6I8Uqp2Vqy6w/SyiOheL5N/%2FBVqowKshRH246Q7UDyodFA)  <br>
##### E.ChatGPT程式開發輔助範例  <br>

  
 
#### 待完成  <br>

+ 1.New Add Tables(已完成)  <br>
  + Employee  <br>
  + Product  <br>
  + PorderDetail  <br>
+ 2.Create Model/Dao/DaoImpl/Service..(已完成)  <br>
+ 3.編碼規則(已完成)  <br>
+ 4.新增多角色登入UI（已開發,整合中)  <br>
+ 5.列印待完成  <br>
+ 6.Report待完成 (訂單/發票/會員歷史查詢)  <br>
+ 7.BI Chart待完成(訂單分析/銷售分析)  <br>
+ 8.Create New Views for Reports  <br>
+ 9.新增Git版控功能  <br>
+ 10.CI/CD導入  <br>
+ 11.上傳雲主機  <br>
+ 12.ChatGPT Prompt 助理(單元主題/需求文件/設計文件/參考文件/操作說明範例 彙整)  <br>
+ 13.UI改版

#### 上課心得感想  <br>

