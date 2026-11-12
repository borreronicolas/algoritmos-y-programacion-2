public abstract class Criatura {
    private String nombre;
    private int edad;
    private int energia; // 0 a 100

    public Criatura(String nombre, int edad, int energia) {
        this.nombre = nombre;
        this.edad = edad;
        setEnergia(energia);
    }

    // Getters y setters (encapsulamiento)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getEnergia() { return energia; }

    // Mantiene la energía siempre entre 0 y 100
    protected void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    // Comportamientos comunes
    public void alimentarse() {
        setEnergia(energia + 30);
        System.out.println(nombre + " se alimentó. Energía: " + energia);
    }

    public void descansar() {
        setEnergia(energia + 10); // más lento que alimentarse
        System.out.println(nombre + " descansó. Energía: " + energia);
    }

    protected void gastarEnergia(int cantidad) {
        setEnergia(energia - cantidad);
    }

    // Cada criatura define su actividad principal (polimorfismo)
    public abstract void realizarActividadPrincipal();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [nombre=" + nombre + ", edad=" + edad + ", energía=" + energia + "]";
    }
}
