class Dollar extends Money {
    Dollar(int amount) {
        this.amount= amount;
    }
    void times(int multiplier) {
        amount= amount * multiplier;
    }
    
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
     
 }	
