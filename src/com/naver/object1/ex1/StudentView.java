package com.naver.object1.ex1;

import java.util.Scanner;

public class StudentView
{
	// view message - 문자열을 받아 그 문자열을 출력
	public String view(String message)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		return message;
	}

	// view one - 학생 1명의 정보를 받아 모든 정보 출력
	public void view(Student stu)
	{
		System.out.println("이름: " + stu.name + " 번호: " + stu.number + " 총점: " + stu.total + " 평균: " + stu.avg);
	}

	// viewAll - 학생 정보를 받아 모든 정보 출력 - 이름, 번호, 국어, 영어, 수학, 총점, 평균
	public Student[] view(Student[] stu)
	{
		int i;
		for (i = 0; i < stu.length; i++)
		{
			System.out.println("이름: " + stu[i].name + " 번호: " + stu[i].number + " 국어: " + stu[i].kor + " 영어: "
					+ stu[i].eng + " 수학: " + stu[i].math + " 총점: " + stu[i].total + " 평균: " + stu[i].avg);
		}
		return stu;
	}
}
