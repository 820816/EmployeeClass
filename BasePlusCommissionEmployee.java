public class BasePlusCommissionEmployee extends CommissionEmployee{
    public BasePlusCommissionEmployee(){}
    
    public BasePlusCommissionEmployee(String n, int SS, double r, int s,double sa){
        
        super(n,SS,r,s);
        Salary=sa;
    }
    
    
    
    
 
    
    
    public double getSalary(){
        return Salary;
    }
    
    public String toString(){
        return super.toString()+"\nThe salary is "+Salary+".";
    }
    
    
    private double Salary;
}