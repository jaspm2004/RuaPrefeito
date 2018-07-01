package com.hiplatform.teste.ruaprefeito;

/**
 *
 * @author Jose San Pedro
 */
public class Casa {
    
    private final Rua rua;
    private final int numero;
    private final int totalEleitores;

    public Casa(Rua rua, int numero, int totalEleitores) {
        this.rua = rua;
        this.numero = numero;
        this.totalEleitores = totalEleitores;
    }

    public Rua getRua() {
        return rua;
    }

    public int getTotalEleitores() {
        return totalEleitores;
    }
}
