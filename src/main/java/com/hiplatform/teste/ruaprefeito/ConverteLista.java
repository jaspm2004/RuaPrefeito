package com.hiplatform.teste.ruaprefeito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jose
 */
public class ConverteLista {
    
    private final List<Casa> casas;

    public ConverteLista(List<Casa> casas) {
        this.casas = casas;
    }
    
    public List<Rua> geraListaRua() {

        Map<String, Integer> map = new HashMap<>(); 
        String nomeRua;
        int total;
        
        for (Casa casa : casas) {
            nomeRua = casa.getRua().getNome();
            total = casa.getTotalEleitores();
            
            // verifica se a rua já está no mapa
            // e atualiza o subtotal
            if (map.get(nomeRua) != null) {
                total += map.get(nomeRua);
            } 
            
            map.put(nomeRua, total);
        }
        
        // ordena de maneira decrescente
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        List<Rua> ruas = new ArrayList<>();        
        Iterator it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            ruas.add(new Rua(pair.getKey().toString()));
            it.remove(); // avoids a ConcurrentModificationException
        }
        
        return ruas;
    }
}
