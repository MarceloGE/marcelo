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
public class Atleta {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 3) {
            this.nome = nome;
        }else{
            this.nome = "Nùmero de caracteres insuficiente";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
        this.idade = idade;  
    }else{
    this.idade = 0;
}

    }
}
