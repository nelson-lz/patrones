package py.lpzsoft.patrones.builder.solution2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void userWhitPaternPartial() {
		User user = User.builder().id("a12").nick("hello").name("HelloWorld").age(16).familyName("Programing").build();
		assertEquals("a12", user.getId());
		assertEquals("hello", user.getNick());
		assertEquals("HelloWorld", user.getName());
		assertEquals("Programing", user.getFamilyName());
		assertEquals(16, user.getAge());
	}
	@Test
	void userWhitPaternFull() {
		User user = User.builder().id("a12").nick("hello").name("HelloWorld").familyName("Programing").age(16)
				.phone(123456).profession("CodeLinter").tag("#code").tag("#linter").build();
		assertEquals("a12", user.getId());
		assertEquals("hello", user.getNick());
		assertEquals("HelloWorld", user.getName());
		assertEquals("Programing", user.getFamilyName());
		assertEquals(16, user.getAge());
		assertEquals(123456, user.getPhone());
		assertEquals("CodeLinter", user.getProfession());
		assertEquals(2, user.getTag().size());
	}
}
