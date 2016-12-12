/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author acomesanavila
 */
public class Metodos {

    public void amosar(int f) {
        System.out.println(f);
    }

    public int multiplicacion(int f, int j) {
        for (int i = j; i >= 1; i--) {
            f = f * i;
        }
        return f;

    }
}
