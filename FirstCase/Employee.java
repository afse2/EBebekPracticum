import java.util.InputMismatchException;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {

        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    public double tax(){
        double tax=0;
        if(salary>1000){
             tax =salary*0.03;
        }
        return tax;
    }

    public double bonus(){
        double bonus=0;
        if(workHours>40){
            bonus = (workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        double raiseSalary= 0;
        if(currentYear-hireYear<10 && currentYear-hireYear>1){
            raiseSalary =salary * 0.05;
        }else if(currentYear-hireYear<20){
            raiseSalary= salary*0.1;
        }
        return raiseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (char c : name.toCharArray()) {
            if(!((c>='a'&& c<='z') || (c>='A' && c<='Z'))) {
            if(c==32){
                continue;
            }
                throw new InputMismatchException("Name can not include number or special character: "+ c);
            }
        }

        if(name.length()<2 || name.isBlank()){
            throw new InputMismatchException("Invalid name: " + name);
        }

        this.name = name.trim();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new InputMismatchException("Salary can not be negative: " + salary);
        }

        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {

        if(workHours<0){
            throw new InputMismatchException("WorkHours can not be negative: " + workHours);
        }
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        //Based on the case
        // we can use that code "java.time.LocalDate.now()" in order to escape hard coding for current date
        if(hireYear>2021){
            throw new InputMismatchException("Hire year can not be a date later than the current year: " + hireYear);
        }else if(hireYear<1921){
            throw new InputMismatchException("Hire year can not be more than 100: " + hireYear);
        }

        this.hireYear = hireYear;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", raiseSalary=" + raiseSalary() +
                ", bonus=" + bonus() +
                ", tax=" + tax() +
                ", salaryWithBonusAndTax=" + (salary+ bonus() -tax()) +
                ", totalSalary=" + (salary+ bonus() -tax() + raiseSalary()) +
                '}';
    }
}
