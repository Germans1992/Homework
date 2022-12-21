public class Main {
    public static void main(String[] args){
Person person = new Person(17, 90,"German", 192);
Person secondPerson = new Person("German",30,181,90);
        System.out.println(person);
        System.out.println(secondPerson);
        System.out.println("--------------");

        Person vladimir = new Person(38,10,100);
        System.out.println(vladimir);
        person.go();
        vladimir.order();

    }
}