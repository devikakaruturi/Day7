package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.FileLinecount;

class FilelinecountTest {

	@Test
	void test() {
		assertEquals(2, FileLinecount.LineCount());

	}

}
