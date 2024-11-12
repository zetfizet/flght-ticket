public class Main {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        
        Ticket economyTicket = new EconomyTicket("Alice", 100.0);
        Ticket businessTicket = new BusinessTicket("Bob", 100.0);
        Ticket firstClassTicket = new FirstClassTicket("Charlie", 100.0);
        
        system.reserveTicket(economyTicket);
        system.reserveTicket(businessTicket);
        system.reserveTicket(firstClassTicket);
        
        system.showAllReservations();
    }
}

