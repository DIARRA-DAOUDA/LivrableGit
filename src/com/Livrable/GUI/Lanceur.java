package com.Livrable.GUI;

import com.Livrable.Imp.MyClass;
import com.Livrable.Imp.MySecondClass;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		myClass.autreMethode();
		int reslut1 = myClass.laSomme(55, 78);
		System.out.println(reslut1);
		System.out.println(myClass.presentation());
		
		
		MySecondClass mySecondClass = new MySecondClass();
		mySecondClass.autreMethode();
		int result2 = mySecondClass.laSomme(89, 87);
		System.out.println(result2);
		System.out.println(mySecondClass.presentation());
		
	}

}
