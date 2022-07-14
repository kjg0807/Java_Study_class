package com.naver.object1.ex1;

public class Student
{// 학생의 구성요소 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
	public String name;
	int number;
	int kor, math, eng;
	double total, avg;

	public void setTotal() // 지역 변수? - () 없으면 변수 있으면 메서드
	{
		this.total = this.kor + this.eng + this.math; // 파란색 멤버변수?
		this.setAvg();
	}

	public void setAvg()
	{
		this.avg = this.total / 3.0;
	}
}
