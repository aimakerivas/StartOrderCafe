package dao;

import java.util.List;

//import model.Member;

public interface ContainerDao<T> {
	
	// Create
	void add(T item);
	
	// Read 
	List<T> selectAll();//select * from member
	// trigger selectById before Update
	List<T> selectById(int id);
	// For: Login Validation 
	// List<T> selectUsernameAndPassword(String username,String password);//select * from member where username=? and password=?

	//List<T> selectByUsername(String username);

	
	// Update 
	
	void update(T item,Integer id);
	
	// Delete 
	void delete(Integer id);
	

}


/*
 * Class StringContainer implements C
 private String value;
 
 public void add(String item){
 	this.value = item;
 }
 
 public String get(){
 	return value;
 }
  */


