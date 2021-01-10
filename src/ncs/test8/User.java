package ncs.test8;

public class User {

	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return  id + " "+ password + " " + name + " " + age + " " + gender
				+ " " + phone;
	}
		
		public Object clone() {
			  return new User(id,password, name, age, gender, phone);
			 }//clone부분 너무 어려워서 오래 걸렸음 간단한 방법을 찾지 못하고  복잡한거하다 시간 다 날림
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		
		if(obj == null)
			return false;
	
		User other = (User)obj;
		if(id == null) {
			if(other.id == null)
				return false;
		}else if(!id.equals(other.id))
			return false;
		
		if(password == null) {
			if(other.password == null)
				return false;
		}else if(!password.equals(other.password))
				return false;
		
		if(name == null) {
			if(other.name == null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		
		if(phone == null) {
			if(other.phone == null)
				return false;
		}else if(!phone.equals(other.phone))
			return false;
			 return true;	
	}
}
