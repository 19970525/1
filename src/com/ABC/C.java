package com.ABC;

import java.util.Arrays;

/**
*这是文档注释
*@author 作者：彭俊
*@version 创建时间:2018年9月7日
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
