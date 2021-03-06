package patterns.factory.method.trucking;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 28.01.19
 */
public class Airplane implements Transport {
    @Override
    public void move() {
        System.out.println("Самолет -> move : Скорость до 1000 км/час");
    }

    @Override
    public void stop() {
        System.out.println("Самолет -> stop: посадка в аэропорту");
    }

    @Override
    public void freight() {
        System.out.println("Самолет -> freight: перевозит любые товары по воздуху");
    }
}
