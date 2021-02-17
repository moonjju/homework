package member.model.vo;

import java.sql.Date;

public class DeleteMember {
	
	private String memberId;
	private String password;
	private String memberName;
	private String gender; //M,F
	private int age;
	private String phone;
	private String email;
	private String address;
	private String hobby;
	private Date enrollDate; //java.sql.Date - java.util.DAte의 자식 클래스
	private Date del_date;
	
	public DeleteMember() {
		super();
	}

	public DeleteMember(String memberId, String password, String memberName, String gender, int age, String phone,
			String email, String address, String hobby, Date enrollDate, Date del_date) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.memberName = memberName;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.hobby = hobby;
		this.enrollDate = enrollDate;
		this.del_date = del_date;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getDel_date() {
		return del_date;
	}

	public void setDel_date(Date del_date) {
		this.del_date = del_date;
	}

	@Override
	public String toString() {
		return "DeleteMember [memberId=" + memberId + ", password=" + password + ", memberName=" + memberName
				+ ", gender=" + gender + ", age=" + age + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", hobby=" + hobby + ", enrollDate=" + enrollDate + ", del_date=" + del_date + "]";
	}
	
	
}
