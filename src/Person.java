public abstract class Person {
  private  String name;
   private int age;
   private int height;
   private int weight;

   private Person mom;

   private Person dad;

   private Person[] children;

   private Sex sex;

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract void die();

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
