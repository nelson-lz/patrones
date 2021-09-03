package py.lpzsoft.patrones.builder.solution2;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class Article3Test {

	@Test
	void test() {
		Provider prov = Provider.builder("3", "Paraguay").build();
		Article art = Article.builder().id(Long.valueOf(2)).reference("hola").description("mundo")
				.retailPrice(BigDecimal.valueOf(2)).phones(Long.valueOf(595973)).stock(2).tags("#patern")
				.wholesalePrice(BigDecimal.valueOf(2)).provider(prov).build();
		
		assertEquals(2, art.getId());
		assertEquals(1, art.getPhones().size());
		assertEquals("hola", art.getReference());
		assertEquals("mundo", art.getDescription());
		assertEquals(BigDecimal.valueOf(2), art.getRetailPrice());
		assertEquals(2, art.getStock());
		assertEquals(1, art.getTags().size());
		assertEquals("3", art.getProvider().getId());
		assertEquals(BigDecimal.valueOf(2), art.getWholesalePrice());
	}
}
