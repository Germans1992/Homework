import java.util.Objects;

public class PensionFund {

    private static final double AveragePensionInCountry = 1500;
    public static final double COEFFICIENT_PENSION = 0.02;
    private final String nameOfPensionFund;

    private final TypeOfPensionFund fewFunds;

    private final String date;

    public PensionFund(String nameOfPensionFund, TypeOfPensionFund fewFunds, String date) {
        this.nameOfPensionFund = nameOfPensionFund;
        this.fewFunds = fewFunds;
        this.date = date;
    }

    public double countPensionPayment(int age, double minPension, double maxPension) {
        double averagePayment = 0.0;

        switch (fewFunds) {
            case STATE:
                averagePayment = AverageUtils.average(maxPension, minPension);
                break;
            case NOSTATE:
                averagePayment = AverageUtils.average(maxPension, minPension, AveragePensionInCountry);
                break;
            case SCAMMERS:
                return 0;
        }
        return averagePayment * COEFFICIENT_PENSION * age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (!Objects.equals(nameOfPensionFund, that.nameOfPensionFund))
            return false;
        if (fewFunds != that.fewFunds) return false;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = nameOfPensionFund != null ? nameOfPensionFund.hashCode() : 0;
        result = 31 * result + (fewFunds != null ? fewFunds.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
