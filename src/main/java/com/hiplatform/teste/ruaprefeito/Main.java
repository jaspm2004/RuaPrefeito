package com.hiplatform.teste.ruaprefeito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Casa> casas = new ArrayList<>();
        
        Rua rua1 = new Rua("rua 1");
        Rua rua2 = new Rua("rua 2");
        Rua rua3 = new Rua("rua 3");
        
        Casa casa1 = new Casa(rua1, 1, 5);
        Casa casa2 = new Casa(rua2, 2, 10);
        Casa casa3 = new Casa(rua1, 3, 15);
        Casa casa4 = new Casa(rua3, 4, 25);
        Casa casa5 = new Casa(rua2, 2, 30);
        
        casas.add(casa1);
        casas.add(casa2);
        casas.add(casa3);
        casas.add(casa4);
        casas.add(casa5);
        
        List<Rua> ruas = new ConverteLista(casas).geraListaRua();
        
        printList(ruas);
    }
    
    public static void printList(List<Rua> ruas) {
        
        ruas.forEach((rua) -> {
            System.out.println(rua.getNome());
        });
    }
}
