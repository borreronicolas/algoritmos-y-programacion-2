import java.util.ArrayList;
import java.util.List;

public class Parque {
    private List<Criatura> criaturas = new ArrayList<>();
    private boolean esDeDia = true; // desafío opcional: ciclo día/noche

    public void agregarCriatura(Criatura c) {
        criaturas.add(c);
        System.out.println("Se agregó: " + c.getNombre());
    }

    public void listarCriaturas() {
        System.out.println("--- Criaturas del parque ---");
        for (Criatura c : criaturas) System.out.println(c);
    }

    public void hacerActividadPrincipal() {
        if (!esDeDia) {
            System.out.println("Es de noche: las criaturas no realizan actividades.");
            return;
        }
        for (Criatura c : criaturas) c.realizarActividadPrincipal();
    }

    public void descansarTodas() {
        if (esDeDia) {
            System.out.println("Es de día: las criaturas solo descansan de noche.");
            return;
        }
        for (Criatura c : criaturas) c.descansar();
    }

    public void mostrarEnergia() {
        System.out.println("--- Estado de energía ---");
        for (Criatura c : criaturas)
            System.out.println(c.getNombre() + ": " + c.getEnergia() + "/100");
    }

    public void cambiarMomentoDelDia() {
        esDeDia = !esDeDia;
        System.out.println(esDeDia ? "** Amanece **" : "** Anochece **");
    }
}
