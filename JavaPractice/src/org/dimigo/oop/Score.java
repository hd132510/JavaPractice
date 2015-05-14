/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		int sum = kor + math + eng;
		double avg = (double) sum / 3;
		
		scanner.close();
		
		StringBuilder sb = new StringBuilder("\n<< 점수 출력 >>\n");
		sb.append("국어 점수 : " + kor + " 점\n");
		sb.append("수학 점수 : " + math + " 점\n");
		sb.append("영어 점수 : " + eng + " 점\n");
		sb.append("총점 : " + sum + " 점\n");
		sb.append("평균 : " + String.format("%.1f",avg) + " 점\n");
		
		System.out.println(sb);
	}
}
