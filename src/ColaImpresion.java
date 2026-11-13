public class ColaImpresion {
    private String[] documentos = new String[10];
    private int frente = 0;
    private int fin = -1;    //fin indica el ultimo documento encolado

    public void enqueue(String doc) {
        fin++;
        documentos[fin] = doc;
    }

    public String dequeue() {
        String doc = documentos[frente];
        frente++;
        return doc;
    }

    public void imprimirTodo() {
        while (frente <= fin) {
            System.out.println("Imprimiendo: " + dequeue());
        }
    }
}
