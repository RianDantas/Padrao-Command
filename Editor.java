public class Editor {
    private String texto = ""; 
    private String areaTransferencia = ""; 
    
    // Simula a ação de copiar no trecho de texto 
    public void copiar(String textoselecionado) {
        areaTransferencia = textoselecionado; 
        System.out.println("Texto copiado:" + areaTransferencia); 
        
    } 
    // Cola a conteudo da área de transferencia no texto 
    public void colar() { 
        texto += areaTransferencia; 
        System.out.println("Texto após colar: "+texto);
    }

    //Exibe o texto atual 
    public void mostrarTexto() { 
        System.out.println("Texto atual: " + texto); 
    } 

    // Usado no bonus para desfazer a última colagem
    public void renoverUltimaInsercao(int tamanho) { 
        if (texto.length() >= tamanho) {
            texto = texto.substring(0, texto.length() - tamanho); 
        } 
    }

    // Getter necessário para calculo no ColarCommand 
    public String getTexto(){
        return texto;
    }


}
    