package com.mycompany.hotel;

/**
 *
 * @author ghostafbr
 */
public class phoneObserver extends Observer {
	
	public phoneObserver(roomSubject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void update() {
            if (subject.getStatus() == true) {
                System.out.println("Estado del teléfono: " + "habilitado");
            } else {
                System.out.println("Estado del teléfono: " + "deshabilitado");
            }
	}
}
