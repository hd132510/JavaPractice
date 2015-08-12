package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String car = "��ӹ���";
		int fee;
		
		if(distance <= 0) {
			System.out.println("�Ÿ��� �̻��մϴ�.");
			return;
		}
		
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : " + distance + "km");
		System.out.println("���� : " + car);
		System.out.printf("����� : ");
		
		switch(car) {
		case "��ӹ���":
			fee = 850 + (distance-1) / 10 * 300;
			System.out.println(fee + "��");
			break;
		case "����":
			fee = 300 + (distance-1) / 10 * 200;
			System.out.println(fee + "��");
			break;
		case "�� ��":
			fee = 600 + (distance-1) / 10 * 200;
			System.out.println(fee + "��");
			break;
		default:
			System.out.println("��� �Ұ�");
		}

	}

}
