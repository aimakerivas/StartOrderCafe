package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberServices;

public class MemberServiceImpl implements MemberServices{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(new MemberServiceImpl().isUsernameBeenUse("abcrrr"));
	}

	private static MemberDaoImpl memberdaoimpl=new MemberDaoImpl();
	
	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		memberdaoimpl.add(member);
		
	}

	@Override
	public Member login(String username, String password) {
		Member member=null;
		List<Member> memberList=memberdaoimpl.selectUsernameAndPassword(username, password);
		if(memberList.size()!=0)
		{
			member=memberList.get(0);
		}	
		return member;
	}

	@Override
	public Boolean isHaveAccoun(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCaptcha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isCaptchaRight(String captcha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forgotPassword() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isUsernameBeenUse(String username) {
		//List<Member> l=memberdaoimpl.selectByUsername(username);
		
		//return l.isEmpty();
		
		return !memberdaoimpl.selectByUsername(username).isEmpty();
	}

}
