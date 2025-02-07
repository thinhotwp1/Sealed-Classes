package ldt.example;

public sealed class Mouse implements Animal permits MouseRobot {

    @Override
    public void name() {
        System.out.println("Hello Mouse");
    }
}
