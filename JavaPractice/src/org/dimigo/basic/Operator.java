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
		String aName = "��ٸ���";
		String bName = "����纯��";
		
		System.out.println("<< ���� ���� �� >> ");
		System.out.println(aName + " ���� : " + aArea);
		System.out.println(bName + " ���� : " + bArea + "\n");
		
		if(aArea > bArea) {
			System.out.println(aName + "�� " + bName + " ���� " + (aArea - bArea) + " �� Ů�ϴ�");
		}
		else if(aArea == bArea) {
			System.out.println(aName + "�� " + bName + " ���̰� �����ϴ�");
		}
		else {
			System.out.println(bName + "�� " + aName + " ���� " + (bArea - aArea) + " �� Ů�ϴ�");
		}
		

	}

}
