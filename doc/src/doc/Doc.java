package doc;

public class Doc {

    public static void main(String[] args) {
        System.out.println(expo(5,2));
    }

    public static int expo(int numero, int potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            return numero * expo(numero , potencia - 1);

        }
    }
}
