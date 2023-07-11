package br.com.digitalinovationone;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class exercicioSet2 {

    public static void main(String[] args) {

        System.out.println("--\tOrdem inserção\t--");
        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1990, "Intellij"));
            add(new LinguagemFavorita("Python", 2008, "Pycharm"));
            add(new LinguagemFavorita("PHP", 1999, "Eclipse"));
            add(new LinguagemFavorita("Javascript", 2003, "VS"));
            add(new LinguagemFavorita("SQL", 1992, "Work Bench"));
        }};

        for (LinguagemFavorita linguagemFavorita: linguagem) System.out.println(linguagemFavorita);


        System.out.println("--\tOrdem natural\t--");
        Set<LinguagemFavorita> linguagemFavorita = new TreeSet<>(linguagem);
        System.out.println(linguagemFavorita);

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String toString() {
        return "{nome='" + this.nome + "', anoDeCriacao=" + this.anoDeCriacao + ", ide='" + this.ide + "'}";
    }

    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            LinguagemFavorita that = (LinguagemFavorita)o;
            return this.nome.equals(that.nome);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.nome});
    }
}
