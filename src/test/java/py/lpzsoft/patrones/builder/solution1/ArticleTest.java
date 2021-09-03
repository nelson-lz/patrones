package py.lpzsoft.patrones.builder.solution1;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;


class ArticleTest {

	@Test
	void articlePatternPartial() {
		Article art = Article.builder(Long.valueOf(1)).reference("hola").description("mundo").stock(2).build();
		
		assertEquals(1, art.getId());
		assertEquals("hola", art.getReference());
		assertEquals("mundo", art.getDescription());
		assertEquals(2, art.getStock());
	}
	@Test
	void articlePatternFull() {
		Article art = Article.builder(Long.valueOf(1)).phones(Long.valueOf(595973)).reference("hola")
				.description("mundo").retailPrice(BigDecimal.valueOf(2)).stock(2).tags("#pepito")
				.wholesalePrice(BigDecimal.valueOf(2)).build();
		
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
