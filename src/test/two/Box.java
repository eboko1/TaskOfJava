package test.two;

/**
 * Created by Vika on 02.03.2017.
 */
public class Box {

        private int width;
        private int height;
        private int  depth;

        public Box(){

        }

        public Box(int x, int y, int z){
            this.width = x;
            this.height = y;
            this.depth = z;
        }

        public void print(){
            int v = width*height*depth;
            System.out.println(width+" | "+height+" | "+depth+" | "+"V = " + v);

        }

        public void  change(int x, int y, int z){
            this.width = x;
            this.height = y;
            this.depth = z;
        }





    }




