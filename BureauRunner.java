class BureauRunner {
    public static void main(String[] args) {
        System.out.println("Checking main in burearunner");

        Bureau bureau = new Bureau(2, 'M');
        bureau.instanceVarMethod();
        Bureau.staticVarMethod();

    }

}