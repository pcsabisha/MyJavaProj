package com.ictacademy.stud;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalTest {
	Calculatefunctions ctest=new Calculatefunctions();

	@Test
	void test()
	{
	double tsi=	ctest.simpleinterest(2000,3, 10);
		assertEquals(600,tsi);
	double tci=ctest.compoundinterest(2500, 10,3);	
			assertEquals(827.5000000000009,tci);
			
	double peritest=ctest.peri_rect(9.0, 5.0)	;
	assertEquals(28,peritest);
		
	Assertions.assertArrayEquals(new int[]{4,2}, ctest.swap(new int[]{2},new int[]{4}));
	}

}
