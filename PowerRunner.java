class PowerRunner {
    public static void main(String[] args) {
        System.out.println("Checking main in powerrunner");

        Power power = new Power("physical", "activity");
        Power.staticPower();
        power.instancePower();

        System.out.println("\n");
        Power power1 = new Power("scalar", "real power");
        Power.staticPower();
        power1.instancePower();

    }

}