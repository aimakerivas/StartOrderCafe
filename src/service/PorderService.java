package service;

import java.util.List;

import model.Porder;

public interface PorderService {
	
	//CRUD (增查修刪)
	//Create:增
	void addPorder(Porder porder);
	
	//Read: for report
	//String printAllPorder();
	//public String findAllPorder();
	List<Porder> findAllPorder();
	public String AllPorder();
    Porder findById(int id);
	
	//Update:修
	void updatePorder(String name,int id);
	void updatePorder(Porder porder);

	void updatePorder(String username,int americano, int latte, int espresso,int caramelmacchiato,
			int cappuccino,int mochaccino ,int blacktea,int earlgreytea,int matchalatte,
			int milktealatte,int milk, int id) ;
	
	//Delete:刪
	public void deletePorderById(int id);
}
