public class ColarCommand implements Command{
    private Editor editor;
    private int tamanhoColado = 0;

    public ColarCommand(Editor editor){
        this.editor = editor;
    }

    @Override
    public void execute(){
        int tamanhoAntes = editor.getTexto().length();
        editor.colar();
        tamanhoColado = editor.getTexto().length() - tamanhoAntes;
    }

    public void undo(){
        editor.renoverUltimaInsercao(tamanhoColado);
        System.out.println("Último colar desfeito");
    }
}