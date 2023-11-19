package mementoCopo;

import java.util.ArrayList;
import java.util.List;

// Caretaker: Mantém uma lista de estados (Mementos)
public class HistoricoCopo {

    private List<EstadoCopo> estadosCopo = new ArrayList<>();

    public void salvarEstadoCopo(EstadoCopo estadoCopo) {
        estadosCopo.add(estadoCopo);
    }

    public EstadoCopo obterEstadoCopo(int indice) {
        return estadosCopo.get(indice);
    }

}
