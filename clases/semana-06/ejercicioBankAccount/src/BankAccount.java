class BankAccount { 

    private double balance = 0.0;
    private String accountHolder;

    
    public BankAccount() {
        this.balance = 0;
        this.accountHolder = "";
    }

    public BankAccount(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getHiddenBalance() {
        String balanceStr = String.valueOf(this.balance);
        String  hide = "";

        for (int i = 0; i < balanceStr.length(); i++) {
            if(balanceStr.charAt(i) == '.'){
                hide += balanceStr.charAt(i);
            } else {
                hide += "*";
            }
        }
        
        return hide;
    }
    
    public String getAccountHolder() {
        String hide = "";

        for (int i = 0; i < this.accountHolder.length(); i++) {
            if (i == 0 || this.accountHolder.charAt(i - 1 ) == ' ') {
                hide += this.accountHolder.charAt(i);
            } 
            else if (this.accountHolder.charAt(i) == ' ') {
                hide += ' ';    
            } else {
                hide += "*";
            }
        }

        return hide;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Invalid balance. Please enter a positive amount.");
        }
    }

    public void setAccountHolder(String accountHolder) {
        if (this.accountHolder == null || this.accountHolder.trim().isEmpty()) {
            System.out.println("Invalid account holder. Please enter a valid name.");
            return;
        }
        this.accountHolder = accountHolder;
    }

}