package com.naver.object2;

public class Object2Main3
{

	public static void main(String[] args)
	{
		Method3 m3 = new Method3();
		// 월급 입력
		int salary = 5000000;
		m3.sal(salary);
		// m3.hap(10, 20);
		m3.info("iu", 30, "in@gmail.com");

		Member member = new Member();
		member.name = "suji";
		member.age = 30;
		member.email = "suji@naver.com";
		
		m3.info2(member);
		//System.out.println(member.age);
	}
}
