/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String singer = "빅뱅";
		String actor = "조인성"; 
		String subject = "자바";
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if(answer.equals(singer)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if(answer.equals(actor)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		System.out.println();
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if(answer.equals(subject)) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅜㅜ");
		}
		
		scanner.close();

	}

}
