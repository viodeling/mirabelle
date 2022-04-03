public class Test45 {
    public static void main(String[] args) {
        Person p=new Person("Coco", 20);
        p.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){}
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("NAME:"+getName()+"; AGE:"+getAge());
    }
}
