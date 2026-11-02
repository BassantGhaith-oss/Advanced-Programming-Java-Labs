class Person{
    private String name;
    private int age;
    Person(){
        name ="";
        age = 0;
    }
    int getAge(){
        return age;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name: "+ name +", Age: "+age+" years.");
    }
}
class Employee extends Person {
    String employeeId ;
    double salary ;
    Employee(String name ,int age ,String employeeId ,double salary){
        super(name,age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    double calculateBonus(){
        return 0.10 * salary;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("EmployeeId: "+employeeId+", Salary: "+salary+"L.E, Bonus: "+calculateBonus()+"L.E");
    }
}
class Manger extends Employee {
    private String department;
    private double extraBonus;
    Manger(String name , int age , String employeeId ,double salary ,String department ,double extraBonus ){
        super(name , age , employeeId , salary);
        this.department=department;
        this.extraBonus =extraBonus;
    }
    @Override
    double calculateBonus() {
        return (salary * 0.20) + (getAge() * 50) + extraBonus;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Department: "+department+", Extra Bonus: "+extraBonus);
        
    }
}
public class Main{
    public static void main(String[] args){
        Employee employee1 = new Employee("Noha",20,"2400373",50000);
        employee1.displayInfo();

        Manger manger1 = new Manger("Marwa El-sayed",45,"8765443",120000,"Low Voltage",30000);
        manger1.displayInfo();

    }
}
