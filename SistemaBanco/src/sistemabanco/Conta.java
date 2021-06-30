/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo.borges
 */
public class Conta {
    Scanner sc = new Scanner(System.in);
    TelaPrincipal tela = new TelaPrincipal();
    TelaDeposito tela2 = new TelaDeposito();
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.status = true;
        this.saldo = 0;
    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.status = false;
        }else{
            System.out.println("Ainda há pendencias em sua conta");
        }
    }
    
    public void pagarMensal(){
        float mensal = 0;
        if(this.tipo.equals("Conta Corrente")){
            mensal = 12;
        }else{
            mensal = 20;
        }
            this.setSaldo(this.getSaldo() - mensal);
        
    }
    public void depositar(float v){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            JOptionPane.showMessageDialog(null,"Foi depositado na conta " + this.getDono() + " o valor de R$ " + v + " Saldo final de: R$ " + this.getSaldo());
        }else{
            JOptionPane.showMessageDialog(null,"Sua conta esta fechada");
        }
    }
    
    public void transferir(float v){
        if(this.isStatus() == true){
            if(v <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
                JOptionPane.showMessageDialog(null,"Foi transferido na conta " + this.getDono() + " O valor de R$ " + v + " Saldo final de: R$ " + this.getSaldo());
            }else{
                JOptionPane.showMessageDialog(null,"Quantia maior que existente em conta!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Sua conta esta fechada");
        }
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public boolean isStatus() {
        return status;
    }
    
    public String getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "Conta{" + "tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
    
}
