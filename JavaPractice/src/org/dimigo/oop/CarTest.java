/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. ���� : 
 * 2. �ۼ��� : 2015. 4. 13.
 * </pre>
 *
 * @author		: ������
 * @version		: 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		/*Car2 car = new Car2("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		Car2 car2 = new Car2("����ڵ���", "K7", "���", 246, 40000000);
		Car2 car3 = new Car2("�Ｚ�ڵ���", "SM7", "ȸ��", 200, 38000000);*/
		Car3 car = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
		Car3 car2 = new Car3("����ڵ���", "K7", "���", 246);
		Car3 car3 = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		
		System.out.println("<< �ڵ��� ��� >>");
		System.out.println("������� : " + car.getCompany());
		System.out.println("�𵨸� : " + car.getModel());
		System.out.println("���� : " + car.getColor());
		System.out.println("�ִ�ӵ� : " + car.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car.getPrice()) + "��");
		System.out.println();
		
		/*car2.setCompany("����ڵ���");
		car2.setModel("K7");
		car2.setColor("���");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);*/
		
		System.out.println("������� : " + car2.getCompany());
		System.out.println("�𵨸� : " + car2.getModel());
		System.out.println("���� : " + car2.getColor());
		System.out.println("�ִ�ӵ� : " + car2.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car2.getPrice()) + "��");
		System.out.println();
		
		/*car3.setCompany("�Ｚ�ڵ���");
		car3.setModel("SM7");
		car3.setColor("ȸ��");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);*/
		
		System.out.println("������� : " + car3.getCompany());
		System.out.println("�𵨸� : " + car3.getModel());
		System.out.println("���� : " + car3.getColor());
		System.out.println("�ִ�ӵ� : " + car3.getMaxSpeed() + "km");
		System.out.println("���� : " + String.format("%,d", car3.getPrice()) + "��");
		System.out.println();
	}
}
