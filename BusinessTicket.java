public class BusinessTicket extends Ticket {

    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25; // Tambahan 25%
    }
    
    public String getFacilities() {
        return "Business Class Facilities: Premium in-flight meal, 25kg baggage allowance, priority boarding.";
    }
}
