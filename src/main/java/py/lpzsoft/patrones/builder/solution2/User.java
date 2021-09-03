package py.lpzsoft.patrones.builder.solution2;

import java.util.ArrayList;
import java.util.List;

import py.lpzsoft.patrones.builder.solution2.UserBuilders.Id;
import py.lpzsoft.patrones.builder.solution2.UserBuilders.Name;
import py.lpzsoft.patrones.builder.solution2.UserBuilders.Nick;
import py.lpzsoft.patrones.builder.solution2.UserBuilders.Optionals;

public class User {
	private String id;
	private String nick;
	private String name;
	private String familyName;
	private int age;
	private int phone;
	private List<String> tag;
	private String profession;
	
	public User() {}
	public static Id builder() {
		return new Builder();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public List<String> getTag() {
		return tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", nick=" + nick + ", name=" + name + ", familyName=" + familyName + ", age=" + age
				+ ", phone=" + phone + ", tag=" + tag + ", profession=" + profession + "]";
	}
	public static class Builder implements UserBuilders.Id, UserBuilders.Nick, UserBuilders.Name, UserBuilders.Optionals{
		private User user;
		
		private Builder() {
			this.user = new User();
		}

		@Override
		public Nick id(String id) {
			this.user.id = id;
			return this;
		};

		@Override
		public Name nick(String nick) {
			this.user.nick = nick;
			return this;
		}

		@Override
		public Optionals name(String name) {
			this.user.name = name;
			return this;
		}
		
		@Override
		public Optionals familyName(String familyName) {
			this.user.familyName = familyName;
			return this;
		}

		@Override
		public Optionals age(int age) {
			this.user.age = age;
			return this;
		}

		@Override
		public Optionals phone(int phone) {
			this.user.phone = phone;
			return this;
		}

		@Override
		public Optionals profession(String profession) {
			this.user.profession = profession;
			return this;
		}

		@Override
		public Optionals tag(String tag) {
			if(this.user.tag==null) {
				this.user.tag = new ArrayList<String>();
			}
			this.user.tag.add(tag);
			return this;
		}

		@Override
		public User build() {
			return this.user;
		}
		
	}
}
