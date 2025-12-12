package domain;
public sealed abstract class Employee permits Manager, SalesMan {

    protected String code;
    protected String name;
    protected String adress;
    protected String age;
    protected double salary;

    

    public Employee() {
    }

    public Employee(String code, String name, String adress, String age, double salary) {
        this.code = code;
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }

}
