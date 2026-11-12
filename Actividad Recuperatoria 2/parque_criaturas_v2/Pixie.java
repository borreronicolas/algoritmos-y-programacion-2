public class Pixie extends Duende {
    private int polvoMagico;
    private boolean puedeVolar;

    public Pixie(String nombre, int edad, int energia, int nivelTravesura, int polvoMagico, boolean puedeVolar) {
        super(nombre, edad, energia, nivelTravesura);
        this.polvoMagico = polvoMagico;
        this.puedeVolar = puedeVolar;
    }

    public int getPolvoMagico() { return polvoMagico; }
    public void setPolvoMagico(int polvoMagico) { this.polvoMagico = polvoMagico; }
    public boolean isPuedeVolar() { return puedeVolar; }
    public void setPuedeVolar(boolean puedeVolar) { this.puedeVolar = puedeVolar; }

    public void esparcirPolvo() {
        gastarEnergia(10);
        if (polvoMagico > 0) polvoMagico--;
        System.out.println(getNombre() + " esparció polvo mágico. Polvo restante: " + polvoMagico + ". Energía: " + getEnergia());
    }

    @Override
    public void realizarActividadPrincipal() { esparcirPolvo(); }

    @Override
    public String toString() { return super.toString() + " {polvo=" + polvoMagico + ", vuela=" + puedeVolar + "}"; }
}
