public class PayrollSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 200, 80);
        Employee e3 = new ContractEmployee(3, "Charlie", 75000);

        Employee[] employees = {e1, e2, e3};

        for (Employee emp : employees) {

            emp.displayDetails();
            System.out.println("Salary: $" + emp.calculateSalary() + "\n");
        }
    }
}
