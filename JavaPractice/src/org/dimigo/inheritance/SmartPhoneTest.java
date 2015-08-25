/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone s1 = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone s2 = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(s1);
		s1.turnOn();
		s1.pay();
		s1.useSpecialFunction();
		s1.turnOff();
		System.out.println();
		
		System.out.println(s2);
		s2.turnOn();
		s2.pay();
		s2.useSpecialFunction();
		s2.turnOff();
		
	}

}
