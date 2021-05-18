/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testadata;

/**
 *
 * @author eduardo.borges
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void anoBr(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.ano);
    }
    public void anoEua(){
        System.out.println(this.mes + "/" + this.dia + "/" + this.ano);
    }
    
    
}
