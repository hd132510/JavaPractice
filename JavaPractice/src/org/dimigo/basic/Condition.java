package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String car = "��ӹ���";
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + distance + "km");
		switch(car) {
		case "��ӹ���":
			System.out.println("���� : " + car);
			int fee1 = 850 + (distance-1) / 10 * 300;
			System.out.println("����� : " + fee1 + "��");
			break;
		case "����":
			System.out.println("���� : " + car);
			int fee2 = 300 + (distance-1) / 10 * 200;
			System.out.println("����� : " + fee2 + "��");
			break;
		case "�� ��":
			System.out.println("���� : " + car);
			int fee3 = 600 + (distance-1) / 10 * 200;
			System.out.println("����� : " + fee3 + "��");
			break;
		default:
			System.out.println("��� �Ұ�");
		}

	}

}
