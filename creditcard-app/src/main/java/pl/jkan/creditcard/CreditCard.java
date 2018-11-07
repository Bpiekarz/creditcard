package pl.jkan.creditcard;

class CreditCard {
    private double balance = 0;
	private boolean blocked =false;
    private double cardlimit = 0;
	public void block(){
		this.blocked=true;
	}
	public boolean isBlocked(){
		return blocked;
	}
	
    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }   
    
    public double getLimit() {
        return 2000;
    }
    
    public void withdraw(double money) {
		if((balance>0)||(Math.abs(balance)<limit)){
        balance = balance - money;
		}
		else(){
			System.out.println("Not enough funds");
		}
    }
    
    public double getCountBalance() {
        return balance;
    }
	public void repay(){
		if(balance<0){
			balance=0;
		}
		else{};
	
	}
	public void payment(double sum){
		this.balance+=sum;
}