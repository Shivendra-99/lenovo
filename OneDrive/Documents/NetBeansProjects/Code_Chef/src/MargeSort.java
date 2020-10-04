import java.util.*;
public class MargeSort {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int array[]={12,5,-1,24,3,4};
       margeSo(array,0,array.length-1);
       for(int i=0;i<array.length;i++)
       {
           System.out.print(array[i]+" ");
       }
    }
    private static void margeSo(int[] array, int l, int r) {
       if(r>l)
       {
        int mid=(l+r)/2;
       margeSo(array,l,mid);
       margeSo(array,mid+1,r);
       marge(array,l,r,mid);
       }
    }
    private static void marge(int[] array, int l, int r,int mid) {
        int temp[]=new int[20000];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r)
        {
           if(array[i]<=array[j])
           {
               temp[k]=array[i];
               i++;
               k++;
           }
           else
           {
             temp[k]=array[j];
             k++;
             j++;
           }
        }
        while(i<=mid)
        {
         temp[k]=array[i];
         i++;
         k++;
        }
        while(j<=r)
        {
         temp[k]=array[j];
         j++;
         k++;
        }
       for(int index=l,p=0;index<=r;index++,p++)
       {
           array[index]=temp[p];
       }
    }
}
