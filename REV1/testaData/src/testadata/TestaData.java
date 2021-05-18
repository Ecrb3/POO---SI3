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
public class TestaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data = new Data();
        data.setDia(18);
        data.setMes(5);
        data.setAno(2021);
        data.anoBr();
        data.anoEua();
    }
    
}
