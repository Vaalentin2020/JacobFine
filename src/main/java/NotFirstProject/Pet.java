package NotFirstProject;

public class Pet {
    int age;
    float height;
    float weight;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи, до завтра!");
    }
    public void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами!");
    }
    public String say(String aWord){
        String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }
}
