/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.rxjava2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscriber;

/**
 *
 * @author letrt
 */
public class Simple {

    public static void main(String[] args) {
        Observable<Integer> obs = Observable.just(1, 2, 3);
        obs.subscribe(s -> System.out.println(s));
        
        Consumer<Integer> con = new Consumer() {
            @Override
            public void accept(Object obj) throws Throwable {
                if(obj instanceof Integer){
                    System.out.println("Integer receive: " + (Integer)obj);
                }
            }
        };
        
        obs.subscribe(con);
    }
}
