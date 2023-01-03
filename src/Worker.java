public class Worker extends Person{

    private int minSalary;

    private int maxSalary;

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    public Worker(String name, int age, int height, int weight) {
        super(name, age, height, weight);


    }
}

