package mementoCopo;

public class MementoCopo {

    public static void main(String[] args) {
        Copo copo = new Copo();
        HistoricoCopo historico = new HistoricoCopo();

        // Enchendo o copo
        copo.encher();
        historico.salvarEstadoCopo(copo.criarNivel());

        // Bebendo metade
        copo.beberMetade();
        historico.salvarEstadoCopo(copo.criarNivel());

        // Mostrando o estado atual
        copo.mostrarEstado();

        // Restaurando para um estado anterior
        EstadoCopo estadoAnterior = historico.obterEstadoCopo(0);
        copo.restaurar(estadoAnterior);

        // Mostrando o estado após a restauração
        copo.mostrarEstado();
    }
}
