
public class User {
	private String Name;
	private int Identifier;
	private int Balance;

	{
		Identifier = 56576;
	}

	public User(String Name, int Balance){
		this.Name = Name;
		this.Balance = Balance;
	}

	public int getIdentifier() {
		return Identifier;
	}

	public String getName() {
		return Name;
	}

	public int getBalance() {
		return Balance;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}


}
