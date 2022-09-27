
import java.util.Arrays;

public class QuickSort {
    static void swap(int a[],int i, int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    static int Partition(int a[],int low, int high)
    {
        int pivot = a[high];
        int i= low-1;
        for (int j=low; j<=(high-1);j++)
        {
            if(a[j]<pivot)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return (i+1);
    }
    static void QuickSort(int a[],int low, int high)
    {
        if (low<high)
        {
             
            int pi=Partition(a,low,high);       // pi is partitioning index, arr[p] is now at right place 
                                                // Separately sort elements before partition and after partition
            QuickSort(a,low,pi-1);
            QuickSort(a,pi+1,high);
        }
    }
    public static void main (String args[])
    {
        int a[]={10,9,3,5,0,6};
        
        System.out.println("Unsorted Array:     "+Arrays.toString(a));
        QuickSort(a,0,a.length-1);
        System.out.println("Sorted Array:       "+Arrays.toString(a));
    }
}
