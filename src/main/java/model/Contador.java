package model;

public class Contador {

    public int contarPalavras(String texto) {

        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
    }
}
