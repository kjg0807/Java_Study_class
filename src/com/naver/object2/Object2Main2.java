package com.naver.object2;

import java.util.Scanner;

public class Object2Main2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int i;
		System.out.println("1. 강아지, 2. 고양이, 3. 호랑이");
		int sel = sc.nextInt();
		System.out.println("횟수 입력");
		int count = sc.nextInt();
		for (i = 0; i < count; i++)
		{
			AnimalSound as = new AnimalSound();
			if (sel == 1)
			{
				as.dogsound();
			}
			else if (sel == 2)
			{
				as.catsound();
			}
			else if (sel == 3)
			{
				as.tigersound();
			}
		}
	}
}
