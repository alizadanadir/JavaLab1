public class CorpLoan extends Loan {

    public CorpLoan(){

    }

    public CorpLoan(int id, double amount){
        super(id, amount);
    }

    public double getCommission(){
        return 1.2;
    }
}
