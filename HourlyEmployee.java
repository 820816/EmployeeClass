public class HourlyEmployee extends Employee{
    public HourlyEmployee(){}
    
    public HourlyEmployee(int t){
        hours=t;
    }
 
    public HourlyEmployee(String n, int SS, int t, double w){
        super(n);
        this.SS=SS;
        hours=t;
        wage=w;
    }
    
    public double getWage(){
        return wage*hours;
    }
    
    public String toString(){
        return super.toString()+SS+"\nThe Wage of the HourlyEmployee is "+wage+".";
    }
    
    private int hours;
    private double wage;
    private int SS;
}