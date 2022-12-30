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

//First level: Создайте отдельный проект для наших домашек, перенесите туда первую домашку. В этом же проекте:
//
//
//1) Добавьте класс-утилиту для нахождения среднего значения
//а) метод, в который как параметры приходят 2 числа и возвращает среднее значение
//б) метод, в который приходит 3 числа и он возвращает среднее значение
//
//
//2) Создайте класс пенсионный фонд, в нем создайте такие поля:
//
//
//а) КОНСТАНТА коэффициент пенсии = 0.02
//б) Именование пенсионного фонда
//в) булеан переменная, является ли он государственным
//г) Дата создания (изменить нельзя)
//
//
//3) Добавьте в класс пенсионного фонда конструктор
//
//
//4) Добавьте метод расчета пенсии, который принимает параметры: сколько лет отработал человек,
// сколько зарабатывал минимально, сколько зарабатывал максимально. Ответ ВОЗВРАЩАЕТСЯ в виде числа с помощью return
//
//
//Этот метод должен быть реализован так:
//
//
//а) Если фонд государственный, тогда метод вызывает класс-утилиту и находит среднее значение между
// максимальной и минимальной зп. Потом это значение умножает на коэффициент пенсии и на количество лет
//
//
//б) Если фонд НЕ государственный, тогда метод вызывает класс-утилиту и находит
// среднее значение между максимальной, минимальной зп и средним значение пенсии в стране - 1500.
// Потом это значение умножает на коэффициент пенсии и на количество лет.
//
//
//Second level:

