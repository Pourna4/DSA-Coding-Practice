import java.io.*;
import java.util.*;

public class Solution {
  
    public static void insertionSort(int arr[], int n) {
      for(int i=1;i<n;i++) {
        for(int j=i-1;j>=0;j--) {
          if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          } else {
            break;
          }
        }
      }
      
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }

    public static void main(String[] args) {import java.io.*;
import java.util.*;

public class Solution {
  
    public static int [] mergeTwoSortedArrays(int fh[], int sh[]) {
      int i=0,j=0,k=0;
      int n1 = fh.length;
      int n2 = sh.length;
      
      int res[] = new int[n1+n2];
      
      while(i<n1 && j<n2) {
        if(fh[i] > sh[j]) {
          res[k] = sh[j];
          j++;
        } else {
          res[k] = fh[i];
          i++;
        }
        k++;
      }
      
      
      while(i<n1) {
        res[k] = fh[i];
        i++;
        k++;
      }
      
      while(j<n2) {
        res[k] = sh[j];
        j++;
        k++;
      }
      
      return res;
    }
  
    public static int [] mergeSort(int arr[], int low, int high) {
      if (low == high) {
        int base[] = new int[1];
        base[0] = arr[low];
        return base;
      }
      
      int mid = (low+high)/2;
      
      int fh[] = mergeSort(arr,low,mid);
      int sh[] = mergeSort(arr,mid+1,high);
      
      return mergeTwoSortedArrays(fh,sh);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      arr = mergeSort(arr,0,n-1);
      import java.io.*;
import java.util.*;

public class Solution {
     
      public static int sortByPivot(int arr[], int low, int high, int pivot) {
        
        int i = low, j=low;
        while(i<=high) {
          if (arr[i] <= pivot) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j++;
          } else {
            i++;
          }
        }
        
        return j-1;
        
      }
    
    public static void quickSort(int arr[], int low, int high) {
      if (low > high) {
        return;
      }
      
      int pivot = arr[high];
      int pindx = sortByPivot(arr, low, high, pivot);
      
      quickSort(arr, low, pindx-1);
      quickSort(arr, pindx+1, high);
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      quickSort(arr,0,n-1);
      
      for(int i =0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      insertionSort(arr,n);
        
    }
}