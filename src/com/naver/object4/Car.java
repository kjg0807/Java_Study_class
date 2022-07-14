package com.naver.object4;

public class Car
{
	// 자동차 - 제조사, 브랜드, 색, 기어
	String company;
	String brand;
	String color;
	String gear; // 오토 - Auto, 수동 - Manual

	// instance 초기화 블럭 {}
	// {
	// this.company = "기아";
	// this.brand = "K5";
	// this.color = "black";
	// this.gear = "오토";
	// }

	public Car() // 매개변수
	{
		this.company = "현대";
		this.brand = "아반떼";
		this.color = "White";
		this.gear = "Auto";
	}

	public Car(String color) // 매개변수
	{
		this.company = "현대";
		this.brand = "아반떼";
		this.color = color;
		this.gear = "Auto";
	}

	public Car(String brand, String color)
	{
		this.company = "현대";
		this.brand = brand;
		this.color = color;
		this.gear = "Auto";
	}

	public void info()
	{
		System.out.println("Company: " + this.company + ", Brand: " + this.brand + ", Color: " + this.color + ", Gear: "
				+ this.gear);
	}
}
