package com.naver.object1.ex1;

public class StudentMain
{

	public static void main(String[] args)
	{
		System.out.println("---성적 처리 프로그램 시작---");
		// StudentController의 start 메서드 호출

		StudentController st = new StudentController();
		//class - StudentController, 변수명: st, 메서드: StudentController() - 소괄호(메서드)
		st.start();
		
		

		System.out.println("---프로그램 종료---");
	}
}
