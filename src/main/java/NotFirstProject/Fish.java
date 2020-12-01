package NotFirstProject;

public class Fish extends Pet{
    int currentDepth = 0;
    public int dive(int howDeep){
        currentDepth += howDeep;
        System.out.println("Ныряю на глубину "+ howDeep + " футов!");
        System.out.println("Я на глубине " + currentDepth + "футов ниже уровня моря");
        return currentDepth;
    }
    public String say(String something){
        System.out.println("Ты что, не знаешь, что рыбы не разговаривают?!");
    }
}

