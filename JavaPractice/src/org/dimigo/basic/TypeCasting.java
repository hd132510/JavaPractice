package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int salary = 1700000;
		byte clerkNum = 3;
		int num = 1500;
		long yearlySalary = (long) salary * 12 * clerkNum * num;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%d", clerkNum) + "명");
		System.out.println("점포 수 : " + String.format("%,d", num) + "개\n");
		System.out.println("연간 인번기 : " + String.format("%,d", yearlySalary) + "원");
		

	}

}
