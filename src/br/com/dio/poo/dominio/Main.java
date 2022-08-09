package br.com.dio.poo.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Java é uma linguagem de programação");
        curso.setCargaHoraria(100);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("JavaScript é uma linguagem de programação");
        curso2.setCargaHoraria(200);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria para aprender Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para aprender Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("--------------------------------------------------------------------------------");
        Dev devFrodo = new Dev();
        devFrodo.setNome("Frodo");
        devFrodo.inscreverBootcamp(bootcamp);
        System.out.println("Os conteudos inscritos de: " + devFrodo.getNome() + " são: " + devFrodo.getConteudosInscritos());
        devFrodo.progredir();
        System.out.println("Os conteudos concluidos de: " + devFrodo.getNome() + " são: " + devFrodo.getConteudoConcluidos());
        System.out.println("O total de XP de: " + devFrodo.getNome() + " é: " + devFrodo.calcularTotalXp());
        System.out.println("O " + devFrodo.getNome() + " ainda está inscrito em " + devFrodo.getConteudosInscritos().size() + " conteudos");


        System.out.println("--------------------------------------------------------------------------------");
        Dev devBilbo = new Dev();
        devBilbo.setNome("Bilbo");
        devBilbo.inscreverBootcamp(bootcamp);
        System.out.println("Os conteudos inscritos de: " + devBilbo.getNome() + " são: " + devBilbo.getConteudosInscritos());
        devBilbo.progredir();
        System.out.println("Os conteudos concluidos de: " + devBilbo.getNome() + " são: " + devBilbo.getConteudoConcluidos());
        System.out.println("O total de XP de: " + devBilbo.getNome() + " é: " + devBilbo.calcularTotalXp());
        System.out.println("O " + devBilbo.getNome() + " ainda está inscrito em " + devBilbo.getConteudosInscritos().size() + " conteudos");

        System.out.println("--------------------------------------------------------------------------------");
        Dev devGandalf = new Dev();
        devGandalf.setNome("Gandalf");
        devGandalf.inscreverBootcamp(bootcamp);
        System.out.println("Os conteudos inscritos de: " + devGandalf.getNome() + " são: " + devGandalf.getConteudosInscritos());
        devGandalf.progredir();
        System.out.println("Os conteudos concluidos de: " + devGandalf.getNome() + " são: " + devGandalf.getConteudoConcluidos());
        System.out.println("O total de XP de: " + devGandalf.getNome() + " é: " + devGandalf.calcularTotalXp());
        System.out.println("O " + devGandalf.getNome() + " ainda está inscrito em " + devGandalf.getConteudosInscritos().size() + " conteudos");
        System.out.println("--------------------------------------------------------------------------------");








    }
}
