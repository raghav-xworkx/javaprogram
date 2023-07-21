class ParkMain {
    public static void main(String[] args) {

        Park park1 = new Park("Lal Bhag");
        System.out.println("\n");

        Park park2 = new Park("Lal Bhag", "Lal-Bhag metro");
        System.out.println("\n");

        Park park3 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0);
        System.out.println("\n");

        Park park4 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0);
        System.out.println("\n");

        Park park5 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0, 5);
        System.out.println("\n");

        Park park6 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0, 5, true);
        System.out.println("\n");

        Park park7 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0, 5, true, yes);
        System.out.println("\n");

        Park park8 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0, 5, true, yes, yes);
        System.out.println("\n");

        Park park9 = new Park("Lal Bhag", "Lal-Bhag metro", 10.0, 10.0, 5, true, yes, yes, true);
    }
}