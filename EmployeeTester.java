public class EmployeeTester{
public static void main(){
    SalariedEmployee SalaryBoy=new SalariedEmployee("Jim, Doe",23,500);
    HourlyEmployee  HourlyBoy=new HourlyEmployee("Doe, Jim", 47, 5, 46);
    CommissionEmployee CommisionyBoy=new CommissionEmployee("Frank Fritz",49,0.48,500);
    BasePlusCommissionEmployee BaseyPlusBoy=new BasePlusCommissionEmployee("Freddy, Fazbear", 32,.35,15,500);
    System.out.println(SalaryBoy.toString());
    System.out.println(HourlyBoy.toString());
    System.out.println(CommisionyBoy.toString());
    System.out.println(BaseyPlusBoy.toString());
}
}