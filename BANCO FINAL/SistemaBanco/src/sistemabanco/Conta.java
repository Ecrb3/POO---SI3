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
    TelaPrincipal tela = new TelaPrincipal();
    TelaDeposito tela2 = new TelaDeposito();
    private String numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.status = true;
        this.saldo = 0;
    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            int op = JOptionPane.showConfirmDialog(tela, "Certeza que deseja encerrar a conta?", "Encerrar?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(tela, "Conta fechada com sucesso!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.setStatus(false);
            }
        }else{
            JOptionPane.showMessageDialog(tela, "Ainda há pendencias em sua conta", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void abrirConta(){
        int op = JOptionPane.showConfirmDialog(tela, "Deseja reabrir sua conta?", "Reabrir", JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_OPTION){
            this.setStatus(true);
            JOptionPane.showMessageDialog(tela, "Conta reaberta com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
    public void pagarMensal(){
        float mensal = 0;
        if(this.isStatus()){
            if(this.getTipo().equals("Conta Corrente")){
                mensal = 12;
            }else{
                mensal = 20; 
            }
            if(this.getSaldo() >= mensal){
                this.setSaldo(this.getSaldo() - mensal);
                JOptionPane.showMessageDialog(tela, "Mensalidade paga com sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(tela, "Saldo insuficente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(tela, "Sua conta está fechada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void depositar(float v){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            JOptionPane.showMessageDialog(null,"Foi depositado da conta " + this.getDono() + " o valor de R$ " + v + "\n Saldo final de: R$ " + this.getSaldo(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Sua conta esta fechada", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void transferir(float v){
        if(this.isStatus() == true){
            if(v <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - v);
                JOptionPane.showMessageDialog(null,"Foi transferido da conta " + this.getDono() + " o valor de R$ " + v + "\n Saldo final de: R$ " + this.getSaldo(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Quantia maior que existente em conta!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Sua conta esta fechada", "Erro", JOptionPane.ERROR_MESSAGE);
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
        return "Conta:" + "\nTipo da conta: " + tipo + "\nDono da conta: " + dono + "\nSaldo Inícial: " + saldo + "\nStatus da Conta: " + status;
    }
    
}
