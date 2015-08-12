package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		long salary = 1700000L;
		byte clerkNum = 3;  
		int num = 1500;
		long yearlySalary = salary * 12 * clerkNum * num;
	
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", salary) + "��");
		System.out.println("���� �� ���� �� : " + String.format("%d", clerkNum) + "��");
		System.out.println("���� �� : " + String.format("%,d", num) + "��\n");
		System.out.println("���� �ΰǺ� : " + String.format("%,d", yearlySalary) + "��"); 
		

	}

}
