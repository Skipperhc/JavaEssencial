package Secao03.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TesteHasMap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Vitor", new Double(19));
        map.put("Geovana", new Double(18));
        map.put("Felipe", new Double(26));
        map.put("Guilherme", new Double(17));
        map.put("Maristela", new Double(49));

        System.out.println("HasMap: " + map);

        Set<Map.Entry<String, Double>> set = map.entrySet();
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        while(i.hasNext()){
            Map.Entry<String, Double> mapI = i.next();
            System.out.println("Chave: " + mapI.getKey() + "  Valor:" + mapI.getValue());
        }
    }
}
























