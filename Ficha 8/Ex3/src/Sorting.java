public class Sorting {

    /**
     * @param data
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void
    selectionSortmin(T[] data) {
        int min;
        T temp;
        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }
            /** Swap the values */
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

    public static <T extends Comparable<? super T>> void
    selectionSortmax(T[] data) {

        int max;
        T temp;

        for (int index = data.length - 1; index >= 0 ; index--) {
            max = index;
            for (int scan = index - 1; scan >= 0; scan--) {
                if (data[scan].compareTo(data[max]) < 0) {
                    max = scan;
                }
            }
            /** Swap the values */
            temp = data[max];
            data[max] = data[index];
            data[index] = temp;
        }
    }
}
