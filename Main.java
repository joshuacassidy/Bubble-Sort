public class Main {
    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.showArray(bubbleSort.recursiveSort(new Integer[] {-1,34,35,534,-30,46,54,546323,52,4,12,536,6},0));

    }

}
