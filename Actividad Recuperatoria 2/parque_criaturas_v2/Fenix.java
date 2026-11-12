public class Fenix extends Criatura {
    private boolean puedeResurgir;
    private String colorPlumas;

    public Fenix(String nombre, int edad, int energia, boolean puedeResurgir, String colorPlumas) {
        super(nombre, edad, energia);
        this.puedeResurgir = puedeResurgir;
        this.colorPlumas = colorPlumas;
    }

    public boolean isPuedeResurgir() { return puedeResurgir; }
    public void setPuedeResurgir(boolean puedeResurgir) { this.puedeResurgir = puedeResurgir; }
    public String getColorPlumas() { return colorPlumas; }
    public void setColorPlumas(String colorPlumas) { this.colorPlumas = colorPlumas; }

    public void volar() {
        gastarEnergia(25);
        System.out.println(getNombre() + " voló. Energía: " + getEnergia());
        resucitarSiEsNecesario(); // desafío opcional
    }

    private void resucitarSiEsNecesario() {
        if (getEnergia() == 0 && puedeResurgir) {
            setEnergia(100);
            System.out.println(getNombre() + " resurgió de las cenizas. Energía: 100");
        }
    }

    @Override
    public void realizarActividadPrincipal() { volar(); }

    @Override
    public String toString() {
        return super.toString() + " {resurge=" + puedeResurgir + ", plumas=" + colorPlumas + "}";
    }
}
