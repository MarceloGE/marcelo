/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtooo;

/**
 *
 * @author marcelo_eger
 */
public class Produto {
    private int cod;
    private String descricao;
    private int quantidade;
    private String embalagem;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        if(cod > 0){
        this.cod = cod;  
    }else{
    this.cod = 0;
    }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() > 3) {
            this.descricao = descricao;
        }else{
            this.descricao = "Nùmero de caracteres insuficiente";
    }
       
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
       if (embalagem.length() > 3) {
            this.embalagem = embalagem;
        }else{
            this.embalagem = "Nùmero de caracteres insuficiente";
    }
    
    
}
}
