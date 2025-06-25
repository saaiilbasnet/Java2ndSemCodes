
public class Employee<T>{
    private T employeeId;

    //constructor

    public Employee(T employeeId){ //argument type will be same of generics
        this.employeeId = employeeId;
    }

    public T getEmployeeId(){ //return type is also the same as generic type
        return employeeId;
    }

    public void setEmployeeId(T employeeId){
        this.employeeId = employeeId;
    }

    @Override
    public String toString(){
        return "Employee {" + "employeeId : " + employeeId + '}';
    }


    public static void main(String[] args){
        Employee myEmp1 = new Employee(101);
        Employee myEmp2 = new Employee("101A");


        System.out.println(myEmp1.getEmployeeId());
        System.out.println(myEmp2.getEmployeeId());

    }

}