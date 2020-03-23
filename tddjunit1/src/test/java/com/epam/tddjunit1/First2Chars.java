package com.epam.tddjunit1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


class First2Chars {
	RemoveA r;
	
	@BeforeEach
	void setup(){
		r = new RemoveA();
	}
	
	@Test
	void test2Chars() {
		assertEquals("B",r.delete("BA"));
	}
	@Test
	void test4Chars() {
		assertEquals("BA",r.delete("AABA"));
	}
	@Test
	void testNChars() {
		assertEquals("BAACC",r.delete("AABAACC"));
	}
	@Test
	void test1Chars() {
		assertEquals("B",r.delete("B"));
	}
	@Test
	void testEmptyChars() {
		assertEquals("",r.delete(""));
	}

}
