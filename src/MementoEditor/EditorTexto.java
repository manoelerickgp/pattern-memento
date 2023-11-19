package MementoEditor;

// Originator: Cria e restaura o estado do objeto
public class EditorTexto {

    private String conteudo;

    public void escreverTexto(String texto) {
        this.conteudo = texto;
    }

    public Memento salvar() {
        return new Memento(conteudo);
    }

    public void restaurar(Memento memento) {
        this.conteudo = memento.getEstado();
    }

    public void mostrarConteudo() {
        System.out.println("Conteúdo Atual: " + conteudo);
    }
}
