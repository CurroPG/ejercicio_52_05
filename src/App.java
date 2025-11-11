public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int aux = numero;
        aux = aux * 10 + 1;
        int digito = 0;
        int lastDigit = 0;
        int invertido = 0;
        
        do{
            digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        }while(aux != 0);
        
        lastDigit = invertido % 10;
        aux = invertido/10;
        digito = 0;
        int numeroFinal = 0;

        do{
            if (aux != 1) {
                digito = aux % 10;
                numeroFinal = numeroFinal * 10 + digito;
                aux /= 10;    
            }
        }while(aux != 1);

        numeroFinal = numeroFinal * 10 + lastDigit;
        
        System.out.printf("El número resultado es %d.", numeroFinal);
    }
}
