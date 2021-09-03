package py.lpzsoft.patrones.builder.solution1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Article2 {
	private Long id;
    private List<Long> phones;
    private String reference;
    private String description;
    private BigDecimal retailPrice;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;
    
    public Article2(Long id,String reference, String description, BigDecimal retailPrice) {
    	this.id=id;
    	this.setReference(reference);
    	this.setDescription(description);
    	this.setRetailPrice(retailPrice);
    }

    public static Builder builder(Long id, String reference, String description, BigDecimal retailPrice) {
    	return new Builder(id, reference, description, retailPrice);
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
	
    public static class Builder{
    	private Article2 art;
    	private Builder(Long id, String reference, String description, BigDecimal retailPrice) {
    		this.art = new Article2(id, reference,description,retailPrice);
    	}
    	public Builder description(String description) {
    		this.art.description = description;
    		return this;
    	}
    	public Builder phones(Long phones) {
    		if(this.art.phones == null) {
    			this.art.phones = new ArrayList<Long>();
    		}
    		this.art.phones.add(phones);
    		return this;
    	}
    	public Builder reference(String reference) {
    		this.art.reference =  reference;
    		return this;
    	}
    	public Builder retailPrice(BigDecimal retailPrice) {
    		this.art.retailPrice = retailPrice;
    		return this;
    	}
    	public Builder stock(int stock) {
    		this.art.stock = stock;
    		return this;
    	}
    	public Builder tags(String tag) {
    		if(this.art.tags==null) {
    			this.art.tags = new ArrayList<String>();
    		}
    		this.art.tags.add(tag);
    		return this;
    	}
    	public Builder wholesalePrice(BigDecimal wholesalePrice) {
    		this.art.wholesalePrice = wholesalePrice;
    		return this;
    	}
    	public Article2 build() {
    		return this.art;
    	}
    }
}
