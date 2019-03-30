/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author makram
 */
class PersonNameComparator implements Comparator<Person>{
  
    @Override
    public int compare(Person a, Person b){
      
        return a.getName().compareTo(b.getName());
    }
}
class PersonAgeComparator implements Comparator<Person>{
  
    @Override
    public int compare(Person a, Person b){
      
        if(a.getBirthDate().getTime() > b.getBirthDate().getTime())
            return 1;
        else if(a.getBirthDate().getTime()< b.getBirthDate().getTime())
            return -1;
        else
            return 0;
    }
}