package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weigh = 44.3F;
		char bloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		if(gender) {
			System.out.println("성별 : 여자");
		} else {
			System.out.println("성별 : 남자");
		}
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fkg\n", weigh);
		System.out.printf("혈액형 : %c형\n", bloodType);

	}

}
