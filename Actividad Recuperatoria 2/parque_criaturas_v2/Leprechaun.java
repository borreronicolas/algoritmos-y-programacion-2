public class Leprechaun extends Duende {
    private int monedasOro;

    public Leprechaun(String nombre, int edad, int energia, int nivelTravesura, int monedasOro) {
        super(nombre, edad, energia, nivelTravesura);
        this.monedasOro = monedasOro;
    }

    public int getMonedasOro() { return monedasOro; }
    public void setMonedasOro(int monedasOro) { this.monedasOro = monedasOro; }

    public void esconderTesoro() {
        gastarEnergia(10);
        System.out.println(getNombre() + " escondió " + monedasOro + " monedas de oro. Energía: " + getEnergia());
    }

    @Override
    public void realizarActividadPrincipal() { esconderTesoro(); }

    @Override
    public String toString() { return super.toString() + " {monedas=" + monedasOro + "}"; }
}
