abstract class Loan {
    int id;
    double amount;

    public Loan(){

    }

    public Loan(int id, double amount){
        this.id = id;
        this.amount = amount;
    }

    abstract double getCommission();
    }

