package model;

import java.io.Serializable;

public class Porder implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private Integer americano;
	private Integer latte;
	private Integer espresso;
	private Integer caramelmacchiato;
	private Integer cappuccino;
	private Integer mochaccino;
	private Integer blacktea;
	private Integer earlgreytea;
	private Integer matchalatte;
	private Integer milktealatte;
	private Integer milk;
	/**
	 * @param id
	 * @param username
	 * @param americano
	 * @param latte
	 * @param espresso
	 * @param caramelmacchiato
	 * @param cappuccino
	 * @param mochaccino
	 * @param blacktea
	 * @param earlgreytea
	 * @param matchalatte
	 * @param milktealatte
	 * @param milk
	 */
	public Porder(Integer id, String username, Integer americano, Integer latte, Integer espresso,
			Integer caramelmacchiato, Integer cappuccino, Integer mochaccino, Integer blacktea, Integer earlgreytea,
			Integer matchalatte, Integer milktealatte, Integer milk) {
		super();
		this.id = id;
		this.username = username;
		this.americano = americano;
		this.latte = latte;
		this.espresso = espresso;
		this.caramelmacchiato = caramelmacchiato;
		this.cappuccino = cappuccino;
		this.mochaccino = mochaccino;
		this.blacktea = blacktea;
		this.earlgreytea = earlgreytea;
		this.matchalatte = matchalatte;
		this.milktealatte = milktealatte;
		this.milk = milk;
	}
	/**
	 * @param username
	 * @param americano
	 * @param latte
	 * @param espresso
	 * @param caramelmacchiato
	 * @param cappuccino
	 * @param mochaccino
	 * @param blacktea
	 * @param earlgreytea
	 * @param matchalatte
	 * @param milktealatte
	 * @param milk
	 */
	public Porder(String username, Integer americano, Integer latte, Integer espresso, Integer caramelmacchiato,
			Integer cappuccino, Integer mochaccino, Integer blacktea, Integer earlgreytea, Integer matchalatte,
			Integer milktealatte, Integer milk) {
		super();
		this.username = username;
		this.americano = americano;
		this.latte = latte;
		this.espresso = espresso;
		this.caramelmacchiato = caramelmacchiato;
		this.cappuccino = cappuccino;
		this.mochaccino = mochaccino;
		this.blacktea = blacktea;
		this.earlgreytea = earlgreytea;
		this.matchalatte = matchalatte;
		this.milktealatte = milktealatte;
		this.milk = milk;
	}
	/**
	 * 
	 */
	public Porder() {
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the americano
	 */
	public Integer getAmericano() {
		return americano;
	}
	/**
	 * @param americano the americano to set
	 */
	public void setAmericano(Integer americano) {
		this.americano = americano;
	}
	/**
	 * @return the latte
	 */
	public Integer getLatte() {
		return latte;
	}
	/**
	 * @param latte the latte to set
	 */
	public void setLatte(Integer latte) {
		this.latte = latte;
	}
	/**
	 * @return the espresso
	 */
	public Integer getEspresso() {
		return espresso;
	}
	/**
	 * @param espresso the espresso to set
	 */
	public void setEspresso(Integer expresso) {
		this.espresso = expresso;
	}
	/**
	 * @return the caramelmacchiato
	 */
	public Integer getCaramelmacchiato() {
		return caramelmacchiato;
	}
	/**
	 * @param caramelmacchiato the caramelmacchiato to set
	 */
	public void setCaramelmacchiato(Integer caramelmacchiato) {
		this.caramelmacchiato = caramelmacchiato;
	}
	/**
	 * @return the cappuccino
	 */
	public Integer getCappuccino() {
		return cappuccino;
	}
	/**
	 * @param cappuccino the cappuccino to set
	 */
	public void setCappuccino(Integer cappuccino) {
		this.cappuccino = cappuccino;
	}
	/**
	 * @return the mochaccino
	 */
	public Integer getMochaccino() {
		return mochaccino;
	}
	/**
	 * @param mochaccino the mochaccino to set
	 */
	public void setMochaccino(Integer mochaccino) {
		this.mochaccino = mochaccino;
	}
	/**
	 * @return the blacktea
	 */
	public Integer getBlacktea() {
		return blacktea;
	}
	/**
	 * @param blacktea the blacktea to set
	 */
	public void setBlacktea(Integer blacktea) {
		this.blacktea = blacktea;
	}
	/**
	 * @return the earlgreytea
	 */
	public Integer getEarlgreytea() {
		return earlgreytea;
	}
	/**
	 * @param earlgreytea the earlgreytea to set
	 */
	public void setEarlgreytea(Integer earlgreytea) {
		this.earlgreytea = earlgreytea;
	}
	/**
	 * @return the matchalatte
	 */
	public Integer getMatchalatte() {
		return matchalatte;
	}
	/**
	 * @param matchalatte the matchalatte to set
	 */
	public void setMatchalatte(Integer matchalatte) {
		this.matchalatte = matchalatte;
	}
	/**
	 * @return the milktealatte
	 */
	public Integer getMilktealatte() {
		return milktealatte;
	}
	/**
	 * @param milktealatte the milktealatte to set
	 */
	public void setMilktealatte(Integer milktealatte) {
		this.milktealatte = milktealatte;
	}
	/**
	 * @return the milk
	 */
	public Integer getMilk() {
		return milk;
	}
	/**
	 * @param milk the milk to set
	 */
	public void setMilk(Integer milk) {
		this.milk = milk;
	}
	@Override
	public String toString() {
		return "Porder [id=" + id + ", username=" + username + ", americano=" + americano + ", latte=" + latte
				+ ", espresso=" + espresso + ", caramelmacchiato=" + caramelmacchiato + ", cappuccino=" + cappuccino
				+ ", mochaccino=" + mochaccino + ", blacktea=" + blacktea + ", earlgreytea=" + earlgreytea
				+ ", matchalatte=" + matchalatte + ", milktealatte=" + milktealatte + ", milk=" + milk + "]\n";
	}



}
