package py.lpzsoft.patrones.builder;

public class Provider {
	private String id;
    private String company;
    private String description;
    private String nif;
    private String address;
    private String phone;
    private String email;
    private String note;
	public Provider(String id, String company, String description, String nif, String address, String phone,
			String email, String note) {
		super();
		this.id = id;
		this.company = company;
		this.description = description;
		this.nif = nif;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.note = note;
	}
	public Provider() {
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
    
}
