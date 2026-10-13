class CinemaBooking {
    String customerName, movieName;
    double ticketPrice;
    int tickets;

    CinemaBooking() {
        customerName = "Unknown";
        movieName = "Avatar";
        ticketPrice = 200;
        tickets = 0;
    }

    CinemaBooking(String c, String m, double p, int t) {
        customerName = c.toUpperCase();
        movieName = m.toUpperCase();
        ticketPrice = p;
        tickets = t;
    }

    void bookTickets(int t) {
        tickets = t;
        display();
    }

    void bookTickets(String c, int t) {
        customerName = c.toUpperCase();
        tickets = t;
        display();
    }

    void display() {
        System.out.println("\nCustomer Name      : " + customerName);
        System.out.println("Movie Name         : " + movieName);
        System.out.printf("Ticket Price       : Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets  : " + tickets);

        if (tickets <= 0) {
            System.out.println("Booking Status     : Invalid number of tickets");
            return;
        }

        double total = ticketPrice * tickets;
        double discount = tickets >= 5 ? total * 0.10 : 0;
        double finalAmount = total - discount;

        System.out.println("Booking Status     : Booking Successful");
        System.out.printf("Total Amount       : Rs. %.2f%n", total);
        System.out.printf("Discount           : Rs. %.2f%n", discount);
        System.out.printf("Final Amount       : Rs. %.2f%n", finalAmount);
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        CinemaBooking b1 =
            new CinemaBooking("Sneha", "Avatar", 200, 5);
        b1.display();

        CinemaBooking b2 = new CinemaBooking();
        b2.bookTickets("Arjun", 2);

        if (b1.customerName.equalsIgnoreCase(b2.customerName))
            System.out.println("\nCustomer Verification: Names Match");
        else
            System.out.println("\nCustomer Verification: Names Do Not Match");

        System.out.println("=============================================");
    }
}
