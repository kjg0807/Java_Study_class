package com.naver.object2;

public class Method3
{
	// sal
	public void sal(int salary)
	{
		// 월급 계산
		// 1. 정규직
		// 2. 비정규직 - 3.3% 수수료 - 월급 * 96.7
		System.out.println("월급 계산");
		System.out.println(salary * 0.967);
		salary = 20;
	}

	public void hap(int num1, int num2)
	{
		System.out.println(num1 + num2);
	}

	// info: 이름, 나이, 이메일 주소 받아서 출력
	public void info(String name, int age, String email)
	{
		System.out.println(name + " " + age + " " + email);
	}

	public void info2(Member member)
	{
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		member.age = 100;
	}

}
