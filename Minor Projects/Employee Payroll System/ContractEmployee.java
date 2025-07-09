public class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(int id, String name, double contractAmount) {
        super(id, name);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
