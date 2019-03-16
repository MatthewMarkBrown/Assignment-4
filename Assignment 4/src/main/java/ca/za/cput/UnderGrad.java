package ca.za.cput;

public class UnderGrad extends Student {

    public UnderGrad(String nm, String num, double amt){
        super(nm,num,amt);
    }

    public double interest(){
        double interest;
        return interest = super.getLoanAmount() * 12/100;
    }

}
