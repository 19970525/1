package com.ABC;

import java.util.Arrays;

/**
*�����ĵ�ע��
*@author ���ߣ���
*@version ����ʱ��:2018��9��7��
*@version 1.0
*@exception 
*TODO
*/
public class C extends B {

	protected int c = 3;
	
	@Override
	public Integer f() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Integer ff() {
		// TODO Auto-generated method stub
		return 33;
	}

	public Integer fff() {
		return 333;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x = new C();
		B y = (B)x;
		System.out.println(y.ff());
		
	}

}
