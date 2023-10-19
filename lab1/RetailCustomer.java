public class RetailCustomer extends Customer implements DiscountService{

    RetailLoan loan;
    public RetailCustomer(){

    }

    public RetailCustomer(int id, String name, RetailLoan loan){
        super(id, name);
        this.loan = loan;

    }

    private Double getDiscount() {;
        return 2.0;
    }


    @Override
    public double discountForLoan() {
            return loan.getCommission() - this.getDiscount();
    }

    public double calculateCommissionAmount(){
        double newCommission = discountForLoan();
        return (this.loan.amount * newCommission) /100;
    }
}