### 咖啡點餐系統 - Java課程教學練習  <br>
+ [1.簡介](#1簡介--)  <br>
  + [1-1.課程目標說明](#1-1課程目標說明--)  <br>
  + [1-2.系統功能需求說明](#1-2系統功能需求說明--)  <br>
  + [1-3.專案目錄結構說明](#1-3專案目錄結構說明--)  <br>
+ [下載/安裝](#2下載安裝--)  
+ [使用方法](#3使用方法--)  <br>
+ [學習單元(#Tag)](#4學習單元--)  <br>
+ [附錄](#附錄--)  <br>
  + [專案說明文件](#a專案說明文件--)  <br>
  + [參考資訊](#b參考資訊--)  <br>
  + [相關工具下載安裝](#c相關工具下載安裝--)  <br>
  + [Ｍaven自動下載第3方JAR檔設定](#dＭaven自動下載第3方JAR設定--)  <br>
  + [ChatGPT程式開發輔助](#eChatGPT程式開發輔助範例--)  <br>

<HR>

#### 1.簡介:  <br>
#### 1-1.課程目標說明:  <br>
+ 藉由撰寫Java Application 程式(IDE開發工具: Eclipse/Maven),  <br>
+ 導入Design Pattern/MVC/DAO/UML,  <br>
+ 開發學習採迭代型態(Iterative)反覆修正/增添功能改版,  <br>
+ 過程中熟習相關技術單元:物件導向/資料處理/資料庫存取/流程控制/IO/多工/錯誤訊息攔截/UI/報表及相關元件操作  <br>
+ 並使用GitHub Desktop 上傳專案至GitHub  <br>
+ 同時學習Markdown語法  <br>
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
+ 下載/安裝 Eclipse開發工具  <br>
+ 下載/安裝 MySQl(8.0.42)  <br>
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
+ 開啟 Eclipse => 匯入專案  <br>
  + =>修改DbConnection.java 帳號密碼  <br>
    + user="xxxxxx"  <br>
    + password="xxxxyyyy"  <br>
#### 4.學習單元  <br>
|Design Pattern  |MVC         |DAO          |Flow Chart    |Iteration          |Maven/pom.xml    |
|:--             |:--:        |:--:         |:--:          |:--:                |--:             | 
|資料處理與轉型    |運算子       |流程控制       |if-else       |Switch             |ForEach          |  <br> 
|List            |Stream      |Collections  |IO處理         |Annotation         |                 |  <br>
|Exception Handle|try/catch   |throws|      |              |                    |                |  <br>
|物件導向         |Object      |Instance      |UML Diagram   |Object Injection   |                |  <br>
|Class          |Extends      |Abstracts     |Interface     |Implements         |Scope           |  <br>
|Static         |Final        |Public        |Private       |Protected          |Default         |  <br>
|多工處理        |Thread       |Run           |Start          |Syncronize        |Time            |  <br>
|Attribute      |Construct    |Method        |匿名函數＆Lambda|gwtter/setter      |toString        |  <br>
|Array           |List         |HashMap      |Collection     |Set               |Directory       |  <br>
|Boxing          |UnBoxing     |多工處理      |toString       |LocalDateTime      |Event          |  <br>
|SQL             |Schema       |Export       |import         |join              |                |  <br>
|JDBC            |Class.forName|Connection   |DriverManager  |PreparedStatement |ResultSet       |  <br>
|iOFile          |OutputFile   |InputFile    |OutputStream   |InputStream       |Seriaziable     |  <br>
|WindowBuilder UI|JSwing       |AWT          |Regrex         |JFrame            |Window          |  <br>
|JContentPanel   |JPanel       |JLayout      |JGridLayout    |JBoaderLayout     |JScroll         |  <br>
|BorderLayout    |FlowLayout   |GridLayout   |JGridLayout    |JBoaderLayout     |JScroll         |  <br>
|JPasswordField  |JTextField   |JTextArea    |JLabel         |JButton           |Image           |  <br>
|print           |PDF          |CSV          |Excel          |Word               |PPT            |  <br>
|JFreeChart      |Bar          |Pi           |               |                   |               |  <br>
|HashCode        |Annotation   |Event        |               |                   |               |  <br>
<HR>

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
+ [免費圖庫(iconarchive)](https://www.iconarchive.com/)  <br>
##### D.Ｍaven自動下載第3方JAR設定  <br>
+ [Ｍaven pom.xml設定參數/可由ChatGPT查詢](https://chatgpt.com/)  <br>
  + MySQL Connector/J  <br>
  + JFreeChart  <br>
  + Log4J  <br>
##### E.ChatGPT程式開發輔助範例  <br>
  + 技術單元  <br>
|No.|技術主題|技術單元     |CodeGenType      |Promp Request           |ChatGpt<br>說明內容連結|ChatGPT<br>說明範例連結<br>|Notes|
|:--|:--:   |:--:        |:--:            |:--                     |:--:                  |:--:                  |--:  | 
|000|ObjectOriented|(議題列表)|簡介         |What's ObjectOriented?  |......................|......................|     |  <br>
|001|Dao    |Dao         |簡介             |What's Dao?                 |xxxx       |xxxx      |     |  <br>
|   |Dao    |Dao         |完整範例          |provide Java Dao example.   |xxxx       |xxxx      |     |  <br>


<HR>

|   |Dao    |Data<br>Schema Export<br>|範例|provide export data CSV file(from MySQL Schema:testDb,Table:member).|||| 
|   |Dao    |DaoModel    |範例             |provide Java Dao model example. (reference csv data)        |||| 
|   |Dao    |DaoInterface|範例             |provide Java Dao interface example.(reference Dao model)    ||||
|   |Dao    |DaoImpl     |範例             |provide Java Dao implement example.(reference Dao interface)||||
|002|MVC    |Model       |簡介             |What's MVC?||||
|   |MVC    |Model       |範例             |provide MVC example||||
|003|UI/JFrame|Login/Register UI|範例|provide Java example of LoginUI/RegisterUI/Regrex/Captcha/passEncrypt||||  <br>
|   |UI/JFrame|LoginUI|範例|provide Java example of LoginUI/LoginSucessUI/LoginErrorUI/Regrex/Captcha/passEncrypt||||  <br>
|   |UI/JFrame|RegisterUI|範例 |provide Java example of RegisterUI&SucessUI&ErrorUI/Regrex/Captcha/passEncrypt||||  <br>
|   |驗證碼|Captcha   |範例 |provide Java example of captcha(include regen function when press recycle-button) ||||  <br>
|   |表示式檢驗 |Regrex    |範例 |provide Java example of JTextField regrex||||  <br>
|   |密碼隱碼  |JPasswordTextField     |範例 |provide Java example of Login/password hidden||||  <br>
|   |個資保護  |password Encrypt驗正機制|範例 |provide Java example of Login/password hidden with encrypt validation||||  <br>
|004|Collections|List    |範例 |provide Java example of  List example||||  <br>
|005|Collections|HashMap |簡介/範例|about Java HashSet ? and related methods? examples||||  <br>
|   |Collections|HashMap |範例 |provide Java example of HashMap example||||  <br>
|006|Swing |JTable       |範例 |provide Java example of JTable example||||  <br>
|007|Swing |print        |範例 |provide Java example of Swing/JFrame/Print||||  <br>
|008|Report|Excel        |範例 |provide Java example of excel report example||||  <br>
|009|Chart |JFreeChart   |範例 |provide Java example of JFreeChart/PiChart,BarChart example||||  <br>
|010|JDBC|DbConnectByJDBC|範例|provide Java JDBC DbConnection example||||  <br>
|011|JDBC|Class.forName|介紹/範例|What's Class.forName?||||  <br>
|210|授權機制|帳號/角色/功能<br>授權機制|功能/模組<br>範例|請規劃Java功能依角色授權檢查機制,功能有fun1/fun2/…/fun10,<br>各功能有permission機制,有授權的功能才可以執行,<br>另有功能授權角色及帳號配置角色請提供Java範例||||  <br>

<HR>

  + 技術單元  <br>
|No.|主題|模組|功能服務     |CodeGenType      |Promp Request           |ChatGpt<br>說明內容連結|ChatGPT<br>說明範例連結<br>|Notes|
|:--|:--:|:--:｜:--: |:--:            |:--                     |:--:                  |:--:                  |:--  | 
|901|系統|服務功能模組|完整的角色權限機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務功能模組|完整的角色權限機制<br>+ Email認證檢核機制<br>忘記密碼/檢核/通知/重置機制<br>|摘要/設計概念/範例|||||  <br>
|901|系統|服務功能模組|完整的訂單機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務管理機制|完整的產品管理機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務管理機制|完整的財務會科管理機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務管理機制|完整的進貨/備料/庫存管理機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務管理機制|完整的報表機制|摘要/設計概念/範例|||||  <br>
|901|系統|服務管理機制|完整的圖表分析管理機制|摘要/設計概念/範例|||||  <br>
|901|系統|後台管理機制|完整的角色權限管理機制|摘要/設計概念/範例|||||  <br>
|901|系統|後台管理機制|完整的後台監控/告警/管理機制|摘要/設計概念/範例|||||  <br>

<HR>
 
### 待完成  <br>
+ 1.列印待完成  <br>
+ 2.Report待完成 (訂單/發票/會員歷史查詢)  <br>
+ 3.BI Chart待完成(訂單分析/銷售分析)  <br>
+ 4.New Add Tables  <br>
  + Employee  <br>
  + Product  <br>
+ 5.Create Model/Dao/DaoImpl/Service..  <br>
+ 6.Create New Views for Reports  <br>
+ 7.新增多角色登入UI  <br>
+ 8.新增Git版控功能  <br>
+ 9.CI/CD導入  <br>
+ 10.上傳雲主機  <br>
+ 11.ChatGPT Prompt(單元主題/範例 彙整)  <br>

