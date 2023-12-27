public class Task3 {
    public static void main(String[] args) {
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0)
                System.out.print(", ");
            else System.out.println();
        }


        double [] array2 = {1.57, 7.654, 9.986};
        for (int j = array2.length - 1; j >= 0; j--) {
            System.out.print(array2[j]);
            if (j != 0)
                System.out.print(", ");
            else System.out.println();
        }

        int [] array3 = {24, 28, 32, 36, 40};
        for (int k = array3.length - 1; k >= 0; k--) {
            System.out.print(array3[k]);
            if (k != 0)
                System.out.print(", ");
        }
    }
}

