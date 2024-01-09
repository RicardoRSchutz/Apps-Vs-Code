package Capitulo_3;

public class Guess4 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do{
            System.out.println("Estou pensando em uma letra de A a Z ");
            System.out.println("Tente adivinhar: ");

            // le um caractere
            ch = (char) System.in.read();

            //descarta qualquer outro caractere do buffer de entrada
            do{
                ignore = (char) System.in.read();
            } while (ignore !='\n');

            if(ch == answer) System.out.println("** Correto!! **");
            else{
                System.out.println("...Desculpa, letra esta ");
                if(ch < answer) System.out.println("muito baixa");
                else System.out.println( "muito alta");
                System.out.println("Tente novamente!\n");
            }
        }while (answer !=ch);            
    }
}