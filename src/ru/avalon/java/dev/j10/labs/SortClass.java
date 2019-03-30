/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author makram
 */
public class SortClass implements Sort{

    @Override
    public void sort(Object[] array) {
        for(int i=0;i<array.length; i++){
            for(int j=0;j<array.length; j++){
                if(array[i].equals(array[j])){
                    Object temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else {
                }
            }
        }
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
        
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        
    }
    
}
