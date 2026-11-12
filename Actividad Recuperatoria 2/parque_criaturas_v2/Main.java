public class Main {
    public static void main(String[] args) {
        Parque parque = new Parque();
        parque.agregarCriatura(new Dragon("Smaug", 300, 80, 1200, true));
        parque.agregarCriatura(new Unicornio("Destello", 50, 60, "Curación", 1));
        parque.agregarCriatura(new Fenix("Fawkes", 500, 20, true, "Rojo dorado"));
        // Nueva categoría: Duendes
        parque.agregarCriatura(new Leprechaun("Finn", 120, 70, 6, 250));
        parque.agregarCriatura(new Pixie("Campanilla", 30, 50, 8, 5, true));
        parque.agregarCriatura(new Trasgo("Gruñón", 200, 40, 9, "Casa del bosque"));

        parque.listarCriaturas();
        parque.hacerActividadPrincipal();
        parque.mostrarEnergia();

        parque.cambiarMomentoDelDia();
        parque.descansarTodas();
        parque.mostrarEnergia();
    }
}
