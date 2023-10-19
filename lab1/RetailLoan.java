public class RetailLoan extends Loan {


    public RetailLoan(){

    }

    public RetailLoan(int id, double amount){
        super(id, amount);
    }

    public double getCommission(){
        return 5.0;
    }


}
