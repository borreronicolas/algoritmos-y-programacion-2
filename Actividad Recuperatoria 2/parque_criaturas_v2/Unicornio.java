public class Unicornio extends Criatura {
    private String poderMagico;
    private int numeroCuernos;

    public Unicornio(String nombre, int edad, int energia, String poderMagico, int numeroCuernos) {
        super(nombre, edad, energia);
        this.poderMagico = poderMagico;
        this.numeroCuernos = numeroCuernos;
    }

    public String getPoderMagico() { return poderMagico; }
    public void setPoderMagico(String poderMagico) { this.poderMagico = poderMagico; }
    public int getNumeroCuernos() { return numeroCuernos; }
    public void setNumeroCuernos(int numeroCuernos) { this.numeroCuernos = numeroCuernos; }

    public void usarMagia() {
        gastarEnergia(15);
        System.out.println(getNombre() + " usó su magia (" + poderMagico + "). Energía: " + getEnergia());
    }

    @Override
    public void realizarActividadPrincipal() { usarMagia(); }

    @Override
    public String toString() {
        return super.toString() + " {poder=" + poderMagico + ", cuernos=" + numeroCuernos + "}";
    }
}
