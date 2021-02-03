import java.util.UUID;

public class Program {
	public static void main(String[] args) {
		User user1 = new User ("N1", 1000000);
		User user2 = new User ( "N2", 1000000);
		Transaction transaction = new Transaction(user1, user2, TransferCategory.INCOME , 10);
		transaction.printTransaction();

	}

}
