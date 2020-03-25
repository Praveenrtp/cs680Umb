package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	Student inStateStudent = Student.createInStateStudent("rtp", "boston");
	Student outStateStudent = Student.createOutStateStudent("praveen", "san jose", 20,"California");
	Student intlStudent = Student.createIntlStudent("praveenrtp", "india", 3211234, "india");

	

	@Test
	void testGetI20() {
		assertEquals(0, inStateStudent.getI20());
		assertEquals(0, outStateStudent.getI20());
		assertEquals(3211234, intlStudent.getI20());
		
	}
	
	@Test
	void testGetName() {
		assertEquals("rtp", inStateStudent.getName());
		assertEquals("praveen", outStateStudent.getName());
		assertEquals("praveenrtp", intlStudent.getName());
	}



	@Test
	void testGetYearsInState() {
		assertEquals(0, inStateStudent.getYearsInState());
		assertEquals(20, outStateStudent.getYearsInState());
		assertEquals(0, intlStudent.getYearsInState());
	}

	@Test
	void testGetState() {
		assertNull(inStateStudent.getState());
		assertEquals("California",outStateStudent.getState());
		assertNull(intlStudent.getState());
	}  
	
	@Test
	void testGetUsAddress() {
		assertEquals("boston", inStateStudent.getUsAddress());
		assertEquals("san jose", outStateStudent.getUsAddress());
		assertEquals("india", intlStudent.getUsAddress());
	}

	@Test
	void testGetForeignAddress() {
		assertNull(inStateStudent.getForeignAddress());
		assertNull(outStateStudent.getForeignAddress());
		assertEquals("india", intlStudent.getForeignAddress());
	}
	@Test
	void testCreateInStateStudentName() {
		Student student= Student.createInStateStudent("rtp", "boston");
		String name = "rtp";
		assertEquals(name, student.getName());
	}
	
	@Test
	void testCreateInStateStudentTuition() {
		Student student= Student.createInStateStudent("rtp", "boston");
		float actual = student.getTuition(); 
		float expected = 7000;
		assertEquals(expected, actual);
	
	}
	
	@Test
	void testCreateOutStateStudentAddress() {
		Student student = Student.createOutStateStudent("praveen", "san jose", 20,"California");
		String address = "san jose";
		assertEquals(address, student.getUsAddress());
	}
	
	@Test
	void testCreateOutStateStudentYearsInState() {
		Student student = Student.createOutStateStudent("praveen", "san jose", 20,"California");
		int expected = 20;
		assertEquals(expected, student.getYearsInState());
	}
	
	@Test
	void testCreateOutStateStudentState() {
		Student student = Student.createOutStateStudent("praveen", "san jose", 20,"California");
		String expected = "California";
		assertEquals(expected, student.getState());
	}
	
	@Test
	void testCreateOutStateStudentTuition() {
		Student student = Student.createOutStateStudent("praveen", "san jose", 20,"California");
		float actual = student.getTuition(); 
		float expected = 15000;
		assertEquals(expected, actual);
	
	}   
	
	@Test
	void testCreateIntlStudentForeignAddress() {
		Student student = Student.createIntlStudent("praveenrtp", "india", 3211234, "india");
		String address = "india";
		assertEquals(address, student.getForeignAddress());
	}
	
	@Test
	void testCreateIntlStudentTuition() {
		Student student = Student.createIntlStudent("praveenrtp", "india", 3211234, "india");
		float actual = student.getTuition(); 
		float expected = 30000;
		assertEquals(expected, actual);
	}
	

}
