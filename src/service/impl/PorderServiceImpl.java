package service.impl;

import java.util.List;

import dao.impl.PorderDaoImpl;
import model.Porder;
import service.PorderService;

public class PorderServiceImpl implements PorderService {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new PorderServiceImpl().findById(6));
	}
	//public static PorderDaoImpl porderDaoImpl =new PorderDaoImpl();
	private static PorderDaoImpl porderdaoimpl=new PorderDaoImpl();
	
	
//	@Override
//	public void addPorder(Porder porder) {
//		// TODO Auto-generated method stub
//		if(porder.getLatte()>=0)
//		{
//			porderDaoImpl.add(porder);
//		}
//	}
	
	@Override
	public String AllPorder() {
		List<Porder> porderList=porderdaoimpl.selectAll();
		String show="";
		
		for(Porder porder:porderList)
		{
			int sum=porder.getAmericano()*70
					+porder.getLatte()*120
					+porder.getEspresso()*120
					+porder.getCaramelmacchiato()*120
					+porder.getCappuccino()*120
					+porder.getMochaccino()*120
					+porder.getBlacktea()*70
					+porder.getEarlgreytea()*90
					+porder.getMatchalatte()*120
					+porder.getMilktealatte()*120
					+porder.getMilk()*100;
	
			
			show=show+"訂單編號:"+porder.getId()+
					"\t客戶名稱:"+porder.getUsername()+
					"\tAmericano:"+porder.getAmericano()+
					"\tLatte:"+porder.getLatte()+
					"\tEspresso:"+porder.getEspresso()+
					"\tCaramelmacchiato:"+porder.getCaramelmacchiato()+
					"\tCappuccino:"+porder.getCappuccino()+
					"\tMochaccino:"+porder.getMochaccino()+
					"\tBlacktea:"+porder.getBlacktea()+
					"\tEarlgreytea:"+porder.getEarlgreytea()+
					"\tMatchalatte:"+porder.getMatchalatte()+
					"\tMilktealatte:"+porder.getMilktealatte()+
					"\tMilk:"+porder.getMilk()+
					"\t金額:"+sum+"元\n";
		}
		
		return show;

	}

	
	@Override
	public void addPorder(Porder porder) {
		
		//String tmpStr=null;
		//int order=(tmpStr.isEmpty() ? 0 : Integer.parseInt(tmpStr));
		
		
		if(porder.getLatte() >=0)
		{
			porderdaoimpl.add(porder);
		}
		
	}


	@Override
	public List<Porder> findAllPorder() {
		return porderdaoimpl.selectAll();
		//return null;
	}

	@Override
	public Porder findById(int id) {
		/*
		 * 1.id>=0
		 * 2.Porder無訂單--->null
		 */
		Porder porder=null;
		if(id>0)
		{
			List<Porder> l=porderdaoimpl.selectById(id);
			if(l.size()>0)
			{
				porder=l.get(0);
			}
			
		}	
		
		return porder;
	}
	
	@Override
	public void updatePorder(Porder porder) {
		// TODO Auto-generated method stub
		Porder p=findById(porder.getId());
		//p.set
		porderdaoimpl.update(p);
		//porderdaoimpl.update(porder);
	}

//	@Override
//	public void updatePorder(Porder porder,String id) {
//		// TODO Auto-generated method stub
//		List<Porder> porder=findPorderById(id);
//		//porder.setUsername(username.getText());
//		
//		porderdaoimpl.update(porder);
//	}

	@Override
	public void updatePorder(String username,int americano, int latte, int espresso,int caramelmacchiato,
			int cappuccino,int mochaccino ,int blacktea,int earlgreytea,int matchalatte,
			int milktealatte,int milk, int id) {
			Porder porder=findById(id);
			porder.setUsername(username.toString());
			porder.setAmericano(americano);
			porder.setLatte(latte);
			porder.setEspresso(espresso);
			porder.setCaramelmacchiato(caramelmacchiato);
			porder.setCappuccino(cappuccino);
			porder.setMochaccino(mochaccino);
			porder.setBlacktea(blacktea);
			porder.setEarlgreytea(earlgreytea);
			porder.setMatchalatte(matchalatte);
			porder.setMilktealatte(milktealatte);
			porder.setMilk(milk);
			
			porderdaoimpl.update(porder);

	}

	@Override
	public void updatePorder(String name, int id) {
		Porder p=findById(id);
		p.setUsername(name);
		
		porderdaoimpl.update(p);
		
	}
	
	public void deletePorderById(int id) {
		if(id>0)
		{
			porderdaoimpl.delete(id);
		}
	}


}
