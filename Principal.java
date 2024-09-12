package br.edu.unisep.fds.view;


import br.edu.unisep.fds.model.Autor;
import br.edu.unisep.fds.model.Livro;
import br.edu.unisep.fds.model.Usuario;
import br.edu.unisep.fds.model.Emprestimo;

import java.util.Calendar;

    public class Principal {
        public static void main(String[] args) {
            // Criando uma instância de Autor
            Autor autor = new Autor(1, "J.K. Rowling");

            // Criando uma instância de Livro
            Livro livro = new Livro(1, "Harry Potter e a Pedra Filosofal", "978-85-07-00001-1", autor.getNome(), 10);

            // Criando uma instância de Usuario
            Usuario usuario = new Usuario(1, "João Silva", "2024001");

            // Criando uma instância de Emprestimo
            Calendar dataEmprestimo = Calendar.getInstance();
            Calendar dataPrevistaDevolucao = (Calendar) dataEmprestimo.clone();
            dataPrevistaDevolucao.add(Calendar.DAY_OF_MONTH, 14); // Data prevista de devolução 14 dias após o empréstimo

            Emprestimo emprestimo = new Emprestimo(1, livro, usuario, dataEmprestimo, dataPrevistaDevolucao);

            // Exibindo as informações
            System.out.println("Autor:");
            System.out.println("ID: " + autor.getId());
            System.out.println("Nome: " + autor.getNome());

            System.out.println("\nLivro:");
            System.out.println("ID: " + livro.getId());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Quantidade: " + livro.getQuantidade());

            System.out.println("\nUsuário:");
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Matrícula: " + usuario.getMatricula());

            System.out.println("\nEmpréstimo:");
            System.out.println("ID: " + emprestimo.getId());
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
            System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo().getTime());
            System.out.println("Data Prevista de Devolução: " + emprestimo.getDataPrevistaDevolucao().getTime());
        }
    }
