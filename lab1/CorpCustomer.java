public class CorpCustomer extends Customer implements DiscountService{

    CorpLoan loan;
    public CorpCustomer(){

    }

    public CorpCustomer(int id, String name, CorpLoan loan){

        super(id, name);
        this.loan = loan;
    }

    public Double getDiscount() {;
        return 0.5;
    }

    @Override
    public double discountForLoan() {
        return loan.getCommission() - this.getDiscount();
    }

    public double calculateCommissionAmount(){
        double newCommission = discountForLoan();
        return (this.loan.amount * newCommission) / 100;
    }
}
