// Lê a entrada até um q ser recebido.
package Capitulo_3;

public class Break2 {
    public static void main(String[] args) 
    throws java.io.IOException{
        char ch;

        for( ; ; ) {
            ch = (char) System.in.read(); // obtem um char
            if(ch == 'q') break;
        }
        System.out.println("You pressed q ! ");
    }
}
