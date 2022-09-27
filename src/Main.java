public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] %2 != 0){
                array1[i] = array1[i] + 1;
            }
            if (i == array1.length-1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
    }
}