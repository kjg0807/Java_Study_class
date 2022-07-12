package com.naver.object1;

public class ObjectMain
{
	public static void main(String[] args)
	{
		System.out.println("프로그램 시작");
		System.out.println("");
		// Object 생성
		// Class명(맨앞 대문자) 변수명(맨앞 소문자) = new class명(생성자)
		Monster monster = new Monster();
		// System.out.println(monster);
		// 멤버변수 접근 방식
		// 변수명(주소).멤버명

		monster.name = "오크"; // moster 데이터 타입 - monster(주소 값), name 데이터 타입 - String
		monster.HP = "100";
		monster.level = "5";

		System.out.println("몬스터 1: " + monster.name + ", 체력: " + monster.HP + ", 레벨: " + monster.level + "레벨");

		Monster monster2 = new Monster();
		monster2.name = "드래곤";
		monster2.HP = "100만"; // 1만
		monster2.level = "200";

		System.out.println("몬스터 2: " + monster2.name + ", 체력: " + monster2.HP + ", 레벨: " + monster2.level + "레벨");

		Weapon weapon = new Weapon();
		weapon.name = "목검";
		weapon.demage = "10";
		weapon.Enchant = "2";
		Weapon weapon1 = new Weapon();
		weapon1.name = "브레스";
		weapon1.demage = "1만";
		weapon1.Enchant = "0";

		monster.weapon = weapon;
		monster2.weapon = weapon1;

		System.out.println(
				monster.name + "의 무기: " + monster.weapon.name + ", 공격력: " + monster.weapon.demage + ", 강화: " + monster.weapon.Enchant + "레벨");
		System.out.println(monster2.name + "의 무기: " + monster2.weapon.name + ", 공격력: " + monster2.weapon.demage);

		System.out.println("");
		System.out.println("프로그램 종료");
	}
}
