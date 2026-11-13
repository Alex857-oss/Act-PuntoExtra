public class HistorialNavegacion {
    private String[] paginas = new String[15];
    private int tamaño = 0;          //cuantas paginas hay guardadas

    public void add(String url) {
        paginas[tamaño] = url;
        tamaño++;
    }

    public void remove(String url) {
        for (int i = 0; i < tamaño; i++) {
            if (paginas[i].equals(url)) {
                for (int j = i; j < tamaño - 1; j++) {
                    paginas[j] = paginas[j + 1];
                }
                tamaño--;
                return;
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }
}
