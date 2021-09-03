package py.lpzsoft.patrones.builder.solution2;

import java.math.BigDecimal;

public interface ArticuloBuilder {
	interface Id{
		Reference id(long id);
	}
	interface Reference{
		Description reference(String reference);
	}
	interface Description{
		RetailPrice description(String description);
	}
	interface RetailPrice{
		Optionals retailPrice(BigDecimal retailPrice);
	}
	interface Optionals{
		Optionals phones(Long phone);
		Optionals provider(Provider provider);
		Optionals stock(int stock);
		Optionals tags(String tags);
		Optionals wholesalePrice(BigDecimal wholesalePrice);
		Article build();
	}
}
