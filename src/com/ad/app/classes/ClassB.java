package com.ad.app.classes;

import com.ad.app.exceptions.TypeBException;
import com.ad.app.exceptions.TypeCException;

public class ClassB {

	public void methodB() throws TypeBException {
		
		try {
			new ClassC().methodC();
		} catch (TypeCException e) {
			throw new TypeBException("Wrapping Type C Exception in Class B and throwing it"/* , e */  ); // <-- uncomment second and run
		}
	}
}
