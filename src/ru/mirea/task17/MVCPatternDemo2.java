package ru.mirea.task17;

public class MVCPatternDemo2 {
    public static void main(String [] args){
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Sasha");
        controller.setEmployeeWages(1000);
        System.out.println("\nAfter updating, Employee Details are as follows");
        controller.updateView();
    }
    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Alex");
        Employee.setWages(100);
        return Employee;
    }
}