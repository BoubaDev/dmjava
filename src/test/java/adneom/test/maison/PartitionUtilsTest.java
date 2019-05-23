package adneom.test.maison;

import org.junit.Test;

import java.util.Arrays;

public class PartitionUtilsTest {

    @Test
    public void partition() {
        int liste[] = {33,3,4,5, 10, 43, 56, 0};
        int taille = 3;


        PartitionIUtils pu = new PartitionIUtils();
        int[][] response = pu.partition(liste, taille);

        for (int i=0; i<response.length; i++) {
            System.out.println(Arrays.toString(response[i]));
        }
    }
}
