package pl.michaldurlak.SpringPlayground;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.michaldurlak.SpringPlayground.domain.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringPlaygroundApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testStudentToString(){
		String response = "Student{name='Andrzej', age=18, quest=Quest{description='Zdaj matematyke'}}";
		Student student = new Student("Andrzej",18);
		assertEquals(response,student.toString());
	}
	// testy z użyciem springa są bardzo ciężkie i trwają długo

}
