/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

//import static javafx.scene.input.KeyCode.T;

import java.util.Arrays;


/**
 *
 * @author User
 */
public class Sorted {
 
public static void bubbleSort(Lista<Integer> lista) {
    int comp=0;
    int swapin=0;
    boolean sorted = false;
    Integer temp;
    Integer dataA;
    Integer dataB;

    
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < lista.len()-1; i++) {
           System.out.println(lista.getInfo(i));
            dataA=lista.getInfo(i);
            dataB=lista.getInfo(i+1);
           // System.out.println(lista.getInfo(i));
           comp++;
            if (dataA > dataB) {
                swapin++;
                lista.swap(i, i+1);
                sorted = false;

                }           
        }
    } 
 } 

static Integer partition(Lista<Integer> array, Integer begin, Integer end) {
    Integer pivot = end;

    Integer counter = begin;
    for (Integer i = begin; i < end; i++) {
        if (array.getInfo(i)< array.getInfo(pivot)) {
            array.swap(counter, i);
            counter++;
        } 
    }
    array.swap(counter, pivot);
    return counter;
}

public static void quickSort_aux(Lista<Integer> array, Integer begin, Integer end) {
    if (end <= begin){ return;}
    Integer pivot = partition(array, begin, end);
    quickSort_aux(array, begin, pivot-1);
    quickSort_aux(array, pivot+1, end);
}

public static void quickSort(Lista<Integer> array){
    quickSort_aux(array,0,array.len()-1);
}



public static void insertionSort(Lista<Integer> lista) {
    int comp=0;
    int swapin=0;
    for (int i = 1; i < lista.len(); i++) {
        Integer current =  lista.getInfo(i);
        Integer j = i - 1;
        while(j >= 0 && current < lista.getInfo(j)) {
          //  array[j+1] = array[j];
            comp++;
            swapin++;
            lista.replace(j+1, lista.getInfo(j));
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        //array[j+1] = current;
        swapin++;
        lista.replace(j+1, current);
    }
}


public static void selectionSort(Lista<Integer> lista) {
    int comp=0;
    int swapin=0;
    for (int i = 0; i < lista.len(); i++) {
        Integer min = lista.getInfo(i);
        Integer minId = i;
        for (int j = i+1; j < lista.len(); j++) {
            if (lista.getInfo(j) < min) {
                comp++;
                min = lista.getInfo(j);
                minId = j;
            }
        }
        // swapping
        swapin++;
        Integer temp = lista.getInfo(i);
        lista.replace(i, min);
        lista.replace(minId, temp);
    }
}



// Radix sort Java implementation //_____________________________________________________________________________________


  
    // A utility function to get maximum value in arr[] 
     // A utility function to get maximum value in arr[] 
static int getMax(Lista<Integer> arr, int n) { 
    int mx = arr.getInfo(0); 
    for (int i = 1; i < n; i++) { 
        if (arr.getInfo(i) > mx) {
            mx = arr.getInfo(i);
        }
    } 
        return mx; 
    } 
  
// A function to do counting sort of arr[] according to 
// the digit represented by exp. 
static void countSort(Lista<Integer> arr, int n, int exp) { 
    Lista<Integer> output = new Lista<>(); // output array 
    int i; 
    Lista <Integer> count = new Lista<>(); 
    count.expand(10, 0);
    output.expand(n, 0);

    // Store count of occurrences in count[] 
    for (i = 0; i < n; i++) {
        int pos=(arr.getInfo(i)/exp)%10;
        count.replace(pos,count.getInfo(pos)+1);
    } 

    // Change count[i] so that count[i] now contains 
    // actual position of this digit in output[] 
    for (i = 1; i < 10; i++) {
        count.replace(i, count.getInfo(i)+count.getInfo(i-1));
    } 
    
    // Build the output array 
    for (i = n - 1; i >= 0; i--){ 
        int posi=count.getInfo((arr.getInfo(i)/exp)%10 ) - 1;
        output.replace(posi , arr.getInfo(i)); 
        int pos=((arr.getInfo(i)/exp)%10);
        count.replace(pos,count.getInfo(pos)-1); 
    } 

    // Copy the output array to arr[], so that arr[] now 
    // contains sorted numbers according to current digit 
    for (i = 0; i < n; i++) {
        arr.replace(i,output.getInfo(i));
    } 
} 

// The main function to that sorts arr[] of size n using 
// Radix Sort 
static void radixsort(Lista<Integer> arr){ 
    // Find the maximum number to know number of digits 
    int m = getMax(arr, arr.len()-1); 
    int n=arr.len()-1;
    // Do counting sort for every digit. Note that instead 
    // of passing digit number, exp is passed. exp is 10^i 
    // where i is current digit number 
    for (int exp = 1; m/exp > 0; exp *= 10) {
        countSort(arr, n, exp);
    } 
} 


/*Driver function to check for above function*/

 
}
