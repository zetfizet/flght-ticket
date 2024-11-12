public abstract class Ticket {
    protected String passengerName;
    protected double baseFare;
    
    public Ticket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }
    
    // Abstract method to calculate fare
    public abstract double calculateFare();
    
    public String getPassengerName() {
        return passengerName;
    }
    
    public double getBaseFare() {
        return baseFare;
    }
}
