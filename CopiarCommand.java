public class CopiarCommand implements Command {
    private Editor editor;
    private String textoSelecionado;

    public CopiarCommand(Editor editor, String textoSelecionado){
        this.editor = editor;
        this.textoSelecionado = textoSelecionado;
    }

    @Override
    public void execute(){
        editor.copiar(textoSelecionado);
    }
}