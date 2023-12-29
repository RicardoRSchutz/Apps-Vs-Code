//Demonstra os operadores de curto-circuito.
public class SCops {
    public static void main(String[] args) {
        int n,d,q;

        n=10;
        d=2;
        if(d!=0 && (n % d) == 0)
            System.out.println(d +" is a factor of "+ n);

        d=0;// configura d com zero

        //ja que d é igual a zero, o segundo operando nao é valido.
        if(d!=0 && (n % d) == 0)
            System.out.println(d+ " is a factor of "+ n);

    }
}
