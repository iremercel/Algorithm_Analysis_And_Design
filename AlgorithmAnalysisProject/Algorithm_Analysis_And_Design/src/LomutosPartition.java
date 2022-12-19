/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ercel
 */
public class LomutosPartition {

    public static void swap(int[] b, int i, int j) {
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }

    public static int LomutoPartition(int[] b, int low, int high) {
        int pivot = b[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (b[j] <= pivot) {
                swap(b, i, j);
                i++;
            }
        }
        swap(b, i, high);

        return i;
    }

    public static void LomutosQuickSort(int[] b, int low, int high) {
        
        if (low < high) {
            int p = LomutoPartition(b, low, high);
            LomutosQuickSort(b, 0, p - 1);
            LomutosQuickSort(b, p + 1, high);
        }
        
    }
    
    
    public static void LomutosSelectionSort(int[] b, int low, int high) {
        
        if (low < high) {
            int p = LomutoPartition(b, low, high);
            LomutosQuickSort(b, 0, p - 1);
            LomutosQuickSort(b, p + 1, high);
        }
        
    }

}
