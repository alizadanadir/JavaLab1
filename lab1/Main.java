public class Main {
    public static void main(String[] args) {

        RetailCustomer retailCustomer = new RetailCustomer(1, "Ali", new RetailLoan(1, 15000));
        CorpCustomer corpCustomer = new CorpCustomer(2, "Nadir", new CorpLoan(2, 2000000));


//        double prev_commission = retailCustomer.loan.getCommission();
//        System.out.println("Old commission: " +prev_commission);
//
//        double new_commission = retailCustomer.discountForLoan();
//        System.out.println("New commission: " + new_commission);
//
//        System.out.println(retailCustomer.calculateCommissionAmount());

        double prev_commission_corp = corpCustomer.loan.getCommission();
        System.out.println("Old commission: " +prev_commission_corp);

        double new_commission_corp = corpCustomer.discountForLoan();
        System.out.println("New commission: " + new_commission_corp);

        System.out.println(corpCustomer.calculateCommissionAmount());

    }
}
