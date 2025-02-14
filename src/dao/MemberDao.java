/**
 * 
 */
package dao;

import java.util.List;

import model.Member;

/**
 * 
 */

public interface MemberDao {
	/** Create */
	void add(Member member);
	
	/** Read */
	List<Member> selectAll();//select * from member
	// For: Login Validation 
	List<Member> selectUsernameAndPassword(String username,String password);//select * from member where username=? and password=?
	// For: selectById before Update
	List<Member> selectById(int id);
	List<Member> selectByUsername(String username);

	
	/** Update */
	void update(Member member);
	//void update(Member member,Integer id);
	
	/** Delete */
	void delete(Integer id);
}
