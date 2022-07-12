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
}
