package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericsExempleSet {
   public GenericsExempleSet() {
   }

   public static void main(String[] args) {
      Set conjuntoSemGenerics = new HashSet();
      conjuntoSemGenerics.add("Elemento 1");
      conjuntoSemGenerics.add(10);
      Set<String> conjuntoGenerics = new HashSet();
      conjuntoGenerics.add("Elemento 1");
      conjuntoGenerics.add("Elemento 2");
      Iterator var3 = conjuntoGenerics.iterator();

      while(var3.hasNext()) {
         String elemento = (String)var3.next();
         System.out.println(elemento);
      }

      var3 = conjuntoSemGenerics.iterator();

      while(var3.hasNext()) {
         Object elemento = var3.next();
         String str = (String)elemento;
         System.out.println(str);
      }

   }
}
