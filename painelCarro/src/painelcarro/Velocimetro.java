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
public class Velocimetro {
    private int velocidade;

    public Velocimetro(int velocidade) {
        this.velocidade = velocidade;
    }



    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void aumentarVelocidade() {
        if (this.velocidade <= 218) {
            this.velocidade += 2;
            System.out.println(this.velocidade + " KM/H");
        }
        if (velocidade < 220) {
            if (velocidade >= 60 && velocidade < 90) {
                System.out.println("Sua velocidade está alta ATENÇÃO!!");
            }
            if (velocidade >= 90) {
                System.out.println("Sua velocidade está muito alta TENHA CUIDADO!!");
            }
        } else {
            System.out.println("Você está na velocidade maxima!!");
        }
    }

    public void diminuirVelocidade() {
        if (this.velocidade > 0) {
            this.velocidade -= 2;
            System.out.println(this.velocidade + " KM/H");
        }
    }

}
