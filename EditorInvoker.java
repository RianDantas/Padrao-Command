public class EditorInvoker{
    private Command ultimoComando;

    public void executar(Command comando){
        comando.execute();
        ultimoComando = comando;
    }

    public void desfazer(){
        if(ultimoComando instanceof ColarCommand){
            ((ColarCommand) ultimoComando).undo();
        }else{
            System.out.println("Nada a desfazer");
        }


    }
}