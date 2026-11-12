// Nueva categoría intermedia: agrupa lo común de los duendes
public abstract class Duende extends Criatura {
    private int nivelTravesura; // 0 a 10

    public Duende(String nombre, int edad, int energia, int nivelTravesura) {
        super(nombre, edad, energia);
        this.nivelTravesura = nivelTravesura;
    }

    public int getNivelTravesura() { return nivelTravesura; }
    public void setNivelTravesura(int n) { this.nivelTravesura = Math.max(0, Math.min(10, n)); }

    @Override
    public String toString() {
        return super.toString() + " {travesura=" + nivelTravesura + "}";
    }
}
