package com.hiplatform.teste.ruaprefeito;

/**
 *
 * @author Jose San Pedro
 */
public class Rua {
    
    private String cep;
    private final String nome;

    public Rua(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}