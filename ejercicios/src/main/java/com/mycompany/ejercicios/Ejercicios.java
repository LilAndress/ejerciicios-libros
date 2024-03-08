
package com.mycompany.ejercicios;
import books.Book;
public class Ejercicios {

    public static void main(String[] args) {
      Book book1 = new Book("Harry Potter", 5, 25, "Fantasía");
        Book book2 = new Book("El nombre del viento", 1, 28, "Fantasía");
        Book book3 = new Book("Percy Jackson", 3, 27, "Fantasia");
        Book book4 = new Book("Mujercitas", 6, 30, "Drama");
        Book book5 = new Book("Orgullo y prejuicio", 4, 26, "Romance");
       
        book1.lendBook();
        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());
    }
    }