package java8;

public class javaStudy {
    public static void main(String[] args) {
        FishBread bread1 = new FishBread();
        bread1.flavor = "단팥";
        bread1.price = 2000;

        FishBread bread2 = new FishBread();
        bread2.flavor = "슈크림";
        bread2.price = 3000;

        bread1.describe();
        bread2.describe();
    }
}

class FishBread {
    String flavor; // 속재료
    int price; // 가격

    void describe() {
        System.out.println(flavor + "붕어빵이고 가격은 " + price + "원입니다.");

    }

}
