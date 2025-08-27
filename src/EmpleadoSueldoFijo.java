public class EmpleadoSueldoFijo extends Empleado{
    private double sueldoBase;
    private int mesesTrabajados;

    public EmpleadoSueldoFijo(String nombre, int codigo, double sueldoBase,int mesesTrabajados) {
        super(nombre, codigo, "A sueldo fijo");
        this.sueldoBase = sueldoBase;
        this.mesesTrabajados = mesesTrabajados;
    }

    public EmpleadoSueldoFijo(String nombre, int codigo, double sueldoBase) {
        super(nombre, codigo, "A sueldo fijo");
        this.sueldoBase = sueldoBase;
        this.mesesTrabajados = 1;
    }

    @Override
    public double calcularSalario(){
        return sueldoBase * mesesTrabajados;
    }
}
