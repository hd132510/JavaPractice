package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int salary = 1700000;
		byte clerkNum = 3;
		int num = 1500;
		long yearlySalary = (long) salary * 12 * clerkNum * num;
		
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", salary) + "��");
		System.out.println("���� �� ���� �� : " + String.format("%d", clerkNum) + "��");
		System.out.println("���� �� : " + String.format("%,d", num) + "��\n");
		System.out.println("���� �ι��� : " + String.format("%,d", yearlySalary) + "��");
		

	}

}
