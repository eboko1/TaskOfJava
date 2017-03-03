package fvi.t2.ua;

import fvi.t2.ua.Books;

/**
 * Created by Vika on 03.03.2017.
 */
public class Mainn {
    public static void main(String[] args) {
        Books myLikeBook = new Books();
        myLikeBook.author = "Берт Бейтс";
        myLikeBook.nameBook = "Вивчаємо JAVA";

        Books myBook = new Books("Bruce Eckel", "Thinking in JAVA");

        Books myBookSister = new Books("Bruce Eckel", "Thinking in JAVA");


        System.out.print(Books.numbers);


    }
}
