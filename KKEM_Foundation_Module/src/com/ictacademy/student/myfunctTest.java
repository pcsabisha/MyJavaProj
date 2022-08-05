package com.ictacademy.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myfunctTest {
	myfunction mtest=new myfunction();
	

	@Test
	void test() {
		int o=mtest.great(4, 6);
		assertEquals(10,o);
	}

}
