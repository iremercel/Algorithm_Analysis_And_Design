
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ercel
 */
public class Test {
    public static void main(String[] args)
    {
       
        int[] a = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
 
        System.out.println("Hoare's Partitions:");
        HoaresPartitions.quicksortHoares(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        
        System.out.println("Lomuto's Partitions:");
        LomutosPartition.LomutosQuickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
        
        
        
        
    }
}