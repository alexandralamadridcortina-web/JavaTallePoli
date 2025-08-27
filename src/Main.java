public class Main {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoSueldoFijo("Ana", 101, 1500, 3);
        Empleado e2 = new EmpleadoSueldoFijo("Carlos", 102, 2000);
        Empleado e3 = new EmpleadoSueldoFijo("Luis", 103, 20, 80);

        Empleado[] empleados = {e1, e2, e3};

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            System.out.println("Salario $" + emp.calcularSalario());
            System.out.println("-----------------------------");

        }
    }
}
