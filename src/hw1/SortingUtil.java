package hw1;

public class SortingUtil {
    private int[] array;

    public SortingUtil(int[] array){
        this.array=array;
    }

    public int[] getArray() {
        return array;
    }

    public  void insertionSort(){
        for (int j = 1; j < array.length; j++) {
            int cur = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > cur)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = cur;
        }
    }

    public  void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex-1);
            quickSort(partitionIndex+1, end);
        }
    }
    private  int partition( int begin, int end) {
        int pivot = array[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(i,j);
//                int swapTemp = array[i];
//                array[i] = array[j];
//                array[j] = swapTemp;
            }
        }
          swap(i+1,end);
//        int swapTemp = array[i+1];
//        array[i+1] = array[end];
//        array[end] = swapTemp;

        return i+1;
    }
    public void swap(int i,int j){
        int swapTemp = array[i];
        array[i] = array[j];
        array[j] = swapTemp;
    }

}
