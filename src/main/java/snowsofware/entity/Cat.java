package snowsofware.entity;

public class Cat {
    private String name;
    private int age;
    private int weight;

    // Конструктор с параметрами
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры (если Lombok не используется)
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getWeight() { return weight; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(int weight) { this.weight = weight; }
}
