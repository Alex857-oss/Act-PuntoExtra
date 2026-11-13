import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Caso 1: Pila ===");
        PilaCaracteres pila = new PilaCaracteres();
        System.out.println("revertir(\"MUNDO\") = " + pila.revertir("MUNDO")); //Este seria MUNDO invertido ODNUM

        System.out.println("\n=== Caso 2: Cola ===");
        ColaImpresion cola = new ColaImpresion();
        cola.enqueue("Factura");
        cola.enqueue("Recibo");
        cola.enqueue("Pedido");
        cola.imprimirTodo();

        System.out.println("\n=== Caso 3: Lista ===");
        HistorialNavegacion h = new HistorialNavegacion();
        h.add("correo.com");
        h.add("museo.org");
        h.add("deportes.net");
        System.out.println("Después de los 3 add:");
        h.mostrarHistorial();
        h.remove("museo.org");
        System.out.println("Después de remove(\"museo.org\"):");
        h.mostrarHistorial();

        System.out.println("\n=== Bubble Sort ===");
        int[] a = {23, 5, 41, 8, 17, 30, 12, 26};
        Algoritmos.ordenar(a);
        System.out.println(Arrays.toString(a));

        System.out.println("\n=== Primera partición de QuickSort (pivote 26) ===");
        int[] b = {23, 5, 41, 8, 17, 30, 12, 26};
        int p = Algoritmos.particion(b, 0, b.length - 1);
        System.out.println("Índice del pivote: " + p);
        System.out.println(Arrays.toString(b));

        System.out.println("\n=== QuickSort completo ===");
        int[] c = {23, 5, 41, 8, 17, 30, 12, 26};
        Algoritmos.quickSort(c, 0, c.length - 1);
        System.out.println(Arrays.toString(c));

        System.out.println("\n=== Búsquedas (objetivo 71) ===");
        int[] ids = {12, 19, 26, 33, 47, 58, 71, 90};
        System.out.println("Lineal:  " + Algoritmos.busquedaLineal(ids, 71));  // 6
        System.out.println("Binaria: " + Algoritmos.busquedaBinaria(ids, 71)); // 6
        System.out.println("Binaria de 50 (no existe): " + Algoritmos.busquedaBinaria(ids, 50)); // -1
    }
}
