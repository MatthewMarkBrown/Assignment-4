package ca.za.cput;

public class Student {
private String name;
private String studNum;
private double loanAmount;

public Student(String nm, String num, double amt){
    name = nm;
    studNum = num;
    loanAmount = amt;
}

public double getLoanAmount(){
    return loanAmount;
}

public String getName(){
    return name;
}

    public String getNum(){
        return studNum;
    }

public String toString(){
    return "Name: " + name + "\nStudent Num: " + studNum + "\nLoan Amount: " + loanAmount;
    }


}
