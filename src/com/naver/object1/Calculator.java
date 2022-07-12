package com.naver.object1;

import java.util.Scanner;

public class Calculator
{
	Scanner sc = new Scanner(System.in);

	// 메소드
	static int plus(int x, int y)
	{
		return x + y;
	}

	static int mi(int x, int y)
	{
		return x - y;
	}

	static int c(int x, int y)
	{
		return x * y;
	}

	static double l(double x, double y)
	{
		return x / y;
	}

	void execute()
	{
		double rs = 0;
		System.out.println("---계산기---");
		System.out.println("첫번째 숫자 입력");
		int x = sc.nextInt();
		System.out.println("연산기호 입력(+, -, *, /)");
		String z = sc.next();
		System.out.println("두번째 숫자 입력");
		int y = sc.nextInt();

		switch (z)
			{
			case "+":
				{
					rs = Calculator.plus(x, y);
					break;
				}
			case "-":
				{
					rs = Calculator.mi(x, y);
					break;
				}
			case "*":
				{
					rs = Calculator.c(x, y);
					break;
				}
			case "/":
				{
					rs = Calculator.l(x, y);
					break;
				}
			default:
				{
					System.out.println("연산자 올바르게 재입력");
				}
			}
		System.out.println("실행 결과: " + rs);
	}

	void println(String msg)
	{
		System.out.println(msg);
	}

	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.execute();
	}
}
