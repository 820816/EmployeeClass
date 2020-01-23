public class CommissionEmployee extends Employee{
    public CommissionEmployee(){}
    
    public CommissionEmployee(int l){
        Rate=l;
    }
 
    public CommissionEmployee(String n, int SS, double r, int s){
        super(n,SS);
        
        Rate=r;
        Sales=s;
    }
    
    public double getWage(){
        return Rate*Sales;
    }
    
    public double getRate(){
        return Rate;
    }
    
    public double getSaled(){
        return Sales;
    }
    
    public String toString(){
        return super.toString()+"\nThe base rate of the Employee is "+Rate+" The Sales this week were "+Sales+".";
    }
    
    
    private double Rate;
    private int Sales;
   
}