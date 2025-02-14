package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.ContainerDao;
import util.DbConnectionByJDBC;

public class ContainerDaoImpl implements ContainerDao<Object>{

	private Object object;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 */
	public ContainerDaoImpl(Object object) {
		super();
		setObject(object);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

	public static Connection conn=DbConnectionByJDBC.getDb();
	
	@Override
	public void add(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Object> selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void update(Object item, Integer id) {
		// TODO Auto-generated method stub
//		String sql="update "+object+  " set name=?,username=?,password=?,email=?,address=?,phone=?,mobile=?,birthdate=?,creationdate=? where id=?";
//		
//		try {
//			PreparedStatement preparedstatement=conn.prepareStatement(sql);
//			preparedstatement.setString(1,member.getName());
//			preparedstatement.setString(2,member.getUsername());
//			preparedstatement.setString(3,member.getPassword());
//			preparedstatement.setString(4,member.getEmail());
//			preparedstatement.setString(5,member.getAddress());
//			preparedstatement.setString(6,member.getPhone());
//			preparedstatement.setString(7,member.getMobile());
//			preparedstatement.setString(8,member.getBirthdate());
//			preparedstatement.setString(9,member.getCreationdate());
//			preparedstatement.setInt(10,member.getId());
//			preparedstatement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from"+object+ "where id=?";
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
