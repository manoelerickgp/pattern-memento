package mementoCopo;

public class Copo {

    // Originator: Cria e restaura o estado do objeto

    private String nivelAtual;

    public void encher() {
        this.nivelAtual = "cheio";
    }

    public void esvaziar() {
        this.nivelAtual = "vazio";
    }

    public void beberMetade() {
        this.nivelAtual = "meio cheio";
    }

    public EstadoCopo criarNivel() {
        return new EstadoCopo(nivelAtual);
    }

    public void restaurar(EstadoCopo estadoCopo) {
        this.nivelAtual = estadoCopo.getNivelAgua();
    }

    public void mostrarEstado() {
        System.out.println("Estado Atual do Copo: " + nivelAtual);
    }
}

