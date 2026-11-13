public class PilaCaracteres {
    private char[] pila = new char[20];
    private int tope = -1;    //  -1 significa  que la pila esta vacia

    public void push(char c) {
        tope++;              //Se actualiza el tope
        pila[tope] = c;
    }

    public char pop() {
        char c = pila[tope];
        tope--;              
        return c;
    }

    public String revertir(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            push(texto.charAt(i));
        }
        while (tope >= 0) {
            resultado += pop();
        }
        return resultado;
    }
}
