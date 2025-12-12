import domain.Employee;
import domain.Manager;
import domain.SalesMan;

public class Main {
    public static void main(String[] args) throws Exception {

        printEmployee(new Manager());
        printEmployee(new SalesMan());

    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Manager manager:
                employee.setCode("123");
                employee.setName("eduardo");
                employee.setSalary(5000.00);
                manager.setLogin("eduardo");
                manager.setPassword("12345");
                manager.setCommision(1200);

                System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
                System.out.println(employee.getCode());
                System.out.println(employee.getSalary());
                System.out.println(employee.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                
                break;
            case SalesMan salesman:
                employee.setCode("12345");
                employee.setName("lucas");
                employee.setSalary(2800.00);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);
                salesman.getFullSalary();


                System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());

                break;

            default:
                break;
        }
        System.out.println(employee.getFullSalary(500));
        System.out.println(employee.getFullSalary());
        System.out.println("==============");
    }
}