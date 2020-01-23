public class SalariedEmployee extends Employee{
    public SalariedEmployee(){}
    
    public SalariedEmployee(int l){
        wage=l;
    }
    
    public SalariedEmployee(String n,int SS, int l){
        super(n);
        this.SS=SS;
        wage=l;
    }
    
    public double getWage(){
        return wage;
    }
    
    public String toString(){
        return super.toString()+SS+"\nThe Wage of the SalariedEmployee is "+wage+".";
    }
    private double wage;
    private int SS;
    
}