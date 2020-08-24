import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Student s1;
	private Student s2;

	@Before
	public void setUp() throws Exception {
		s1 = new Student("001", "Nigel", "primary 5", "W67A", "Magdelene", "Jack", "Jack@gmail.com");

		s2 = new Student("003", "Mary", "primary 6", "W67F", "Joyce", "Richard", "Richard@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addStudentTest() {
		//Test that studentlist is not null
		
		assertNotNull("Test that studentlist is not null",StudentDB.studentlist);
		//Test that the size of studentlist is 0 before adding any student
		assertEquals("Test that the size of studentlist is 0 before adding any student",0,StudentDB.studentlist.size());
		//Test that the size of the student arraylist is 1 after adding 1 student
		StudentDB.addStudent(s1);
		assertEquals("Test that the size of the student arraylist is 1 after adding 1 student",1,StudentDB.studentlist.size());
		//Test that the size of studentlist is zero after removing student
		StudentDB.addStudent(s1);
		assertEquals("Test that the size of studentlist is 1 after removing 1 student",2,StudentDB.studentlist.size());
		
	}

}
