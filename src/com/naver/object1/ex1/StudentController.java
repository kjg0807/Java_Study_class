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

	// start 메서드 선언
	public void start()
	{
		Scanner sc = new Scanner(System.in);

		boolean ch = true;
		// 1 ~ 6번 선택
		while (ch)
		{
			System.out.println("1. 입력, 2. 조회, 3. 검색, 4. 삭제, 5. 추가, 6. 프로그램 종료");
			int sel = sc.nextInt();
			if (sel == 1) // 1. 입력 - 학생 수를 입력 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
			{
				System.out.println("입력 창");
			}
			else if (sel == 2) // 2. 조회 - 모든 학생의 이름, 번호, 총점, 평균 출력
			{
				System.out.println("조회 창");
			}
			else if (sel == 3) // 3. 검색 - 검색할 학생 번호를 입력, 입력한 번호와 일치하는 학생의 정보(이름, 번호, 총점, 평균) 출력 (번호 없으면 재입력)
			{
				System.out.println("검색 창");
			}
			else if (sel == 4) // 4. 삭제 - 삭제할 학생 번호 입력, 입력한 번호와 일치하는 학생정보 삭제(배열 한칸 삭제 - 배열을 새로 만든다?)
			// (번호 없으면 재입력)
			{
				System.out.println("삭제 창"); // 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
			}
			else if (sel == 5) // 5. 추가 - 이름, 번호, 국어, 영어, 수학, 입력 후, 총점, 평균 계산
			{
				System.out.println("추가 창");
			}
			else if (sel == 6) // 6. 프로그램 종료
			{
				break;
			}
		}
	}
}