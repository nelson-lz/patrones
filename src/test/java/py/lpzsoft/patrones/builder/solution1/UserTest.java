package py.lpzsoft.patrones.builder.solution1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void userWhitPatern() {
		User user = new User().builder("abc123", "loquillo", "Loquillo").adult().profession("teacher").build();
		assertEquals("abc123", user.getId());
		assertEquals("loquillo", user.getNick());
		assertEquals("Loquillo", user.getName());
		assertEquals(18, user.getAge());
		assertEquals("teacher", user.getProfession());
	}

}
