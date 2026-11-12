public class Trasgo extends Duende {
    private String hogarQueHabita;

    public Trasgo(String nombre, int edad, int energia, int nivelTravesura, String hogarQueHabita) {
        super(nombre, edad, energia, nivelTravesura);
        this.hogarQueHabita = hogarQueHabita;
    }

    public String getHogarQueHabita() { return hogarQueHabita; }
    public void setHogarQueHabita(String h) { this.hogarQueHabita = h; }

    public void hacerTravesura() {
        gastarEnergia(15);
        System.out.println(getNombre() + " hizo una travesura en " + hogarQueHabita + ". Energía: " + getEnergia());
    }

    @Override
    public void realizarActividadPrincipal() { hacerTravesura(); }

    @Override
    public String toString() { return super.toString() + " {hogar=" + hogarQueHabita + "}"; }
}
