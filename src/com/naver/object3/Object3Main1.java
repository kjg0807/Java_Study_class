package com.naver.object3;

public class Object3Main1
{

	public static void main(String[] args)
	{
		ReturnTest rt = new ReturnTest();
		int i;
		rt.info();

		int a = rt.makeRandom(); // 0~49 랜덤한 숫자 뽑음
		System.out.println(a);
		System.out.println("--------------------------");

		int[] a1 = rt.makeRandom2(5);
		for (i = 0; i < a1.length; i++)
		{
			System.out.println(a1[i]);
		}
	}
}
