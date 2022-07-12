package com.naver.object2;

public class Object2Main
{

	public static void main(String[] args)
	{
		System.out.println("프로그램 시작");
		System.out.println("");

		// 멤버변수 사용 -> 참조 변수명.변수명
		Method1 mt = new Method1();
		// 멤버 메서드 사용(메서드 호출) -> 참조변수명.메서드명()
		mt.test();
		
		Method2 mt1 = new Method2();
		mt1.info();

		System.out.println("");
		System.out.println("프로그램 종료");
	}

}
