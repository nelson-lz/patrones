package py.lpzsoft.patrones.builder;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ArticleTest {

	@Test
	void test() {
		Article art = new Article();
		art.setId(1);
		art.setPhones(null);
		art.setReference("hola");
		art.setDescription("mundo");
		art.setRetailPrice(BigDecimal.valueOf(2));
		art.setStock(2);
		art.setTags(null);
		art.setWholesalePrice(BigDecimal.valueOf(2));
		
		assertEquals(1, art.getId());
		assertEquals(null, art.getPhones());
		assertEquals("hola", art.getReference());
		assertEquals("mundo", art.getDescription());
		assertEquals(BigDecimal.valueOf(2), art.getRetailPrice());
		assertEquals(2, art.getStock());
		assertEquals(null, art.getTags());
		assertEquals(BigDecimal.valueOf(2), art.getWholesalePrice());
	}

}
