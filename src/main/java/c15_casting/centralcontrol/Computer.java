package c15_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("Computer의 전원을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("Computer의 전원을 끕니다");
    }
}
