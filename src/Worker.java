import java.time.LocalDate;

public class Worker {

    public String name;
    public String birthDay;
    public String endDate;

    public Worker(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public int calculateAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDay.substring(6));
        return (currentYear-birthYear);

    }

    public double collectPay ( ) {
        return 0.0;
    }

 public void terminate(String endDate){
        this.endDate= endDate;
 }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = String.valueOf(LocalDate.parse(birthDay));
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = String.valueOf(LocalDate.parse(endDate));
    }
}
