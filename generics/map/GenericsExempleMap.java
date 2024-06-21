package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericsExempleMap {
     public GenericsExempleMap() {
   }

   public static void main(String[] args) {
      Map mapaSemGenerics = new HashMap();
      mapaSemGenerics.put("Chave 1", 10);
      mapaSemGenerics.put("Chave 2", "valor");
      Map<String, Integer> mapaGenerics = new HashMap();
      mapaGenerics.put("Chave 1", 10);
      mapaGenerics.put("Chave 2", 20);
      Iterator var3 = mapaGenerics.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
         String chave = (String)entry.getKey();
         int valor = (Integer)entry.getValue();
         System.out.println("Chave: " + chave + ", Valor: " + valor);
      }

      var3 = mapaSemGenerics.entrySet().iterator();

      while(var3.hasNext()) {
         Object obj = var3.next();
         Map.Entry entry = (Map.Entry)obj;
         String chave = (String)entry.getKey();
         Object valor = entry.getValue();
         System.out.println("Chave: " + chave + ", Valor: " + valor);
      }

   }
}
