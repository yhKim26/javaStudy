package java8;

public class javaGameCharacter {
    public static void main(String[] args) {

        GameCharacter ch1 = new GameCharacter();
        ch1.name = "강감찬";
        ch1.job = "전사";
        ch1.level = 3;

        GameCharacter ch2 = new GameCharacter();
        ch2.name = "그런거지";
        ch2.job = "궁수";
        ch2.level = 78;

        ch1.levelUp();
        ch1.levelUp();
        ch1.levelUp();
        ch1.levelUp();
        ch2.levelUp();
    }
}

class GameCharacter {
    String name;
    String job;
    int level;

    void levelUp() {
        level++;
        System.out.println("[" + job + "]" + name + "님" + level + "렙 되셨습니다!");
    }
}