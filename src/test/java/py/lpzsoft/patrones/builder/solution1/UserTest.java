package py.lpzsoft.patrones.builder.solution1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void userWhitPaternPartial() {
		User user = User.builder("abc123", "loquillo", "Loquillo").adult().profession("teacher").build();
		assertEquals("abc123", user.getId());
		assertEquals("loquillo", user.getNick());
		assertEquals("Loquillo", user.getName());
		assertEquals(18, user.getAge());
		assertEquals("teacher", user.getProfession());
	}
	@Test
	void userWhitPaternFull() {
		User user = User.builder("abc123", "loqui", "Loquillo").adult()
				.profession("teacher").tag("#pillo").familyName("Fernandez")
				.phone(123456789).tag("#PajaroLoco").build();
		assertEquals("abc123", user.getId());
		assertEquals("loqui", user.getNick());
		assertEquals("Loquillo", user.getName());
		assertEquals(18, user.getAge());
		assertEquals("teacher", user.getProfession());
		assertEquals("Fernandez", user.getFamilyName());
		assertEquals(123456789, user.getPhone());
		assertEquals(2, user.getTags().size());
	}

}
