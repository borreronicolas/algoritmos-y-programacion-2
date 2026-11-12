public class Dragon extends Criatura {
    private int temperaturaFuego;
    private boolean puedeVolar;

    public Dragon(String nombre, int edad, int energia, int temperaturaFuego, boolean puedeVolar) {
        super(nombre, edad, energia);
        this.temperaturaFuego = temperaturaFuego;
        this.puedeVolar = puedeVolar;
    }

    public int getTemperaturaFuego() { return temperaturaFuego; }
    public void setTemperaturaFuego(int t) { this.temperaturaFuego = t; }
    public boolean isPuedeVolar() { return puedeVolar; }
    public void setPuedeVolar(boolean puedeVolar) { this.puedeVolar = puedeVolar; }

    public void lanzarFuego() {
        gastarEnergia(20);
        System.out.println(getNombre() + " lanzó fuego a " + temperaturaFuego + "°C. Energía: " + getEnergia());
    }

    @Override
    public void realizarActividadPrincipal() { lanzarFuego(); }

    @Override
    public String toString() {
        return super.toString() + " {fuego=" + temperaturaFuego + "°C, vuela=" + puedeVolar + "}";
    }
}
