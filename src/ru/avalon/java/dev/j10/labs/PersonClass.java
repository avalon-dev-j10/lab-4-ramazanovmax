/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author makram
 */
public class PersonClass  implements Person{
    private final String name;
    private final Date birthDate;

    public PersonClass(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

  
    @Override
    public int compareTo(PersonClass t) {
        if(this.getBirthDate().getTime() < t.getBirthDate().getTime()){
            return 1;
        }else if(this.getBirthDate().getTime() > t.getBirthDate().getTime()){
            return -1;
        }
        return 0;
    }
}
