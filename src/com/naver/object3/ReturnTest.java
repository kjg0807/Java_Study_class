package com.naver.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest
{
	public int makeRandom()
	{
		Random random = new Random();
		// 참조변수명 - random
		int num = random.nextInt(50); // 50 - 인자값

		return num; // return 하려는 Data
		// return '3'; // ' ' 는 char 타입이지만 int로 형변환됨
	}

	public int[] makeRandom2(int count) // 호출시 숫자를 받아서 그 수(3)만큼 랜덤한 수(3개)를 뽑아서 return 시킨다.
	{
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// System.out.println("뽑을 숫자의 갯수 입력");
		// int a = sc.nextInt();

		int[] nums = new int[count];
		for (int i = 0; i < count; i++)
		{
			// int r = ran.nextInt(50);
			// nums[i] = r;
			nums[i] = ran.nextInt(50);
		}
		return nums;
	}

	// make Account - 은행, host, 통장번호, 잔액 받아서 return
	// 호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 return
	public Account bank()
	{
		Scanner sc = new Scanner(System.in);
		// Random random = new Random();
		Account account = new Account();

		// System.out.println("은행 입력");
		// String title = sc.next();
		// System.out.println("통장 주인 이름 입력");
		// String host = sc.next();
		// System.out.println("계좌 번호 입력");
		// String number = sc.next();
		// System.out.println("입력할 잔액");
		// String money = sc.next();
		account.title = "신한";
		account.host = "iu";
		account.number = "123456789";
		account.money = "2000만원";
		System.out.println("--------------------------");
		System.out.println("은행: " + account.title + ", 통장주인: " + account.host + ", 계좌번호: " + account.number + ", 잔액: "
				+ account.money);

		return account;
		// System.out.println("은행: " + title + ", 통장 주인: " + host + ", 계좌번호: " + number + ", 잔액: " + money);
	}

	public void info()
	{
		System.out.println("실행 후 그냥 종료");
	}
}
