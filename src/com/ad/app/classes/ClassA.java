package com.ad.app.classes;

import com.ad.app.exceptions.TypeAException;
import com.ad.app.exceptions.TypeBException;

public class ClassA {

	public void methodA() throws TypeAException {
		try {
			new ClassB().methodB();
		} catch (TypeBException e) {
			throw new TypeAException("Wrapping Type B Exception in Class A and throwing it"/* , e */); // <-- uncomment first and run
		}
	}
}
