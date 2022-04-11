import java.util.Arrays;
import java.util.Comparator;

public class ArrayShakerSort<T> implements ArraySorter<T>{
    private final Comparator<T> _comparator;
    public ArrayShakerSort(Comparator<T> comparator)
    { _comparator = comparator; }
    // the result is a sorted primary list
    // najbardziej prymitywna wersja
    public T[] sort(T[] list) {
        int size = list.length;
        int end=size-1;
        for (int pass = 1; pass < (size+1)/2; ++pass) {
            for (int left = pass-1; left < end; ++left) {
                int right = left + 1;
                if (_comparator.compare(list[left], list[right]) > 0)
                    swap(list, left, right);
            }
            System.out.println(Arrays.toString(list));
            end--;

            for (int right = end; right >= pass-1; --right) {
                int left = right + 1;
                if (_comparator.compare(list[right], list[left]) > 0)
                    swap(list, right, left);
            }

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
