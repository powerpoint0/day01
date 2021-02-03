
import java.util.UUID;
enum TransferCategory {
	INCOME,
	OUTCOME
}
public class Transaction {
	private User Recipient;
	private User Sender;
	 String Identifier = UUID.randomUUID().toString();

	TransferCategory TransCategory;
	private int TransferAmount;


	public String getIdentifier() {
		return Identifier;
	}

	public User getRecipient() {
		return Recipient;
	}

	public User getSender() {
		return Sender;
	}

	public TransferCategory getTransCategory() {
		return TransCategory;
	}

	public int getTransferAmount() {
		return TransferAmount;
	}

	public void printTransaction() {
		System.out.print(this.Sender.getName() + " -> " + this.Recipient.getName() + ", " +
				this.TransferAmount + ", " + this.TransCategory + ", " + this.Identifier +", " +this.Sender.getIdentifier());
	}

	public Transaction(User Recipient, User Sender,
								TransferCategory Type, int TransferAmount) {
		if ((Type == TransferCategory.INCOME && TransferAmount > 0) ||
				(Type == TransferCategory.OUTCOME && TransferAmount < 0)) {
			Recipient.setBalance(Recipient.getBalance() + TransferAmount);
			Sender.setBalance(Sender.getBalance() - TransferAmount);
			this.Recipient = Recipient;
			this.Sender = Sender;
			this.TransCategory = Type;
			this.TransferAmount = TransferAmount;
		} else
			System.exit(-1);
	}
}