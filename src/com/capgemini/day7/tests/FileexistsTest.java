package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileexistsTest {

	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\devika\\SetCar.java");
		assertEquals(true, file.exists());
		assertEquals(true, file.isFile());
	}
}
