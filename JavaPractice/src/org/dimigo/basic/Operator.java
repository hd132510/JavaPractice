package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 10;
		double a3 = 5.8;  
		int b1 = 9;
		double b2 = 5.4;
		double aArea = (a1+a2)*a3/2;
		double bArea = b1*b2;
		String aName = "사다리꼴";
		String bName = "평행사변형";
		
		System.out.println("<< 도형 넓이 비교 >> ");
		System.out.println(aName + " 넓이 : " + aArea);
		System.out.println(bName + " 넓이 : " + bArea + "\n");
		
		if(aArea > bArea) {
			System.out.println(aName + "이 " + bName + " 보다 " + (aArea - bArea) + " 더 큽니다");
		}
		else if(aArea == bArea) {
			System.out.println(aName + "과 " + bName + " 넓이가 같습니다");
		}
		else {
			System.out.println(bName + "이 " + aName + " 보다 " + (bArea - aArea) + " 더 큽니다");
		}
		

	}

}
