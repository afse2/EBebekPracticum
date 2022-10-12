public class Test {

    public static void main(String[] args) {


        //Employee with a salary of greater than 1000 and greater than 40 hours of work and a hiring year of greater than 10

        Employee emp1 = new Employee("Mehmet Gungor",10000,45,2010);

        System.out.println(emp1);


       //Employee with a salary of greater than 1000 and less than 40 hours of work and a hiring year of greater than 10

        Employee emp2 = new Employee("Alex Harwood", 9000,37,2010);

        System.out.println(emp2);


        //Employee with a salary of equal 1000 and equal 40 hours of work and a hiring year of less than 10

        Employee emp3 = new Employee("Mehmet Fatih Aras", 1000, 40, 2017);

        System.out.println(emp3);

        //Employee with a invalid hireyear based on 2021
        Employee emp5= new Employee("leyla Bilen", 13350,36,2022);
        System.out.println(emp5);

        //Employe with a name has special character
        Employee emp4 = new Employee("Ahmer? Erel",10000,42,2013);
        System.out.println(emp4);



    }
}
