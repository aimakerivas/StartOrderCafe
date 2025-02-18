H1 咖啡點餐系統-Ｊava課程教學練習<br>
H2 Project Name: StartOrderCafe:<br>
H2 前置準備<br>
H2 學習重點<br>

> 咖啡點餐系統-Ｊava課程教學練習<br>
>> Project Name: StartOrderCafe:<br>
>> 前置準備<br>
>> 學習重點<br>

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

