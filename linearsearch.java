public class linearsearch {
    public static void main(String[] args) {
        int[] array = {9,2,6,1,2,5,0,7,3,8,4};
        int index = lnrsearchfunc(array, 3);

        if (index != -1) {
            System.out.println("Element found at index: " +index);
        } else {
            System.out.println("Element not found!");
        }
    }

    private static int lnrsearchfunc(int[] array, int i) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) {
                return j;
            }
        }
        return -1;
    }
}
