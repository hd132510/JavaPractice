/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car2
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 16.
 * </pre>
 *
 * @author		: ������
 * @version		: 1.0
 */
public class Car2 {
	private String company = "�����ڵ���";
	private String model = "���׽ý�";
	private String color = "������";
	private int maxSpeed = 225;
	private int price = 50000000;
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}

}
