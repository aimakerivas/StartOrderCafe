
/**
 * 
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

//import dao.impl.MemberDaoImpl;
//import model.Member;

/**
 * 
 */
public class DbConnectionByJDBC {

	/**
	 * @param args
	 */
	//public static Member member=null;
	
	//public static Connection conn=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Driver Connection
		System.out.println(DbConnectionByJDBC.getDb());
		
		//Test Insert into
//		member=new Member("Kevin","user01","1234","user01@gmail.com","Taipei","02-22223333","0912345678","2000/01/01","2025/07/11");
		//new MemberDaoImpl().add(member);
//		System.out.println("member.getName"+member.getName());
//		System.out.println("member.getUsername"+member.getUsername());
//		System.out.println("member.getPassword"+member.getPassword());
//		System.out.println("member.getUsername"+member.getEmail());
//		System.out.println("member.getPassword"+member.getAddress());
//		System.out.println("member.getUsername"+member.getPhone());
//		System.out.println("member.getPassword"+member.getMobile());
//		System.out.println("member.getUsername"+member.getBirthdate());
//		System.out.println("member.getPassword"+member.getCreationdate());
//		
//		String sql="insert into iVAS_StartOrder_Cafe.member(name,username,password,email,address,phone,mobile,birthdate,creationdate) values (?,?,?,?,?,?,?,?,?)";
//		PreparedStatement preparedstatement;
//		try {
//			preparedstatement = conn.prepareStatement(sql);
//			preparedstatement.setString(1,member.getName());
//			preparedstatement.setString(2,member.getUsername());
//			preparedstatement.setString(3,member.getPassword());
//			preparedstatement.setString(4,member.getEmail());
//			preparedstatement.setString(5,member.getAddress());
//			preparedstatement.setString(6,member.getPhone());
//			preparedstatement.setString(7,member.getMobile());
//			preparedstatement.setString(8,member.getBirthdate());
//			preparedstatement.setString(9,member.getCreationdate());			
//			preparedstatement.executeUpdate();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//Test select member
//		String sql="select * from member";
//		List<Member> l=new ArrayList<>();
//		
//		try {
//			PreparedStatement preparedstatement=conn.prepareStatement(sql);
//			ResultSet resultset=preparedstatement.executeQuery();
//			
//			while(resultset.next())
//			{
//				Member m=new Member();
//				m.setId(resultset.getInt("id"));
//				m.setName(resultset.getString("name"));
//				m.setUsername(resultset.getString("username"));
//				m.setPassword(resultset.getString("password"));
//				m.setEmail(resultset.getString("email"));
//				m.setAddress(resultset.getString("address"));
//				m.setPhone(resultset.getString("phone"));
//				m.setMobile(resultset.getString("mobile"));
//				m.setBirthdate(resultset.getString("birthdate"));
//				m.setCreationdate(resultset.getString("creationdate"));
//				
//				l.add(m);
////				System.out.println(m);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	public static Connection getDb() {
		String jdbcMysqlSchemaURL="jdbc:mysql://localhost:3306/iVAS_StartOrder_Cafe";
		//String jdbcMysqlSchemaURL="jdbc:mysql://localhost:3306/iVAS_StartOrder_Cafe?useSSL=false&serverTimezone=UTC";
		//String jdbcMysqlSchemaURL="jdbc:mysql://localhost:3306/iVAS_StartOrder_Cafe?useSSL=false&requireSSL=true&verifyServerCertificate=true&serverSslCert=/path/to/ca-cert.pem";
		//String jdbcMysqlSchemaURL="jdbc:mysql://localhost:3306/iVAS_StartOrder_Cafe?useSSL=false&requireSSL=true&trustServerCertificate=true&serverSslCert=/path/to/ca-cert.pem";
		
		String user="root";

		String password="1234";
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(jdbcMysqlSchemaURL, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("No Connect");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
