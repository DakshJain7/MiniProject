import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class CityUserSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<user> data = new ArrayList<>();

		int userid;
		HashMap<user, ArrayList<user>> tmp = new HashMap<>();
		tmp.entrySet();
	}

	class user {
		String username;

		ArrayList<String> address;

		public user(String username, int userid, List<String> address) {

			this.username = username;
			this.userid = userid;
			address = new ArrayList<String>(this.address);

		}

	}
}
