import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (state != that.state) return false;
        if (!Objects.equals(nameOfPensionFund, that.nameOfPensionFund))
            return false;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = nameOfPensionFund != null ? nameOfPensionFund.hashCode() : 0;
        result = 31 * result + (state ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}

