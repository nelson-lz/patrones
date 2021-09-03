package py.lpzsoft.patrones.builder.solution2;

public class Provider {
	private String id;
    private String company;
    private String description;
    private String nif;
    private String address;
    private String phone;
    private String email;
    private String note;
    
	public Provider(String id, String company) {
		this.id=id;
		this.company=company;
	}
	public static Builder builder(String id, String company) {
		return new Builder(id, company);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", company=" + company + ", description=" + description + ", nif=" + nif
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + ", note=" + note + "]";
	}
	
	public static class Builder{
		private Provider prov;
		public Builder(String id, String company) {
			this.prov = new Provider(id, company);
		}
		public Builder description(String description) {
			this.prov.description=description;
			return this;
		}
	    public Builder nif(String nif) {
	    	this.prov.nif=nif;
	    	return this;
	    }
	    public Builder address(String address) {
	    	this.prov.address=address;
	    	return this;
	    }
	    public Builder phone(String phone) {
	    	this.prov.phone=phone;
	    	return this;
	    }
	    public Builder email(String email) {
	    	this.prov.setEmail(email);
	    	return this;
	    }
	    public Builder note(String note) {
	    	this.prov.setNote(note);
	    	return this;
	    }
	    public Provider build() {
	    	return this.prov;
	    }
	}
}
