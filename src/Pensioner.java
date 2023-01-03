public class Pensioner extends Person{

    private double pension;

    @Override
    public void die() {
        int age = this.getAge();
        System.out.println("Этот пенсионер умер, он заработал " +
                (age - 50) * pension );
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public Pensioner(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

}
// В классе Pensioner реализуем так:
//        пишем на экран "Этот пенсионер умер,
//        он заработал: x". Где вместо x нужно рассчитать
//        значение по формуле "(age-50)*pension"