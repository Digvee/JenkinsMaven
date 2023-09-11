package com.digvee.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void subTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(15, myCalc.subNumbers(20, 5));
	}
	
	@Test
	public void mulTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(30, myCalc.mulNumbers(15, 2));
	}

}
