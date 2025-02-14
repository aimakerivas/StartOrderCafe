package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;
import model.Member;
import util.DbConnectionByJDBC;

public class MemberDaoImpl implements MemberDao {

	public static void main(String[] args) {
		
		//Test add(Member member)
//	    Member member=new Member("Box","user05","1234","user01@gmail.com","Taipei","02-22223333","0912345678","2000/01/01","2025/07/11");
//		new MemberDaoImpl().add(member);
		
		//Test selectAll();
//		System.out.println("Test MemberDaoImpl.selectAll:"+new MemberDaoImpl().selectAll());

		//Test selectUsernameAndPassword(String username, String password)
//		System.out.println("Test MemberDaoImpl.selectUsernameAndPassword:"+
//		new MemberDaoImpl().selectUsernameAndPassword("user00","1234"));
		
		//Test selectById(int id)
//		System.out.println("Test MemberDaoImpl.selectById:"+
//		new MemberDaoImpl().selectById(3));	
		
		//Test selectByUsername(String username)
//		System.out.println("Test MemberDaoImpl.selectByUsername:"+
//		new MemberDaoImpl().selectByUsername("user00"));	
		//System.out.println("Test MemberDaoImpl.update(member,id):"+ member);
		
		//Test Update: MemberDaoImpl().update(Member member)
//		List<Member> memberList=new MemberDaoImpl().selectById(2);
//		System.out.println("\nmemberList.get(0):"+memberList.get(0)+"\n");
//		Member member=memberList.get(0);
//		member.setName("Kevin2");
//		new MemberDaoImpl().update(member);
//		System.out.println("Test MemberDaoImpl.update(member):"+ member);	
		
		//Test Delete
//		new MemberDaoImpl().delete(5);
//		System.out.println("Test Delete:MemberDaoImpl.delete(int id):"+new MemberDaoImpl().selectAll());

	}
	
	public static Connection conn=DbConnectionByJDBC.getDb();
	
	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		String sql="insert into iVAS_StartOrder_Cafe.member(name,username,password,email,address,phone,mobile,birthdate,creationdate) values (?,?,?,?,?,?,?,?,?)";
		//PreparedStatement preparedstatement;
		try {
			PreparedStatement preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setString(1,member.getName());
			preparedstatement.setString(2,member.getUsername());
			preparedstatement.setString(3,member.getPassword());
			preparedstatement.setString(4,member.getEmail());
			preparedstatement.setString(5,member.getAddress());
			preparedstatement.setString(6,member.getPhone());
			preparedstatement.setString(7,member.getMobile());
			preparedstatement.setString(8,member.getBirthdate());
			preparedstatement.setString(9,member.getCreationdate());
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

	@Override
	public List<Member> selectAll() {
		
		// TODO Auto-generated method stub
		//Test select member
		String sql="select * from member";
		List<Member> memberList=new ArrayList<>();
		
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			ResultSet resultset=preparedstatement.executeQuery();
				
			
			while(resultset.next())
			{
				Member member=new Member();
				member.setId(resultset.getInt("id"));
				member.setName(resultset.getString("name"));
				member.setUsername(resultset.getString("username"));
				member.setPassword(resultset.getString("password"));
				member.setEmail(resultset.getString("email"));
				member.setAddress(resultset.getString("address"));
				member.setPhone(resultset.getString("phone"));
				member.setMobile(resultset.getString("mobile"));
				member.setBirthdate(resultset.getString("birthdate"));
				member.setCreationdate(resultset.getString("creationdate"));
				
				memberList.add(member);
				//System.out.println(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
		//return null;
	}

	@Override
	public List<Member> selectUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		String sql="select * from iVAS_StartOrder_Cafe.member where username=? and password=?";
		List<Member> memberList=new ArrayList<>();
		
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setString(1,username);
			preparedstatement.setString(2,password);
			ResultSet resultset=preparedstatement.executeQuery();
			
			while(resultset.next())
			{
				Member member=new Member();
				member.setId(resultset.getInt("id"));
				member.setName(resultset.getString("name"));
				member.setUsername(resultset.getString("username"));
				member.setPassword(resultset.getString("password"));
				member.setEmail(resultset.getString("email"));
				member.setAddress(resultset.getString("address"));
				member.setPhone(resultset.getString("phone"));
				member.setMobile(resultset.getString("mobile"));
				member.setBirthdate(resultset.getString("birthdate"));
				member.setCreationdate(resultset.getString("creationdate"));
				
				memberList.add(member);
				//System.out.println(member);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberList;
	}

	@Override
	public List<Member> selectById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from iVAS_StartOrder_Cafe.member where id = ?";
		List<Member> memberList=new ArrayList<>();

		try {
			PreparedStatement preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setInt(1,id);
			ResultSet resultset=preparedstatement.executeQuery();
			
			//if(resultset.next())
			while(resultset.next()) {
				Member member=new Member();
				member.setId(resultset.getInt("id"));
				member.setName(resultset.getString("name"));
				member.setUsername(resultset.getString("username"));
				member.setPassword(resultset.getString("password"));
				member.setEmail(resultset.getString("email"));
				member.setAddress(resultset.getString("address"));
				member.setPhone(resultset.getString("phone"));
				member.setMobile(resultset.getString("mobile"));
				member.setBirthdate(resultset.getString("birthdate"));
				member.setCreationdate(resultset.getString("creationdate"));
				
				memberList.add(member);
				//System.out.println(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return memberList;
	}

	@Override
	public List<Member> selectByUsername(String username) {
		// TODO Auto-generated method stub
		String sql="select * from iVAS_StartOrder_Cafe.member where username=?";
		List<Member> memberList=new ArrayList<>();
		
		try {
			PreparedStatement preparedstatement= conn.prepareStatement(sql);
			preparedstatement.setString(1,username);
			//preparedstatement.executeQuery();
			ResultSet resultset=preparedstatement.executeQuery();
			
			while(resultset.next())
			{
				Member member=new Member();
				member.setId(resultset.getInt("id"));
				member.setName(resultset.getString("name"));
				member.setUsername(resultset.getString("username"));
				member.setPassword(resultset.getString("password"));
				member.setEmail(resultset.getString("email"));
				member.setAddress(resultset.getString("address"));
				member.setPhone(resultset.getString("phone"));
				member.setMobile(resultset.getString("mobile"));
				member.setBirthdate(resultset.getString("birthdate"));
				member.setCreationdate(resultset.getString("creationdate"));
				
				memberList.add(member);
				//System.out.println(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memberList;
		//return null;
	}

	@Override
	public void update(Member member) {
		//String sql="update member set name=?,password=?,address=?,phone=?,mobile=? where id=?";
		String sql="update member set name=?,username=?,password=?,email=?,address=?,phone=?,mobile=?,birthdate=?,creationdate=? where id=?";
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setString(1,member.getName());
			preparedstatement.setString(2,member.getUsername());
			preparedstatement.setString(3,member.getPassword());
			preparedstatement.setString(4,member.getEmail());
			preparedstatement.setString(5,member.getAddress());
			preparedstatement.setString(6,member.getPhone());
			preparedstatement.setString(7,member.getMobile());
			preparedstatement.setString(8,member.getBirthdate());
			preparedstatement.setString(9,member.getCreationdate());
			preparedstatement.setInt(10,member.getId());
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
//	@Override
//	public void update(Member member, Integer id) {
//		List<Member> l=new MemberDaoImpl().selectById(id);
////		//System.out.println(l.get(0));
//		Member m=l.get(0);
//		m.setName("teacher");
//		new MemberDaoImpl().update(m);
//	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from member where id=?";
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
