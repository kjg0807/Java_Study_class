package com.naver.object2;

public class Object2Main4
{

	public static void main(String[] args)
	{
		Member member = new Member();
		member.name = "iu";
		member.age = 30;
		member.email = "iu@naver.com";

		Member member2 = new Member();
		member2.name = "suji";
		member2.age = 30;
		member2.email = "suji@naver.com";

		Member member3 = new Member();
		member3.name = "choa";
		member3.age = 30;
		member3.email = "choa@naver.com";

		Member[] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;

		Method4 m4 = new Method4();
		m4.info(members);

		System.out.println(members.length);
	}
}
