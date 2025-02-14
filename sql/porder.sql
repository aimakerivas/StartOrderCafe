#porderDaoImpl

#public void add(Porder porder) 
#String sql="insert into iVAS_StartOrder_Cafe.porder("
				+ "username,americano,"
				+ "latte,espresso,caramelmacchiato,"
				+ "cappuccino,mochaccino,blacktea,earlgreytea,matchalatte,"
				+ "milktealatte,milk) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";

#public List<Porder> selectAll() 
#String sql="select * from iVAS_StartOrder_Cafe.porder";

#public List<Porder> selectById(int id) 
#String sql="select * from iVAS_StartOrder_Cafe.porder where id = ?";

#public void update(Porder porder)          
#String sql="update iVAS_StartOrder_Cafe.porder set username=?,americano=?,latte=?,espresso=?,caramelmacchiato=?"
			 		+ ",cappuccino=?,mochaccino=?,blacktea=?,earlgreytea=?,matchalatte=?,milktealatte=?,milk=? where id=?";

#public void delete(Integer id) {
#String sql="delete from iVAS_StartOrder_Cafe.porder where id=?";

