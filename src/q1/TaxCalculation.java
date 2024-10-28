package q1;

public class TaxCalculation {
    private double income;
    private String maritalStatus;
    public TaxCalculation(double income,String maritalStatus){
        this.income = income;
        this.maritalStatus = maritalStatus;
    }
    public double calculateTax(){
     double tax = 0;
     if(maritalStatus.equals("single")){
         if(income<=32000){
             tax=0.1*income;
         }
         else{
             tax = 3200+0.25*(income-32000);
         }
     } else if (maritalStatus.equals("married")) {
         if(income<=64000){
             tax=0.1*income;
         }
         else {
             tax = 6400+0.25*(income-64000);
         }

     }
     else{
         System.out.println("Illegal status: ");
     }
     return tax;

    }
}
