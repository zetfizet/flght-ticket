import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Ticket> tickets = new ArrayList<>();

    public void reserveTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket reserved for " + ticket.getPassengerName() + 
                           ". Total fare: $" + ticket.calculateFare());
        System.out.println(ticket.getClass().getSimpleName() + " facilities: " + 
                           ((ticket instanceof EconomyTicket) ? ((EconomyTicket) ticket).getFacilities() :
                           (ticket instanceof BusinessTicket) ? ((BusinessTicket) ticket).getFacilities() :
                           ((FirstClassTicket) ticket).getFacilities()));
    }

    public void showAllReservations() {
        System.out.println("All Ticket Reservations:");
        for (Ticket ticket : tickets) {
            System.out.println("Passenger: " + ticket.getPassengerName() + 
                               ", Class: " + ticket.getClass().getSimpleName() + 
                               ", Total Fare: $" + ticket.calculateFare());
        }
    }
}
