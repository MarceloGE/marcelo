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
public class JogadorFutebol extends Atleta {
    
  private int nrgols;
          private String nmclube;

    public int getNrgols() {
        return nrgols;
    }

    public void setNrgols(int nrgols) {
        if(nrgols > 0){
        this.nrgols = nrgols;  
    }else{
    this.nrgols = 0;
    }
    }

    public String getNmclube() {
        return nmclube;
    }

    public void setNmclube(String nmclube) {
      if (nmclube.length() > 3) {
            this.nmclube = nmclube;
        }else{
            this.nmclube = "Nùmero de caracteres insuficiente";
          
          
    
      }
    }
}
