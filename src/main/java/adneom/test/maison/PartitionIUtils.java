package adneom.test.maison;


import java.util.Arrays;

public class PartitionIUtils {



    public int[][] partition(int [] liste, int taille) {

        int total = getTotalSubArrays(liste, taille);

        int [][] response = new int[total][taille];
        int from = 0;
        int to = taille - 1;

        for (int i=0; i<total; i++) {
            response[i] = getSubArray(liste, from, to);

            from = to + 1;
            to = to + taille;
            if (to > liste.length - 1) {
                to = liste.length - 1;
            }
        }

        return response;
    }

    private int getTotalSubArrays(int[] liste, int taille) {
        int total = liste.length/taille;
        int length = total * taille;
        if (length < liste.length) {
            total ++;
        }
        return total;
    }

    private int[] getSubArray(int[] liste, int from, int to) {
        int[] subArray = new int[to-from+1];
        int k = 0;
        for (int i=from; i<=to; i++) {
            subArray[k] = liste[i];
            k++;
        }
        return subArray;
    }
}
