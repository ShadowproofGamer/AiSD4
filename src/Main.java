import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] tab1 = {76,71, 5, 57,12,50,20,93,20,55,62,3};

        Integer[] tab2 = tab1.clone();
        Integer[] tab3 = tab1.clone();
        Integer[] tab4 = tab1.clone();
        Integer[] tab5 = tab1.clone();

        Integer[] tab7 = {76,71, 5, 57,12,50,20,93,20};
        int[] tab8 = {0,2,1,0,4,4,2,1,1,1};
        //zad4b(tab5);

        //zad7(tab7);
        zad8(tab8, 4);




    }
    static void zad1(Integer[] tab1){
        //zad1
        System.out.println("sortowanie przez wstawienie");
        ArrayInsertSort<Integer> is = new ArrayInsertSort<>(new ReverseNaturalOrderComparator());
        is.sort(tab1);
    }
    static void zad2(Integer[] tab2){
        //zad2
        System.out.println("sortowanie przez wybór");
        ArraySelectSort<Integer> ss = new ArraySelectSort<>(new ReverseNaturalOrderComparator());
        ss.sort(tab2);
    }
    static void zad3(Integer[] tab3){
        //zad3
        System.out.println("sortowanie bąbelkowe");
        ArrayBubbleSort<Integer> bs = new ArrayBubbleSort<>(new NaturalOrderComparator());
        bs.sort(tab3);
    }
    static void zad4a(Integer[] tab4){
        //zad4a
        System.out.println("sortowanie shakersort zwyczajne");
        ArrayShakerSort<Integer> sh = new ArrayShakerSort<>(new NaturalOrderComparator());
        sh.sort(tab4);
    }
    static void zad4b(Integer[] tab5){
        //zad4b
        System.out.println("sortowanie shakersort ulepszone");
        ArrayShakerSortAdvanced<Integer> sha = new ArrayShakerSortAdvanced<>(new NaturalOrderComparator());
        sha.sort(tab5);
    }
    static void zad6(Integer[] tab6){
        //zad6

    }
    static void zad7(Integer[] tab7){
        startTab(tab7);
        //zad7
        System.out.println("sortowanie heapsort");
        ArrayMaxHeapSort<Integer> mhs = new ArrayMaxHeapSort<>(new NaturalOrderComparator());
        mhs.sort(tab7);
    }
    static void zad8(int[] tab8, int k){
        System.out.println("Początkowa tablica: \n"+Arrays.toString(tab8));
        CountingSort.sort(tab8, k);
    }
    static void startTab(Integer[] tab){
        System.out.println("Początkowa tablica: \n"+Arrays.toString(tab));
    }
}
