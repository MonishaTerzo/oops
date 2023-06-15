public class daughter extends Parent {
        int total_amount_to_pay;
        int total_income_per_year;
        int total_loan_amount;
        int years_to_pay;
        int income;
        @Override
        public void loan(int loan){
            int interest=(0/100)*loan;
            total_amount_to_pay=interest+loan;
        }
        @Override
        public void income(int incom){
            total_income_per_year=incom*12;
        }
        @Override
        public void years_of_loan(int y){
            total_loan_amount=y*total_amount_to_pay;
        }
        @Override
        public void years_to_pay(){
            years_to_pay=total_loan_amount/total_income_per_year;
            System.out.println("years wanted to pay for daughter : " +years_to_pay);

        }


    }
