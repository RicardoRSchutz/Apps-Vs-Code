package Capitulo_2;
public class PromDemo {
    public static void main(String[] args) {
    byte b;
    int i ;

    b=10;
    i= b*b;//certo,nao é necessaroa uma coerção

    b=10;
    b=(byte)(b*b);//coerção necessaria!!
    System.out.println("i and b; " + i + " "+ b);
    }
 
}
