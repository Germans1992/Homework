public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;

    private int maxSalary;

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    public Worker(String name, int age, int height, int weight) {
        super(name, age, height, weight);

    }

    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund("Baltic",true,"13.10.1968");
        return pensionFund.countPensionPayment(getAge(),getMinSalary(),getMaxSalary());
    }
}

//а) Внутри метода создается объект класса Пенсионный фонд
// (из дз от 14 декабря). В нем вызывается метод расчета пенсии,
// в него передаются параметры: возраст, минимальная,
// максимальная зарплаты. Результат этого метода возвращается
// из метода calculatePension
