package com.naver.object1.ex1;

import java.util.Scanner;

public class Ex1Main2
{
	public static void main(String[] args)
	{
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);

		int i;
		Student[] stu = new Student[3];
		Student st = null;
		// Student st = new Student();
		// 안되는 이유: st가 반복문 안에 없어서(new Student가 생성안됨) 처음, 중간에 입력한 값은 마지막 값으로 덮어씌워진다 -> 마지막 값만 출력

		for (i = 0; i < stu.length; i++)
		{
			st = new Student();

			System.out.println("이름 입력");
			st.name = sc.next(); // a, b, c
			stu[i] = st;
		}
		for (i = 0; i < stu.length; i++)
		{
			System.out.println(stu[i].name);
		}
	}
}
