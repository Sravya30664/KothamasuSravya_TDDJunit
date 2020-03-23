package com.epam.Junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RemoveATest {
	RemoveA a;
    @Before
    public void init() {
    	a=new RemoveA();
    }
	@Test
	public void removeAtest1() {
		assertEquals("BCD", a.removeAfrom("ABCD"));
	}
	
	@Test
	public void removeAtest2() {
		assertEquals("CD", a.removeAfrom("AACD"));
	}
	@Test
	public void removeAtest3() {
		assertEquals("BCD", a.removeAfrom("BACD"));
	}
	@Test
	public void removeAtest4() {
		assertEquals("BBAA", a.removeAfrom("BBAA"));
	}
	@Test
	public void removeAtest5() {
		assertEquals("BAA", a.removeAfrom("AABAA"));
	}
	@Test
	public void removeAtest6() {
		assertEquals("", a.removeAfrom(""));
	}

}
