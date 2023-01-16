public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;

    private double maxSalary;
    private Month month;

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public double getMinSalary() {
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
        PensionFund pensionFund = new PensionFund("Baltic", TypeOfPensionFund.SCAMMERS, "13.10.2001");
        return pensionFund.countPensionPayment(getAge(), getMinSalary(), getMaxSalary());

    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public void setNewSalary() {
//        Sex sex = getSex();
//
//        switch (sex) {
//           case MALE:
//               minSalary *= 1.5;
//               maxSalary *= 1.5;
//               break;
//            case FEMALE:
//                minSalary *= 1.6;
//                maxSalary *= 1.6;
//        }
//        switch (month) {
//            case DECEMBER:
//                minSalary *= 10;
//                maxSalary *= 10;
//                break;
//            case NOVEMBER:
//                minSalary *= 2;
//                maxSalary *= 2;
//                break;
//            case JANUARY:
//                minSalary *= 1.1;
//                maxSalary *= 1.1;
//                break;
//            default: //Все остальные которые не попали!
//                minSalary *= 0;
//                maxSalary *= 0;
//                break;
//
//        }

        double number = month.getNumber();

        minSalary *= number;
        maxSalary *= number;
    }
}
