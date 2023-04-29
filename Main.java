package star;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	        int[] dizi = {3, 7, 3, 3, 2, 9,2,18, 21, 1,4 ,33, 9, 1,4};
    	        boolean tekrarEdenVar = false;

    	        // Çift sayıları kontrol etme
    	        for (int i = 0; i < dizi.length; i++) {
    	            int sayi = dizi[i];
    	            if (sayi % 2 == 0) { // Çift sayı
    	                // Diğer elemanları kontrol etme
    	                for (int j = i + 1; j < dizi.length; j++) {
    	                    if (sayi == dizi[j] && sayi % 2 == 0) {
    	                        System.out.println(sayi + " tekrar eden bir çift sayıdır.");
    	                        tekrarEdenVar = true;
    	                        break;
    	                    }
    	                }
    	            }
    	        }
    	        if (!tekrarEdenVar) {
    	            System.out.println("Tekrar eden çift sayı yok.");
    	        }
    }
}
