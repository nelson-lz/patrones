package py.lpzsoft.patrones.builder;

import java.math.BigDecimal;
import java.util.List;

public class Article {
	private long id;
    private List<Long> phones;
    private String reference;
    private String description;
    private BigDecimal retailPrice;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;
    
    public Article() {}
    
	public Article(long id, List<Long> phones, String reference, String description, BigDecimal retailPrice, int stock,
			List<String> tags, BigDecimal wholesalePrice) {
		this.id = id;
		this.phones = phones;
		this.reference = reference;
		this.description = description;
		this.retailPrice = retailPrice;
		this.stock = stock;
		this.tags = tags;
		this.wholesalePrice = wholesalePrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Long> getPhones() {
		return phones;
	}

	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(BigDecimal retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", phones=" + phones + ", reference=" + reference + ", description=" + description
				+ ", retailPrice=" + retailPrice + ", stock=" + stock + ", tags=" + tags + ", wholesalePrice="
				+ wholesalePrice + "]";
	}
    
}
