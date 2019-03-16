package ca.za.cput;

public class PostGrad extends Student {

    public PostGrad(String nm, String num, double amt){
    super(nm,num,amt);

}

    public double interest(){
        double interest;
        return interest = super.getLoanAmount() * 10/100;
    }
}
