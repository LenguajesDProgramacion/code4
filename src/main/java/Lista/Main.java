package Lista;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Franz");
        lista.add("Angello");
        lista.add("Alex");
        lista.add("Luis");
        lista.add("Roger");

        for (String var: lista) {

            System.out.println(var);

        }

        List<Integer> nume = new ArrayList<>();

        nume.add(100);
        nume.add(101);
        nume.add(102);
        nume.add(103);
        nume.add(104);
        nume.add(105);

        for (Integer num: nume) {
            System.out.println(num);
        }

        System.out.println(lista.get(4));

        lista.remove(2);

        for (String nue: lista) {

            System.out.println(nue);

        }
    }
}
