public class BubbleSort <T extends Comparable<T>> {

    public T[] sort(T[] listOfItems){
        for(int i = 0; i < listOfItems.length-1; i++){
            for (int j = 0; j < listOfItems.length-i-1; j++){
                if(listOfItems[j].compareTo(listOfItems[j+1]) > 0){
                    T temp = listOfItems[j+1];
                    listOfItems[j+1] = listOfItems[j];
                    listOfItems[j] = temp;
                }
            }
        }
        return listOfItems;
    }

    public void showArray(T[] listOfItems){
        for (T i: listOfItems){
            System.out.print(i + " ");
        }
    }
}
