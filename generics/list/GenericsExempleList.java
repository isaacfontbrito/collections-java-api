package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExempleList {
   public GenericsExempleList() {
   }

   public static void main(String[] args) {
      List listaSemGenerics = new ArrayList();
      listaSemGenerics.add("Elemento 1");
      listaSemGenerics.add(10);
      List<String> listaGenerics = new ArrayList();
      listaGenerics.add("Elemento 1");
      listaGenerics.add("Elemento 2");
      Iterator var3 = listaGenerics.iterator();

      while(var3.hasNext()) {
         String elemento = (String)var3.next();
         System.out.println(elemento);
      }

      var3 = listaSemGenerics.iterator();

      while(var3.hasNext()) {
         Object elemento = var3.next();
         String str = (String)elemento;
         System.out.println(str);
      }

   }
}

