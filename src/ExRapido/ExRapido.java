package ExRapido;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ExRapido {

    public static void main(String[] args) {
        int[] ar = {5,9,10,7,4};
        int k = 2;
        int contadorVezes = 0;
        for(int i = 0; i < (ar.length - 1); i++) {
            for(int j = 0; j < (ar.length - i); j++) {
                int sum = ar[i] + ar[i+j];
                if((i+j) < (ar.length - 1)) {
                    if((sum % k) == 0) {
                        contadorVezes++;
                    }
                }
            }
        }
        System.out.println(contadorVezes);;
    }
}
