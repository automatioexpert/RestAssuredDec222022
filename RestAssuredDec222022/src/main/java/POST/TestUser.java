package POST;

import org.testng.annotations.Test;

public class TestUser {

	@Test
	public static void main() {

		User user = new User("Mike","Leader");
		//user.setName("Steve");
		//user.setJob("CEO");

		System.out.println(user.getName());
		System.out.println(user.getJob());
	}

		
}