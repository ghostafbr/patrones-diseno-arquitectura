package com.mycompany.hotel;

/**
 *
 * @author ghostafbr
 */
public class thermostatObserver extends Observer {

    private double defaultTemp = 21;
    private boolean status = false;

    public thermostatObserver(roomSubject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        this.status = subject.getStatus();
        if ( this.status == true) {
            System.out.println("Se configura la temperatura del termostato a: " + this.defaultTemp +"°C");
        } else {
            System.out.println("Se apaga el termostato");
        }
        
    }
}
