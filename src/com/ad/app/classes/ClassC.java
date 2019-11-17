package com.ad.app.classes;

import com.ad.app.exceptions.TypeCException;

public class ClassC {

	public void methodC() throws TypeCException {
		throw new TypeCException("Initial point of throwing Type C Exception");
	}
}
