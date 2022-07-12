package com.naver.object1.ex1;

import java.util.Scanner;

public class Ex1Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.println("");

		int i;
		Student st = null;
		// Student stu = new Student();
		// Student stu1 = new Student(); -> 여러 개 선언하는 것은 반복문 사용
		int a = 2;
		Student[] stu = new Student[a];
		for (i = 0; i < a; i++)
		{
			st = new Student();

			System.out.println("이름 입력");
			st.name = sc.next();
			stu[i] = st;
			System.out.println("번호 입력");
			st.number = sc.nextInt();
			stu[i] = st;
			System.out.println("국어 점수 입력");
			st.kor = sc.nextInt();
			stu[i] = st;
			System.out.println("영어 점수 입력");
			st.eng = sc.nextInt();
			stu[i] = st;
			System.out.println("수학 점수 입력");
			st.math = sc.nextInt();
			stu[i] = st;
			st.total = st.kor + st.eng + st.math; // 총점 계산
			stu[i] = st;
			st.avg = st.total / 3.0; // 평균 계산
			stu[i] = st;
		}
		for (i = 0; i < a; i++)
		{
			System.out.println(stu[i].name + "님의 번호: " + stu[i].number + ", 국어: " + stu[i].kor + "점, 영어: " + stu[i].eng + "점, 수학: " + stu[i].math
					+ "점, 총점: " + stu[i].total + "점, 평균: " + String.format("%.2f", stu[i].avg) + "점");
		}

		System.out.println("");
		System.out.println("프로그램 종료");
	}

}
