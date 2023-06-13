public class Employee extends Worker {

    public long employeeId;
    public String hireDate;

    public static int employeenNo =1;

    public Employee(String name, String birthDay , String hireDate) {
        super(name, birthDay);
        this.employeeId = Employee.employeenNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate=" + hireDate +
                '}';
    }
}
