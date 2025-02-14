package model;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String address;
	private String phone;
	private String mobile;
	private String birthdate;
	private String creationdate;
	/**
	 * @param id
	 * @param name
	 * @param username
	 * @param password
	 * @param email
	 * @param address
	 * @param phone
	 * @param mobile
	 * @param birthdate
	 * @param createdate
	 */
	public Member(Integer id, String name, String username, String password, String email, String address, String phone,
			String mobile, String birthdate, String creationdate) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.birthdate = birthdate;
		this.creationdate = creationdate;
		
	}
	
	/**
	 * @param name
	 * @param username
	 * @param password
	 * @param address
	 * @param email
	 * @param phone
	 * @param mobile
	 * @param birthdate
	 * @param creationdate
	 */
	public Member(String name, String username, String password,String email,  String address, String phone, String mobile,
			String birthdate, String creationdate) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
		this.birthdate = birthdate;
		this.creationdate = creationdate;
	}

	/**
	 * 
	 */
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the accountName
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param accountName the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the password
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param password the password to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobilee the mobilee to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the createdate
	 */
	public String getCreationdate() {
		return creationdate;
	}
	/**
	 * @param createdate the creationdate to set
	 */
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+  ", email=" + email + ", address=" + address + ", phone=" + phone + ", mobile=" + mobile + ", birthdate=" + birthdate
				+ ", createdate=" + creationdate + "]";
	}
	
	
	
	
}
