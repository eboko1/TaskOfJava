package test.two;

/**
 * Created by Vika on 02.03.2017.
 */
public class BoxDemo {


        public static void main(String args[]){
            Box boxSmall = new Box(10,2,3);
            Box boxBig = new Box(100,2,10);
            Box boxLittle = new Box();


            boxBig.print();
            boxSmall.print();
            boxLittle.print();

        }



    }


