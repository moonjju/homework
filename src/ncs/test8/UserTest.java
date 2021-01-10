package ncs.test8;

public class UserTest {

	public static void main(String[] args) {

		User[] users = new User[3];

		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");

		System.out.println("users list----------------------------");
		for (int i = 0; i < users.length; i++) {
			User u = users[i];
			System.out.println(u.toString());
		}

		System.out.println("copyUsers----------------------------");
		User[] copyUsers = new User[users.length];
		// 앞에 User베열을 잘못 넣음 구글 검색 잘못찾음의 피해

		for (int j = 0; j < copyUsers.length; j++) {
			copyUsers[j] = (User) users[j].clone();
		}
		for (User c : copyUsers) {
			System.out.println(c.toString());
		}
		System.out.println("비교결과-------------------------------");

		for (int i = 0; i < copyUsers.length; i++) {
			System.out.println(copyUsers[i].equals(users[i]));
		}
	}

}
