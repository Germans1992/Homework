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

        Pensioner pensioner = new Pensioner("Anton",68,180,90);
        pensioner.setPension(500);
        pensioner.die();
//        person.getName();



//        First level: У вас есть класс Person.
//
//
//        1) Сделать его правильным - создать геттеры
//        и сеттеры, проверить, что он соответствует
//        тем правилам, которые мы с вами обсуждали.
//
//
//        2) Создать классы Pensioner и Worker
//        Унаследовать их от класса Person.
//        В класс Pensioner добавить дробное поле pension,
//        в класс Worker добавить два поля minSalary и maxSalary.
//
//
//        3) Класс Person превращаем в абстрактный.
//        В него добавляем абстрактный метод die(),
//        которая ничего не возвращает.
//
//
//        4) В Worker реализуем этот метод таким образом:
//        пишем на экран сообщение "Этот человек не дожил
//        до пенсии"
//
//
//        5) В классе Pensioner реализуем так:
//        пишем на экран "Этот пенсионер умер,
//        он заработал: x". Где вместо x нужно рассчитать
//        значение по формуле "(age-50)*pension"
//
//
//        Second level:

    }
}

