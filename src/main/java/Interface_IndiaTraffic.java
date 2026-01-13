public class Interface_IndiaTraffic implements Interface_CentralTraffic, Interface_ContinentalTraffic {
    public static void main(String[] args) {
        Interface_CentralTraffic ct = new Interface_IndiaTraffic();
        ct.greenGo();
        ct.redStop();
        ct.flashYellow();

        Interface_IndiaTraffic ind = new Interface_IndiaTraffic();
        ind.walking();

        Interface_ContinentalTraffic contr = new Interface_IndiaTraffic();
        contr.zeebraCrossing();
    }

    @Override
    public void greenGo() {
        System.out.println("greenGo");
    }

    @Override
    public void redStop() {
        System.out.println("redStop");
    }

    @Override
    public void flashYellow() {
        System.out.println("flashYellow");
    }

    public void walking(){
        System.out.println("walking");
    }

    @Override
    public void zeebraCrossing() {
        System.out.println("zeebraCrossing");
    }
}
