package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "������";
		boolean gender = true;
		int age = 23;
		double height = 161.8D;
		float weigh = 44.3F;
		char bloodType = 'A';
		
		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " + name);
		if(gender) {
			System.out.println("���� : ����");
		} else {
			System.out.println("���� : ����");
		}
		System.out.printf("���� : %d��\n", age);
		System.out.printf("Ű : %.1fcm\n", height);
		System.out.printf("������ : %.1fkg\n", weigh);
		System.out.printf("������ : %c��\n", bloodType);

	}

}
