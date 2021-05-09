package painelcarro;

public class PainelCarro {

    public static void main(String[] args) {
        Velocimetro v1 = new Velocimetro(218);
        ContaGiros c1 = new ContaGiros(10);
        
        v1.aumentarVelocidade();
        c1.aumentaRotacoes();
        v1.aumentarVelocidade();
        c1.aumentaRotacoes();
        v1.diminuirVelocidade();
        c1.diminuiRotacoes();
    }
    
}
