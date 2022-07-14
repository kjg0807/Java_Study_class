package com.naver.object1.ex1;

import java.util.Scanner;

public class StudentService
{
	Scanner sc = new Scanner(System.in);

	// Scanner sc;
	//
	// public StudentService()
	// {
	// sc = new Scanner(System.in);
	// }

	// makeStudents - 학생 수 입력 -> 수 만큼 정보 입력(이름, 번호 ,국영수, (총점, 평균 자동계산))
	// 학생을 리턴
	public Student[] makeStudents()
	{
		System.out.println("학생 수 입력");
		int count = sc.nextInt();

		Student[] stu = new Student[count];
		int i;
		for (i = 0; i < stu.length; i++)
		{
			Student stud = new Student();
			System.out.println((i + 1) + "번째 학생 이름 입력");
			stud.name = sc.next();
			System.out.println((i + 1) + "번째 학생 번호 입력");
			stud.number = sc.nextInt();
			System.out.println((i + 1) + "번째 국어 점수 입력");
			stud.kor = sc.nextInt();
			System.out.println((i + 1) + "번째 영어 점수 입력");
			stud.eng = sc.nextInt();
			System.out.println((i + 1) + "번째 수학 점수 입력");
			stud.math = sc.nextInt();

			// stud.total = stud.kor + stud.eng + stud.math;
			// stud.avg = stud.total / 3.0;
			stud.setTotal();

			stu[i] = stud; // -> 없으면 입력(저장)안됨
		}
		return stu;
	}

	// findStudent - 검색하고 싶은 학생의 번호를 입력하여
	// 같은 번호의 학생을 찾아 그 학생 1명 리턴 없으면 null 리턴
	// 찾은 학생의 정보 출력
	public Student findStudent(Student[] stu)
	{
		System.out.println("번호 입력");
		int num = sc.nextInt();
		Student stud = null; // 리턴하려는 학생 데이터
		for (int i = 0; i < stu.length; i++)
		{
			if (num == stu[i].number)
			{
				stud = stu[i];
				break;
			}
		}
		return stud;
	}

	// addStudent - 학생 한명 추가, 학생 정보들을 리턴
	public void addStudent()
	{
		System.out.println("1명 학생 정보 추가");

		//return stud;
	}
}
