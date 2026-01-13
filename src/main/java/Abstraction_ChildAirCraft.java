public class Abstraction_ChildAirCraft extends Abstraction_ParentAirCraft {
    public static void main(String[] args) {
        Abstraction_ChildAirCraft p = new Abstraction_ChildAirCraft();
        p.engine();
        p.safety();
        p.bodyColor();
    }

    @Override
    public void bodyColor() {
        System.out.println("Air Craft color = Red");
    }
}
