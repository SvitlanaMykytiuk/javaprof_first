package homework1;

public class Person {
String name;
int age;
int height;
int weight;
int money; // при добавлении типа private у класса Main пропадает доступ к этой переменной


public Person (String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
}

public Person (){
    }

public void personInfo () {
        System.out.println("Имя: " + name + ", возраст: " + age + ", рост: " + height + ", вес: " + weight);
    }
public void personAbilityToWork () {
    if (age <= 18 || age >= 70) {
        System.out.println("Отдыхаю дома");
    } else {
        System.out.println("Работаю");
    }
}
public void getMoney () {
    System.out.println(name + " имеет " + money + " долларов");;
}
}
