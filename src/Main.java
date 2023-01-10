public class Main {

    public static void main(String[] args) {
//        Person person = new Person("Vladimir",33,182,97);
//        Person secondPerson = new Person("German", 30,180,92);
//        person.infoAbout();
//        System.out.println(person);
//        person.go();
//        System.out.println(person);

        PensionFund state = new PensionFund("Texas",true,"16.08.1992");
        PensionFund noState = new PensionFund("Dallas", false,"12.01.2003");

        double statePension = state.countPensionPayment(15,1000,2900);
        double noStatePension = noState.countPensionPayment(15,1000,2900);

        System.out.println(statePension);
        System.out.println(noStatePension);

//        Pensioner pensioner = new Pensioner("Anton",68,180,90);
//        pensioner.setPension(500);
//        pensioner.die();


        Worker worker = new Worker("Oleg",74,190,91);
        worker.setMinSalary(500);
        worker.setMaxSalary(1000);
        double workersPension;

        workersPension = worker.calculatePension();
        System.out.println("Пенсия равна " + workersPension);




    }
}

//First level: 1) Создать интерфейс AbleToCalculatePension с
// одним методом calculatePension, возвращающим дробное число
//
//
//2) класс Worker должен реализовать этот интерфейс (implements).
// реализация метода выглядит так:
//
//
//а) Внутри метода создается объект класса Пенсионный фонд
// (из дз от 14 декабря). В нем вызывается метод расчета пенсии,
// в него передаются параметры: возраст, минимальная,
// максимальная зарплаты. Результат этого метода возвращается
// из метода calculatePension
//
//
//Second level: