import java.util.Arrays;
import java.util.Comparator;

public class ArrayShakerSortAdvanced<T> implements ArraySorter<T>{
    private final Comparator<T> _comparator;
    public ArrayShakerSortAdvanced(Comparator<T> comparator)
    { _comparator = comparator; }

    public T[] sort(T[] list) {
        int size = list.length;
        int end = size-1;
        int swapNumber=size-1;
        int begin = 1;
        while(swapNumber>0) {
            swapNumber=0;
            for (int left = begin-1; left < end; ++left) {
                int right = left + 1;
                if (_comparator.compare(list[left], list[right]) > 0){
                    swap(list, left, right);
                    swapNumber++;
                }

            }
            end--;
            System.out.println(Arrays.toString(list));
            //jeśli brak zmiany, to nie przechodzi do sortowania w prawo tylko kończy pętlę
            if (swapNumber==0)break;

            for (int right = end; right >= begin-1; --right) {
                int left = right + 1;
                if (_comparator.compare(list[right], list[left]) > 0){
                    swap(list, right, left);
                    swapNumber++;
                }
            }
            begin++;
            System.out.println(Arrays.toString(list));

        }
        return list;
    }
    private void swap(T[] list, int left, int right) {
        T temp = list[left];
        list[left] = list[right];
        list[right] = temp;
    }

}
