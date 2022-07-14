package com.naver.object1.ex1;

import java.util.Scanner;

public class StudentController
{
	// 학생 정보 프로그램
	// 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
	// 2. 조회 - 모든 학생의 이름, 번호, 총점, 평균 출력
	// 3. 검색 - 검색할 학생 번호를 입력, 입력한 번호와 일치하는 학생의 정보(이름, 번호, 총점, 평균) 출력 (번호 없으면 재입력)
	// 4. 삭제 - 삭제할 학생 번호 입력, 입력한 번호와 일치하는 학생정보 삭제(배열 한칸 삭제 - 배열을 새로 만든다?) (번호 없으면
	// 재입력)
	// 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
	// 6. 프로그램 종료

	// 생성자 이용한 Scanner 입력
	// Scanner sc;
	// StudentView sv;
	// StudentService studentService;;
	// Student[] students;
	//
	// public StudentController()
	// {
	// sc = new Scanner(System.in);
	// sv = new StudentView();
	// studentService = new StudentService();
	// }

	Scanner sc = new Scanner(System.in);

	// start 메서드 선언
	public void start()
	{
		// Scanner sc = new Scanner(System.in);
		// 객체 생성
		StudentService ss = new StudentService(); // 학생 정보 입력
		Student[] student = null;
		String message = null;
		StudentView sv = new StudentView(); // 학생 정보 전체 조회

		boolean ch = true;
		// 1 ~ 6번 선택
		while (ch)
		{
			System.out.println("1. 입력, 2. 조회, 3. 검색, 4. 삭제, 5. 추가, 6. 프로그램 종료");
			int sel = sc.nextInt();
			if (sel == 1) // 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
			{ // StudentService - makeStudents
				// ss.makeStudents();
				student = ss.makeStudents();
			}
			else if (sel == 2) // 2. 조회 - 모든 학생의 이름, 번호, 총점, 평균 출력
			{ // StudentView - viewAll
				sv.view(student);
				// sv.viewOne(one);
				// sv.viewMessage(message);
			}
			else if (sel == 3) // 3. 검색 - 검색할 학생 번호를 입력, 입력한 번호와 일치하는 학생의 정보(이름, 번호, 총점, 평균) 출력 (번호 없으면 재입력)
			{
				// ss.findStudent(stu);
				Student stud = ss.findStudent(student);
				if (stud != null)
				{
					sv.view(stud);
				}
				else
				{
					sv.view("찾는 번호가 없음");
				}
			}
			else if (sel == 4) // 4. 삭제 - 삭제할 학생 번호 입력, 입력한 번호와 일치하는 학생정보 삭제(배열 한칸 삭제 - 배열을 새로 만든다?)
			// (번호 없으면 재입력)
			{
				System.out.println("삭제 창"); // 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
			}
			else if (sel == 5) // 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
			{
				// System.out.println("추가 창");
				ss.addStudent();
			}
			else if (sel == 6) // 6. 프로그램 종료
			{
				break;
			}
		}
	}
}
