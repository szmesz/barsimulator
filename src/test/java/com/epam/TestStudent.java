package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStudent {

	Student student;

	@Before

	public void setUp() {
		student = new Student();
	}

	@Test

	public void testWhenStudiedShouldScholarshipIncreasedByTheNumberOfHoursStudied() {

		student.studied(3);
		
		assertEquals(3, student.getScholarship());

	}

}
