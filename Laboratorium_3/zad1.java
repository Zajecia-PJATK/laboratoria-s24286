class Account {
    private String id;
    private String name;
    int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) balance -= amount;
    }

    @Override
    public String toString() {
        return "Account[id=" + this.getID() + ",name=" + this.getName() + ",balance=" + this.getBalance() + "]";
    }
}
