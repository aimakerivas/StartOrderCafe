/**
 * 
 */
package service;

import model.Member;

/**
 * 
 */
public interface MemberServices {
	
	//Create
	/** Add account when sign-up */
	void add(Member member);
	
	//Read
	
	/** Login Validation */
	Member login(String username,String password);
	
	/** SignUp Validation to check exist of account when Register*/
	Boolean isHaveAccoun(String userName);
	
	/** For gwtCAPTCHA and Validation */
	String getCaptcha();
	Boolean isCaptchaRight(String captcha);
	
	/** Entry Forgot Password Process Flow */
	void forgotPassword();
	boolean isUsernameBeenUse(String username);
	
	//Update
	
	//Delete
}
