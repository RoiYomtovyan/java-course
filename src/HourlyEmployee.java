public class HourlyEmployee extends  Employee {
    public double hourlyPay;

    public HourlyEmployee(String name, String birthDay, String hireDate, double hourlyPay) {
        super(name, birthDay, hireDate);
        this.hourlyPay = hourlyPay;
    }

    public double payment (){
        return (40*hourlyPay);
    }

    public double doublePayment (){
        return (2*payment());
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPay=" + hourlyPay +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
