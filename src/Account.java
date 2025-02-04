
public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account() {
		id = "A101";
		name = "Tan Ah Teck";
		balance = 100;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String newId) {
		this.id = newId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
			balance += amount;
			return balance;
	}
			
	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
		if (amount <= balance) {
			another.credit(amount);
			this.debit(amount);
		}else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public String toString() {
		return String.format("Account[id=%s, name=%s, balance=%d]", this.id, this.name, this.balance);
	}
}
