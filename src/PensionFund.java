public class PensionFund {

public static double COEFFICIENT_PENSION = 0.2;
private final String nameOfPensionFund;

private boolean state = true;

private final String date;

    public PensionFund(String nameOfPensionFund, boolean state, String date) {
        this.nameOfPensionFund = nameOfPensionFund;
        this.state = state;
        this.date = date;
    }
    public double countPensionPayment(int age,double minPension, double maxPension){
        double averagePayment;
        if(state){
          averagePayment = AverageUtils.averageSumOfTwo(maxPension,minPension);

        } else {
          averagePayment = AverageUtils.averageSumOfThree(maxPension,minPension,1500);
        }
        return averagePayment * COEFFICIENT_PENSION * age;
    }
}

