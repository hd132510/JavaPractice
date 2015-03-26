package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String car = "고속버스";
		int fee;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.printf("통행료 : ");
		
		switch(car) {
		case "고속버스":
			fee = 850 + (distance-1) / 10 * 300;
			System.out.println(fee + "원");
			break;
		case "경차":
			fee = 300 + (distance-1) / 10 * 200;
			System.out.println(fee + "원");
			break;
		case "그 외":
			fee = 600 + (distance-1) / 10 * 200;
			System.out.println(fee + "원");
			break;
		default:
			System.out.println("계산 불가");
		}

	}

}
