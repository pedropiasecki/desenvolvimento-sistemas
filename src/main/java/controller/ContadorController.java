package controller;

import model.Contador;

public class ContadorController {

    private Contador contador;

    public ContadorController() {
        contador = new Contador();
    }

    public int contar(String texto) {
        return contador.contarPalavras(texto);
    }
}
