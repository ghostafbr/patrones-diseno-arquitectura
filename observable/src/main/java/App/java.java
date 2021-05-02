package App;

import com.mycompany.hotel.electricityObserver;
import com.mycompany.hotel.phoneObserver;
import com.mycompany.hotel.roomSubject;
import com.mycompany.hotel.thermostatObserver;

/**
 *
 * @author ghostafbr
 */
public class java {

    public static void main(String[] args) {
        roomSubject subject = new roomSubject();

        new phoneObserver(subject);
        new thermostatObserver(subject);
        new electricityObserver(subject);

        System.out.println("Si se hace checkIn: ");
        subject.setStatus(true);
        System.out.println("-----------------");
        System.out.println("Si se hace checkOut: ");
        subject.setStatus(false);
    }
}
