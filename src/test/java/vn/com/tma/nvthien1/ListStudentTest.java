package vn.com.tma.nvthien1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ListStudentTest {
	
	@InjectMocks
	ListStudent list;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		list.addStudent(new Student("A", 7, 8, 9));
		list.addStudent(new Student("B", 8, 8, 8));
		list.addStudent(new Student("C", 9, 9, 9));
	}

	@Test
	public void testFindLargest() {
		assertEquals("C", list.findLargest().getName());
	}

	@Test
	public void testFindLowest() {
		//Test wrong result
		assertEquals("A", list.findLowest().getName());
	}

}
