package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String car = "고속버스";
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		switch(car) {
		case "고속버스":
			System.out.println("차종 : " + car);
			int fee1 = 850 + (distance-1) / 10 * 300;
			System.out.println("통행료 : " + fee1 + "원");
			break;
		case "경차":
			System.out.println("차종 : " + car);
			int fee2 = 300 + (distance-1) / 10 * 200;
			System.out.println("통행료 : " + fee2 + "원");
			break;
		case "그 외":
			System.out.println("차종 : " + car);
			int fee3 = 600 + (distance-1) / 10 * 200;
			System.out.println("통행료 : " + fee3 + "원");
			break;
		default:
			System.out.println("계산 불가");
		}

	}

}
