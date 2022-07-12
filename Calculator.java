package com.naver.array;

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

	double avg(int x, int y)
	{
		double sum = plus(x, y);
		double rs = sum / 2;
		return rs;
	}

	void execute()
	{
		double rs = 0;
		System.out.println("첫번째 숫자 입력");
		int x = sc.nextInt();
		System.out.println("연산기호 입력(+, -, *, /)");
		String z = sc.next();
		System.out.println("두번째 숫자 입력");
		int y = sc.nextInt();

		if (z == "+")
		{
			rs = Calculator.plus(x, y);
		}
		else if (z == "-")
		{
			rs = Calculator.mi(x, y);
		}
		else if (z == "*")
		{
			rs = Calculator.c(x, y);
		}
		else if (z == "/")
		{
			rs = Calculator.l(x, y);
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
