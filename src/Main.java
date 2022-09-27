public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        for (int i = array1.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = array2.length-1; i >= 0; i--) {
            {
                if (i == 0) {
                    System.out.print(array2[i]);
                } else {
                    System.out.print(array2[i] + ", ");
                }
            }
        }
        System.out.println();
        double[] array3 = {10, 2, 1421, 23, 412.4, 543, 534.124, 8};
        for (int i = array3.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }
    }
}