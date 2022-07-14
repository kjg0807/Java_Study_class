package com.naver.object1.ex1;

public class Student
{// 학생의 구성요소 - 이름, 번호, 국어, 영어, 수학점수 입력 - 총점, 평균 계산
	private String name;
	private int number;
	private int kor, math, eng;
	private double total, avg;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public int getKor()
	{
		return kor;
	}

	public void setKor(int kor)
	{
		this.kor = this.checkPoint(kor);
	}

	public int getMath()
	{
		return math;
	}

	public void setMath(int math)
	{
		this.math = this.checkPoint(math);
	}

	public int getEng()
	{
		return eng;
	}

	public void setEng(int eng)
	{
		this.eng = this.checkPoint(eng);
	}

	public double getTotal()
	{
		return total;
	}

	private int checkPoint(int point)
	{
		if (point < 0 || point > 100)
		{
			return 0;
		}
		else
		{
			return point;
		}
	}

	public double getAvg()
	{
		return avg;
	}

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
