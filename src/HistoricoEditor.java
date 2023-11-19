import java.util.ArrayList;
import java.util.List;

// Caretaker: Mantém uma lista de estados (Mementos)
public class HistoricoEditor {

    private List<Memento> estados = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        estados.add(memento);
    }

    public Memento obterMemento(int indice) {
        return estados.get(indice);
    }

}
