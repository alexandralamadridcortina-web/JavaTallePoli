public class EmpleadoPorHoras extends Empleado{
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, int codigo, double pagoPorHora, int horasTrabajadas) {
        super (nombre, codigo, "Por horas");
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return pagoPorHora * horasTrabajadas;
    }
}
