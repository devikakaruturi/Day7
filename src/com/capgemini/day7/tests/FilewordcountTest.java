package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Filewordcount;

class FilewordcountTest {

	@Test
	void test() {
		assertEquals(7,Filewordcount.wordCount());
	}

}
