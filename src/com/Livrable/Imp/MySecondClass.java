package com.Livrable.Imp;

import com.Livrable.inter.AutreInterface;
import com.Livrable.inter.MyInterface;

public class MySecondClass implements MyInterface, AutreInterface{

	@Override
	public int laSomme(int val1, int val2) {
		// TODO Auto-generated method stub
		return val1- val2;
	}
	@Override
	public String presentation() {
		// TODO Auto-generated method stub
		return "Je viens de la classe: MySecondClass";
	}
}
