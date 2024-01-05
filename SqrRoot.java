public class SqrRoot {
    public static void main(String[] args) {
        double num,sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Raiz quadrada de  " + num + " é " + sroot);

            //calcula o erro de arredondamento
            rerr = num - (sroot * sroot);
            System.out.println("Erro é entorno de " + rerr);
            System.out.println();
        }
    }
}
