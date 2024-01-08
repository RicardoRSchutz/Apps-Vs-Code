// Demonstração do laço while

package Capitulo_3;

public class WhileDemo {
    public static void main(String[] args) {
        char ch;
        //exibe o alfabeto usando o laço while 
        ch = 'a';

        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }    
    }
}
