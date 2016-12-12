package factorial;

public class Factorial {

    public static void main(String[] args) {
        Metodos met = new Metodos();
        int i,f = 1, j = 8;

        for (i = j; i >= 1; i--) 
            f = f * i;
        
        met.amosar(f);
    }
}