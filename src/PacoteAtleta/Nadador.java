/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteAtleta;

/**
 *
 * @author marcelo_eger
 */
public class Nadador extends Atleta{
 private int qtdmetrosnado;
 private String tiponado;

    public int getQtdmetrosnado() {
        return qtdmetrosnado;
    }

    public void setQtdmetrosnado(int qtdmetrosnado) {
        if(qtdmetrosnado > 0){
            
        
        this.qtdmetrosnado = qtdmetrosnado;
        }else{
             this.qtdmetrosnado = 0;
        }
    }

    public String getTiponado() {
        return tiponado;
    }

    public void setTiponado(String tiponado) {
        
        if (tiponado.length() > 3) {
            this.tiponado = tiponado;
        }else{
            this.tiponado = "Nùmero de caracteres insuficiente";
    }
 
 
}
}
