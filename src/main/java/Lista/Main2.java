package Lista;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        HashMap<String, String> ejemploHash = new HashMap<>();
        ejemploHash.put("Franz", "Salinas");
        ejemploHash.put("Angello", "Valdivia");
        ejemploHash.put("Alex", "Roman");
        ejemploHash.put("Luis", "Castellon");
        ejemploHash.put("Vladimir", "Fernandez");
        ejemploHash.put("Raul", "Delgado");
        ejemploHash.put("Roger", "Rodriguez");

        System.out.println("NOMBRE" + "     " + "APELLIDO");

        for (Map.Entry var: ejemploHash.entrySet()) {

            System.out.println(var.getKey() + "       " + var.getValue());
        }

        HashMap<String, Integer> lenuHash = new HashMap<>();
        lenuHash.put("Uno    ", 1);
        lenuHash.put("Dos    ", 2);
        lenuHash.put("Tres   ", 3);
        lenuHash.put("Cuatro ", 4);
        lenuHash.put("Cinco  ", 5);

        System.out.println("NOMBRE" + "  " + "NUMERO");

        for (Map.Entry var: lenuHash.entrySet()) {

            System.out.println(var.getKey() + "   " + var.getValue());
        }
    }
}
