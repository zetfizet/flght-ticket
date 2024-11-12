public class FirstClassTicket extends Ticket {

    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5; // Tambahan 50%
    }
    
    public String getFacilities() {
        return "First Class Facilities: Luxury meal, 40kg baggage allowance, access to lounge, priority check-in and boarding.";
    }
}