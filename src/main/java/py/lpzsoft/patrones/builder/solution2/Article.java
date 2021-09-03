package py.lpzsoft.patrones.builder.solution2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import py.lpzsoft.patrones.builder.solution2.ArticuloBuilder.Description;
import py.lpzsoft.patrones.builder.solution2.ArticuloBuilder.Optionals;
import py.lpzsoft.patrones.builder.solution2.ArticuloBuilder.Reference;
import py.lpzsoft.patrones.builder.solution2.ArticuloBuilder.RetailPrice;

public class Article {
	private long id;
    private List<Long> phones;
    private String reference;
    private String description;
    private BigDecimal retailPrice;
    private int stock;
    private List<String> tags;
    private BigDecimal wholesalePrice;
    private Provider provider;
    
    public Article() {}
    public static Builder builder() {
    	return new Builder();
    }
	
	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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
	public static class Builder implements ArticuloBuilder.Id, ArticuloBuilder.Reference, ArticuloBuilder.Description, ArticuloBuilder.RetailPrice, ArticuloBuilder.Optionals{
		private Article art;
		private Builder() {
			this.art = new Article();
		}
		@Override
		public Reference id(long id) {
			this.art.setId(id);
			return this;
		}
		@Override
		public Description reference(String reference) {
			this.art.setReference(reference);
			return this;
		}
		@Override
		public RetailPrice description(String description) {
			this.art.setDescription(description);
			return this;
		}
		@Override
		public Optionals retailPrice(BigDecimal retailPrice) {
			this.art.setRetailPrice(retailPrice);
			return this;
		}
		@Override
		public Optionals phones(Long phone) {
			if(this.art.phones==null) {
				this.art.phones = new ArrayList<Long>();
			}
			this.art.phones.add(phone);
			return this;
		}
		@Override
		public Optionals provider(Provider provider) {
			this.art.setProvider(provider);
			return this;
		}
		@Override
		public Optionals stock(int stock) {
			this.art.setStock(stock);
			return this;
		}
		@Override
		public Optionals tags(String tags) {
			if(this.art.tags==null){
				this.art.tags= new ArrayList<String>();
			}
			this.art.tags.add(tags);
			return this;
		}
		@Override
		public Optionals wholesalePrice(BigDecimal wholesalePrice) {
			this.art.setWholesalePrice(wholesalePrice);
			return this;
		}
		@Override
		public Article build() {
			return this.art;
		}
	}
}
