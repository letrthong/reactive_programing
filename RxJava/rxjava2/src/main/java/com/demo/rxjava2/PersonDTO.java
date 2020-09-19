/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.rxjava2;

/**
 *
 * @author letrt
 */
public class PersonDTO {

    public String name;
    public String adrress;

    public PersonDTO() {
    }

    public PersonDTO(String name, String adrress) {
        this.name = name;
        this.adrress = adrress;
    }

    @Override
    public String toString() {
        return String.format("Person name: " + this.name + " arrdess: " + this.adrress);
    }
}
