/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painelcarro;

/**
 *
 * @author ecama
 */
public class ContaGiros {

    private int rotacoes;
    private Velocimetro velocidade;

    public ContaGiros(int rotacoes) {
        this.rotacoes = rotacoes;
    }

    public int getRotacoes() {
        return rotacoes;
    }

    public void setRotacoes(int rotacoes) {
        this.rotacoes = rotacoes;
    }

    public void aumentaRotacoes() {
        this.rotacoes += 3;
        System.out.println(this.rotacoes + " x100 RPM");
        if (this.rotacoes >= 30) {
            System.out.println("Suba a marcha");
        }
    }

    public void diminuiRotacoes() {
        this.rotacoes -= 3;
        System.out.println(this.rotacoes + " x100 RPM");
        if (this.rotacoes <= 10) {
            System.out.println("Diminua a marcha");
        }
    }

    public void trocaMarcha() {

    }

}
