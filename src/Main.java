import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // 1. Задача
        int[] onesZeros = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        int[] resultV1 = replacingV1(onesZeros);

        for (int i = 0; i < resultV1.length; i++) {
            //System.out.println("replaced " + resultV1[i]);
        }

        int[] resultV2 = replacingV2(onesZeros);

        for (int i = 0; i < resultV2.length; i++) {
            //System.out.println("replaced " + resultV2[i]);
        }

        // 1. Конец Задача ---------------------------------------------------------

        // 2. Задача
        int[] numArray = new int[8];
        int[] toArray = {0, 3, 6, 9, 12, 15, 18, 21};

        // Dumping out before
        //System.out.println("Before " +Arrays.toString(numArray));

        int[] resultNumV1 = fillArrayV1(numArray, toArray);

        for (int i = 0; i < resultNumV1.length; i++) {
            //System.out.println(resultNumV1[i]);
        }

        int[] resultNumV2 = fillArrayV2();
        //System.out.println(Arrays.toString(resultNumV2));

        // Dumping out after
        //System.out.println("After " +Arrays.toString(numArray));

        // 2. Конец Задача ---------------------------------------------------------

        // 3. Задача
        int[] fake = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //printingV1(fake);

        int[] resultFake = printingV2(fake);
        //System.out.println(Arrays.toString(resultFake));

        // 3. Конец Задача ---------------------------------------------------------

        // 4. Задача
        //boxOfColumnsAndRows(5);
        // 4. Конец Задача ---------------------------------------------------------

        // 5. Задача
        int[] array = {12, 33, 50, 65, 70, 80, 100};
        // 5. Конец Задача ---------------------------------------------------------
    }

    /**
     * 1. Задача - вариант 1
     *
     * @param array int onesZeros
     * @return array int
     */
    public static int[] replacingV1(int[] onesZeros) {
        int[] replaced = new int[onesZeros.length];
        for (int i = 0; i < onesZeros.length; i++) {
            replaced[i] = (onesZeros[i] == 1) ? 0 : 1;
        }
        return replaced;
    }

    /**
     * 1. Задача - вариант 2
     *
     * @param array int onesZeros
     * @return array int
     */
    public static int[] replacingV2(int[] onesZeros) {
        for (int i = 0; i < onesZeros.length; i++) {
            onesZeros[i] = (onesZeros[i] == 1) ? 0 : 1;
        }
        return onesZeros;
    }

    /**
     * 2. Задача - вариант 1
     *
     * @param array numArray
     * @param array toArray
     * @return int array
     */
    public static int[] fillArrayV1(int[] numArray, int[] toArray) {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = toArray[i];
        }
        return numArray;
    }

    /**
     * 2. Задача - вариант 2
     * Добавлено требование для второй задачи MF
     * @return int array
     */
    public static int[] fillArrayV2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (2 + 1) * i;
        }
        return array;
    }

    /**
     * 3. Задача - вариант 1
     *
     * @param fake
     * @return void
     */
    public static void printingV1(int[] fake) {
        for (int i = 0; i < fake.length; i++) {
            if (fake[i] < 6) {
                System.out.println("found " + fake[i] + " x 2 =" + "  " + (fake[i] *= 2));
            } else {
                System.out.println("Can not do that..!");
            }
        }
    }

    /**
     * 3. Задача - вариант 2
     *
     * @param array fake
     * @return int array
     */
    public static int[] printingV2(int[] fake) {
        for (int i = 0; i < fake.length; i++) {
            fake[i] *= 2;
        }
        return fake;
    }

    /**
     * @param int length
     * @return void
     */
    public static void boxOfColumnsAndRows(int length) {
        int[][] box = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                box[i][j] = 1;

                System.out.printf("%4d", box[i][j]);
            }
            System.out.println();
        }
    }

}
