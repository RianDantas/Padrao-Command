class Main{
    public static void main(String args[]){
        Editor editor = new Editor();

        EditorInvoker invoker = new EditorInvoker();


        Command copiar = new CopiarCommand(editor, "Olá");

        Command colar = new ColarCommand(editor);

        invoker.executar(copiar);
        invoker.executar(colar);
        invoker.executar(colar);

        editor.mostrarTexto();


        invoker.desfazer();
        editor.mostrarTexto();
    }
}