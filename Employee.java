public abstract class Employee{
    public Employee(){}
    
    public Employee(String n){
        name=n;
    }
    
    public Employee(String n,int SS){
        name=n;
        SocialNumber=SS;
    } 
    
    public String getName(){
        return name;
    }
    
    public int getSS(){
        return SocialNumber;
    }
    
    public String toString(){
        return "The name of the employee "+name+" The number of the employee is "+SocialNumber+".";
    }
    
    public abstract double getWage();
    
    private String name;
    private int SocialNumber;
}