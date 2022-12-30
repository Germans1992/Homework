public class Main {
    public static void main(String[] args) {
        PensionFund state = new PensionFund("Texas",true,"16.08.1992");
        PensionFund noState = new PensionFund("Dallas", false,"12.01.2003");

        double statePension = state.countPensionPayment(15,1000,2900);
        double noStatePension = noState.countPensionPayment(15,1000,2900);

        System.out.println(statePension);
        System.out.println(noStatePension);

    }
}

