import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person("Vladimir",33,182,97);
//        Person secondPerson = new Person("German", 30,180,92);
//        person.infoAbout();
//        System.out.println(person);
//        person.go();
//        System.out.println(person);

        PensionFund state = new PensionFund("Texas", TypeOfPensionFund.STATE, "16.08.1992");
        PensionFund noState = new PensionFund("Dallas", TypeOfPensionFund.SCAMMERS, "12.01.2003");



        double statePension = state.countPensionPayment(15, 1000, 2900);
        double noStatePension = noState.countPensionPayment(15, 1000, 2900);

        System.out.println(statePension);
        System.out.println(noStatePension);
//
//        Pensioner pensioner = new Pensioner("Anton", 68, 180, 90);
//        pensioner.setPension(500);
//        pensioner.setAge(78);
//        pensioner.die();


//        Worker worker = new Worker("Oleg",45,190,91);
//        worker.setMinSalary(1000);
//        worker.setMaxSalary(2300);
//        double workersPension;
//
//        workersPension = worker.calculatePension();
//        System.out.println("Пенсия равна " + workersPension);


//        Worker worker = new Worker("Maksim", 23, 198, 89);
//        worker.setMonth(Month.MAY);
//        worker.setSex(Sex.MALE);

//        Worker worker = new Worker("Maksim", 23, 198, 89);
//        worker.setMinSalary(1500);
//        worker.setMaxSalary(2100);
//        worker.setMonth(Month.NOVEMBER);
//
//        System.out.println(Arrays.toString(Month.values()));
//
//        Month[] months = Month.values();
//        System.out.println(months[4]);
//
//        Month feb = Month.valueOf("FEBRUARY");
//        System.out.println(feb.getNumber());
//
//        worker.setNewSalary();
//
//        System.out.println(worker.getMinSalary());
//        System.out.println(worker.getMaxSalary());

//        System.out.println(Month.APRIL.getNumber());
//        System.out.println(Month.JANUARY.getNumber());
//        System.out.println(Month.DECEMBER.getNumber());
    }
}

//Заменить булеан переменную на enum в вашем классе пенсионный фонд.
//После этого чуть-чуть починить логику (переходим на switch-case). А при расчёте пенсии, если фонд = мошенники, то пенсия счичается равной 0.
//
//
//Кроме этого создать класс Company - компания, в которой пока что будет одно поле - имя компании. Заготовка на будущее