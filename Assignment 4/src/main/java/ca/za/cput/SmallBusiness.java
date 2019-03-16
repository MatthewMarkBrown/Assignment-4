package ca.za.cput;

public class SmallBusiness implements LoanInterest {
private String name;
private String registerNum;
private double loanAmount;

public SmallBusiness(String nm, String regnum,double amt){
    name = nm;
    registerNum = regnum;
    loanAmount = amt;
    }

    public double interest(){
        double interest;
        return interest = loanAmount * 15/100;

    }
}
