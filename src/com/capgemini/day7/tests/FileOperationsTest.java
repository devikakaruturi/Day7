package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.FileOperations;

class FileOperationsTest {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\devika\\text.txt","C:\\devika\\Revout.txt"));
		assertEquals(true, FileOperations.convert("C:\\devika\\text.txt","C:\\devika\\Conout.txt"));
		assertEquals(true, FileOperations.compare("C:\\devika\\text.txt","C:\\devika\\Wordcount.txt"));
	}
}
