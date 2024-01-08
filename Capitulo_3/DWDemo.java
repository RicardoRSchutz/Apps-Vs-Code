package Capitulo_3;

public class DWDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Pressa key followed by ENTER: ");
            ch = (char) System.in.read();// obtem um char
        } while(ch != 'q');
    }
}
