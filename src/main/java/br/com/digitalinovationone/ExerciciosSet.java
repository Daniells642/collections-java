package br.com.digitalinovationone;

import java.util.*;
import java.util.Iterator;

public class ExerciciosSet {
    public static void main(String[] args) {

        System.out.println("--\tCores arco-íris\t--");

        Set<String> cores = new HashSet<>();
            cores.add("vermelho");
            cores.add("laranja");
            cores.add("amarelo");
            cores.add("verde");
            cores.add("azul");
            cores.add("anil");
            cores.add("violeta");

        for (String arcoIris: cores)
            System.out.println(arcoIris);


        System.out.println("--\tQuantidade de cores que um arco-íris tem:\t--> " + cores.size());


        System.out.println("--\tCores em ordem alfabética\t--");
        Set<String> cores1 = new TreeSet<>(cores);

        for (String arcoiris: cores1
             )
            System.out.println(arcoiris);

        System.out.println("--\tCores em ordem inversa\t--");
        Set<String> cores2 = new LinkedHashSet<>(cores);
        System.out.println(cores2);

        List<String> coresInversa = new ArrayList(cores2);
        Collections.reverse(coresInversa);
        System.out.println(coresInversa);


        System.out.println("--\tCores que começam com a letra V\t--");

        for (String cor : cores) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        System.out.println("--\tRemova todas as cores que não começam com a letra “v”:\t--");
        Iterator<String> Iterator = cores.iterator();
            
        while(Iterator.hasNext()) {
            if (((String)Iterator.next()).startsWith("v")) {
                Iterator.remove();
            }
        }
        System.out.println(cores);


        System.out.println("Limpe o conjunto: ");
        cores.clear();
        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}



/*class ArcoIris {
    private String cores;

    public ArcoIris(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "cores='" + cores + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArcoIris)) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return Objects.equals(getCores(), arcoIris.getCores());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCores());
    }
}





*  Set<Serie> minhasSeries = new HashSet<>() {{

            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
*
* */
