package mementoCopo;

// Memento: Representa o estado capturado do objeto
class EstadoCopo {

    private String nivelAgua;

    public EstadoCopo(String nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public String getNivelAgua() {
        return nivelAgua;
    }
}
