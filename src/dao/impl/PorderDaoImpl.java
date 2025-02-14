package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PorderDao;
import model.Porder;
import util.DbConnectionByJDBC;

public class PorderDaoImpl implements PorderDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test add(Porder porder)
	    //Porder porder=new Porder("Box",1,2,3,4,5,6,7,8,9,10,11);
//	    Porder porder=new Porder("Jason",1,1,1,1,1,2,2,2,2,2,1);
//		new PorderDaoImpl().add(porder);
//		System.out.println("Test add(Porder porder):"+ porder);
		
		//Test selectAll();
		//System.out.println("Test PorderDaoImpl.selectAll:"+new PorderDaoImpl().selectAll()+"\n");
	
		//Test selectById(int id)
		//System.out.println("Test PorderDaoImpl.selectById:"+
		//new PorderDaoImpl().selectById(6));	
	
		//Test Update: PorderDaoImpl().update(Porder porder)
//		List<Porder> porderList=new PorderDaoImpl().selectById(5);
//		System.out.println("\nporderList.get(0):"+porderList.get(0)+"\n");
//		Porder porder=porderList.get(0);
//		porder.setUsername("Kevin2");
//		new PorderDaoImpl().update(porder);
//		System.out.println("Test PorderDaoImpl.update(porder):"+ porder);	
		
		//Test Delete
//		new PorderDaoImpl().delete(5);
//		System.out.println("Test Delete:PorderDaoImpl.delete(int id):"+new PorderDaoImpl().selectAll());

	}
	
	public static Connection conn=DbConnectionByJDBC.getDb();

	@Override
	public void add(Porder porder) {
		// TODO Auto-generated method stub
		//String sql="insert into porder() values()";
		String sql="insert into iVAS_StartOrder_Cafe.porder("
				+ "username,americano,"
				+ "latte,espresso,caramelmacchiato,"
				+ "cappuccino,mochaccino,blacktea,earlgreytea,matchalatte,"
				+ "milktealatte,milk) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
				PreparedStatement preparedstatement=conn.prepareStatement(sql);
				preparedstatement.setString(1, porder.getUsername());
				preparedstatement.setInt(2, porder.getAmericano());
				preparedstatement.setInt(3, porder.getLatte());
				preparedstatement.setInt(4, porder.getEspresso());
				preparedstatement.setInt(5, porder.getCaramelmacchiato());
				preparedstatement.setInt(6, porder.getCappuccino());
				preparedstatement.setInt(7, porder.getMochaccino());
				preparedstatement.setInt(8, porder.getBlacktea());
				preparedstatement.setInt(9, porder.getEarlgreytea());
				preparedstatement.setInt(10, porder.getMatchalatte());
				preparedstatement.setInt(11, porder.getMilktealatte());
				preparedstatement.setInt(12, porder.getMilk());
				preparedstatement.executeUpdate();
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}

	@Override
	public List<Porder> selectAll() {
		// TODO Auto-generated method stub
		String sql="select * from iVAS_StartOrder_Cafe.porder";
		List<Porder> porderList=new ArrayList<>();
		
		try {
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next())
			{
				Porder porder=new Porder();
				porder.setId(resultset.getInt("id"));
				porder.setUsername(resultset.getString("username"));
				porder.setAmericano(resultset.getInt("americano"));
				porder.setLatte(resultset.getInt("latte"));
				porder.setEspresso(resultset.getInt("espresso"));
				porder.setCaramelmacchiato(resultset.getInt("Caramelmacchiato"));
				porder.setCappuccino(resultset.getInt("cappuccino"));
				porder.setMochaccino(resultset.getInt("mochaccino"));
				porder.setBlacktea(resultset.getInt("blacktea"));
				porder.setEarlgreytea(resultset.getInt("earlgreytea"));
				porder.setMatchalatte(resultset.getInt("matchalatte"));
				porder.setMilktealatte(resultset.getInt("milkteaLatte"));
				porder.setMilk(resultset.getInt("milk"));
				
				porderList.add(porder);
				//System.out.println(member);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return porderList;		
		//return null;
	}
	
	@Override
	public List<Porder> selectById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from iVAS_StartOrder_Cafe.porder where id = ?";
		List<Porder> porderList =new  ArrayList<>();
		PreparedStatement preparedstatement;
		try {
			preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setInt(1,id);
			ResultSet resultset=preparedstatement.executeQuery();
			
			if(resultset.next())
			{
				Porder porder=new Porder();
				
				porder.setUsername(resultset.getString("username"));
				porder.setAmericano(resultset.getInt("americano"));
				porder.setLatte(resultset.getInt("latte"));
				porder.setEspresso(resultset.getInt("espresso"));
				porder.setCaramelmacchiato(resultset.getInt("Caramelmacchiato"));
				porder.setCappuccino(resultset.getInt("cappuccino"));
				porder.setMochaccino(resultset.getInt("mochaccino"));
				porder.setBlacktea(resultset.getInt("blacktea"));
				porder.setEarlgreytea(resultset.getInt("earlgreytea"));
				porder.setMatchalatte(resultset.getInt("matchalatte"));
				porder.setMilktealatte(resultset.getInt("milkteaLatte"));
				porder.setMilk(resultset.getInt("milk"));
				porder.setId(resultset.getInt("id"));
				
				porderList.add(porder);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return porderList;
	}

	@Override
	public void update(Porder porder) {	           
	    String sql="update iVAS_StartOrder_Cafe.porder set username=?,americano=?,latte=?,espresso=?,caramelmacchiato=?"
			 		+ ",cappuccino=?,mochaccino=?,blacktea=?,earlgreytea=?,matchalatte=?,milktealatte=?,milk=? where id=?";
	    try 
		{
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setString(1, porder.getUsername());
			preparedstatement.setInt(2, porder.getAmericano());
			preparedstatement.setInt(3, porder.getLatte());
			preparedstatement.setInt(4, porder.getEspresso());
			preparedstatement.setInt(5, porder.getCaramelmacchiato());
			preparedstatement.setInt(6, porder.getCappuccino());
			preparedstatement.setInt(7, porder.getMochaccino());
			preparedstatement.setInt(8, porder.getBlacktea());
			preparedstatement.setInt(9, porder.getEarlgreytea());
			preparedstatement.setInt(10, porder.getMatchalatte());
			preparedstatement.setInt(11, porder.getMilktealatte());
			preparedstatement.setInt(12, porder.getMilk());
		
			preparedstatement.setInt(13, porder.getId());
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete from iVAS_StartOrder_Cafe.porder where id=?";
		try 
		{
			PreparedStatement preparedstatement=conn.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
