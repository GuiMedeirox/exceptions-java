public class Account {
    private float balance;

    public void toTransfer(float value, Account b){
        if( this.balance >= value ){
            b.toDeposit(value);
            this.balance -= value;
        }
    }

    public void toDeposit(float money){
        if(money < 0) {
            throw new NegativeDepositException("U cant make a deposit with a negative value");
        }
        this.balance += money;
    }

    public void toWithdraw (float money) throws MoneyEnoughException {
        if (this.balance < 0 || this.balance < money) {
//            System.out.println("Sorry, you don't have enough money ");
            throw new MoneyEnoughException("Sorry, you don't have enough money in your account");
        }
        this.balance -= money;
    }
}