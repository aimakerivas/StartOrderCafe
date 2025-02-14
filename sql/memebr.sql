#memberDaoImpl

#public void add(Member member) 
#String sql="insert into iVAS_StartOrder_Cafe.member(name,username,password,email,address,phone,mobile,birthdate,creationdate) 
values (?,?,?,?,?,?,?,?,?)";

#public List<Member> selectAll() {
#String sql="select * from member";

#public List<Member> selectUsernameAndPassword(String username, String password) 
#String sql="select * from iVAS_StartOrder_Cafe.member where username=? and password=?";

#public List<Member> selectById(int id) {
#String sql="select * from iVAS_StartOrder_Cafe.member where id = ?";

#public List<Member> selectByUsername(String username) 
#String sql="select * from iVAS_StartOrder_Cafe.member where username=?";


#public void update(Member member) {
#String sql="update member set name=?,username=?,password=?,email=?,address=?,phone=?,mobile=?,birthdate=?,creationdate=? where id=?";
	
#public void delete(Integer id) {
#String sql="delete from member where id=?";