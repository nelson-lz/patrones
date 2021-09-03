package py.lpzsoft.patrones.builder.solution1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class Article2Test {

	@Test
	void articlePatternPartial() {
		Article2 art = Article2.builder(Long.valueOf(1),"hola","mundo",BigDecimal.valueOf(2)).stock(2).build();
		
		assertEquals(1, art.getId());
		assertEquals("hola", art.getReference());
		assertEquals("mundo", art.getDescription());
		assertEquals(2, art.getStock());
		assertEquals(BigDecimal.valueOf(2), art.getRetailPrice());
	}
	@Test
	void articlePatternFull() {
		Article2 art = Article2.builder(Long.valueOf(1),"hola","mundo",BigDecimal.valueOf(2)).phones(Long.valueOf(595973))
				.stock(2).tags("#pepito").wholesalePrice(BigDecimal.valueOf(2)).build();
		
		assertEquals(1, art.getId());
		assertEquals(1, art.getPhones().size());
		assertEquals("hola", art.getReference());
		assertEquals("mundo", art.getDescription());
		assertEquals(BigDecimal.valueOf(2), art.getRetailPrice());
		assertEquals(2, art.getStock());
		assertEquals(1, art.getTags().size());
		assertEquals(BigDecimal.valueOf(2), art.getWholesalePrice());
	}

}
