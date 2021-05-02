/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotel;

/**
 *
 * @author ghostafbr
 */
public class electricityObserver extends Observer {

    public electricityObserver(roomSubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        if (subject.getStatus() == true) {
            System.out.println("Estado de la electricidad: " + "encendida");
        } else {
            System.out.println("Estado de la electricidad: " + "apagada");
        }
    }
}
