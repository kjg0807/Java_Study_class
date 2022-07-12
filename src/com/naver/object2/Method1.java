package com.naver.object2;

public class Method1
{
	// -> []안은 필요하면 사용

	// 멤버 변수 선언
	// 접근지정자 [그외 지정자] data type 변수명;

	// 멤버 매서드 선언 공식
	// 접근지정자 [그외 지정자] return type 메서드명([매개 변수 선언])
	// { 실행할 코드 작성}

	// 접근지정자: public, static
	// 그외지정자: 생략
	// return type: void
	// method name: 마음대로 생성, 첫글자는 소문자 - (class만 첫글자 대문자 사용가능)
	// 매개변수: 생략

	public void test() // 맴버 매서드 선언
	{
		System.out.println("Test Method Start");
		int num = 10;
		System.out.println(num);
	}

}
