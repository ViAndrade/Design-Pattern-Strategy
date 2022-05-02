package com.company;

public class Main {

    public static void main(String[] args) {

    Disciplina d = new Disciplina();
    MediaAritmetica ma = new MediaAritmetica();
    MediaGeometrica mg = new MediaGeometrica();

    d.setP1(10);
    d.setP2(6);

        if (ma.Media(d.getP1(), d.getP2()) >= 5) {
            System.out.printf("Média Aritmética: %.2f\n", ma.Media(d.getP1(), d.getP2()));
            System.out.println("Aluno aprovado!");
        } else {
            System.out.printf("Média Aritmética: %.2f\n", ma.Media(d.getP1(), d.getP2()));
            System.out.println("Aluno reprovado!");
        }

        System.out.println("\n--------------\n");

        if (mg.Media(d.getP1(), d.getP2()) >= 7) {
            System.out.printf("Média Geométrica: %.2f\n", mg.Media(d.getP1(), d.getP2()));
            System.out.println("Aluno aprovado!");
        } else {
            System.out.printf("Média Geométrica: %.2f\n", mg.Media(d.getP1(), d.getP2()));
            System.out.println("Aluno reprovado!");
        }
    }
}
