
public class EconomyTicket extends Ticket {

    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9; // Diskon 10%
    }
    
    public String getFacilities() {
        return "Economy Class Facilities: Basic in-flight meal, 15kg baggage allowance.";
    }
}
