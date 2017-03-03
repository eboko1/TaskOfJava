package fvi.t2.ua;

/**
 * Created by Vika on 03.03.2017.
 */
public class Books {
    String author;
    String nameBook;
    int number;
    static int numbers = 0;

    Books(){
        number = ++numbers;
    }

    Books(String author, String nameBook ){
        this();
        this.author = author;
        this.nameBook = nameBook;

    }


}
