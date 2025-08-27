class Empleado {
    private String nombre;
    private int codigo;
    private String tipo;

    public Empleado(String nombre, int codigo, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public int getCodigo() { return codigo; }
    public String getTipo() { return tipo; }

    public double calcularSalario(){
        return 0.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                " | Código: " + codigo +
                " | Tipo: " + tipo);
    }
}