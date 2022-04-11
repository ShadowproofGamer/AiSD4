import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] arr, int k)
    {
        k++;
        int n=arr.length;
        int[] pos=new int[k];
        int[] result=new int[n];
        int i,j;
        for(i=0;i<k;i++)
            pos[i]=0;
        for(j=0;j<n;j++)
            pos[arr[j]]++;
        pos[0]--;
        for(i=1;i<k;i++)
            pos[i]+=pos[i-1];
        for(j=n-1;j>=0;j--)
        {
            result[pos[arr[j]]]=arr[j];
            System.out.println("tablica pos: "+Arrays.toString(pos));
            pos[arr[j]]--;
            System.out.println("tablica wynikowa: "+Arrays.toString(result));
        }
        for(j=0;j<n;j++)
            arr[j]=result[j];
    }
}
