/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.rxjava2;

import io.reactivex.rxjava3.functions.Consumer;

/**
 *
 * @author letrt
 */
public class PersonPresenter implements Consumer<PersonDTO> {

    @Override
    public void accept(PersonDTO person) throws Throwable {
        System.out.println(person.toString());
    }

}
