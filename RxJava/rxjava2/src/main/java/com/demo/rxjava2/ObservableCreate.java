/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.rxjava2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.subjects.PublishSubject;

/**
 *
 * @author letrt
 */
public class ObservableCreate {

    public static void main(String[] args) {

        PublishSubject<PersonDTO> pub =  PublishSubject.create();
        
        PersonPresenter personPresenter = new PersonPresenter();
        pub.subscribe(personPresenter);
        
        PersonDTO per1 = new PersonDTO("Phong", "96 Cao Thang");
        PersonDTO per2 = new PersonDTO("Thuan", "96 Cao Thang");
        
        pub.onNext(per1);
        pub.onNext(per2);
    }
}
