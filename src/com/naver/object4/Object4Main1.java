package com.naver.object4;

public class Object4Main1
{

	public static void main(String[] args)
	{
		Resume re = new Resume(); // new 뒤에 오는 것은 생성자 - 생성자 호출

		Car car1 = new Car();
		// company, brand, color, gear

		// car1.company = "쌍용";
		// car1.brand = "토레스";
		// car1.color = "하얀색";
		// car1.gear = true;
		
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();
	}
}
