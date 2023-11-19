package MementoEditor;

public class Programa {

    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        HistoricoEditor historico = new HistoricoEditor();

        // Escrevendo e salvando estados
        editor.escreverTexto("Primeiro Conteúdo");
        historico.adicionarMemento(editor.salvar());

        editor.escreverTexto("Conteúdo Modificado");
        historico.adicionarMemento(editor.salvar());

        // Mostrando o conteúdo atual
        editor.mostrarConteudo();

        // Restaurando para um estado anterior
        Memento estadoAnterior = historico.obterMemento(0);
        editor.restaurar(estadoAnterior);

        // Mostrando o conteúdo após a restauração
        editor.mostrarConteudo();
    }

}
