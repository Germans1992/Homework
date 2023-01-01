public class Person {
    String name;
    int age;
    int height;
    int weight;
int size;
int quantity;
int price;


    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(int a, int w, String n, int h){
        {
            this.age = a;
            this.weight = w;
            this.name = n;
            this.height = h;
        }
    }
    public Person(int size, int quantity, int price){
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }
    //Попробовал такой вариант(при покупке больше 10 пар обуви цена уменьшается на 10 процентов);
    public void order(){
        if(quantity > 10){
            System.out.println("You ordered more than 10 pieces your price is " + (price - (price * 10 / 100)) + "$");
        }else{
            System.out.println("You ordered 10 or less then 10 pieces, your price is " + price + "$");
        }
    }
//Домашнее задание номер 1;
    public void infoAbout(){
        System.out.println("Name: " + name + " Age: " + age + " Height: " + height + " Weight: " + weight);
    }
    public void go(){
        if(age < 18 || age > 70){
            System.out.println("I can't work i need to have a rest");
        }else{
            System.out.println("I need to work");
        }
    }

    //При написании Private — доступ открыт только самому классу и друзьям данного класса.

}
