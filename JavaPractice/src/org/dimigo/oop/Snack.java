/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Snack
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class Snack {

	private String name;
	private String company;
	private int price;
	private int num;
	
	public Snack(String name, String company, int price, int num) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.num = num;
	}
	
	public void printSnack() {
		System.out.println("이름 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("가격 : " + String.format("%,d", price) + "원");
		System.out.println("개수 : " + num + "개");
		System.out.println();
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
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

}
