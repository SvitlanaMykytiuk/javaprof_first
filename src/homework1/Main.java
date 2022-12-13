package homework1;

public class Main {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Ivan";
        personOne.age = 25;
        personOne.height = 185;
        personOne.weight = 80;

        Person personTwo = new Person("Oleg", 30, 170, 65);

        Person personThree = new Person("Roman", 14, 165, 50);

personOne.money = 100;
personTwo.money = 200;

personOne.personInfo();
personOne.personAbilityToWork();
personOne.getMoney();
        System.out.println("----------------");
personTwo.personInfo();
personTwo.personAbilityToWork();
personTwo.getMoney();
        System.out.println("----------------");
personThree.personInfo();
personThree.personAbilityToWork();
personThree.getMoney();


    }
}
