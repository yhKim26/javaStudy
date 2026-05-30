package java8;

public class javaSmartPhone {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone();
        ph1.model = "아이폰";
        ph1.batteryLevel = 80;

        SmartPhone ph2 = new SmartPhone();
        ph2.model = "갤럭시";
        ph2.batteryLevel = 75;

        ph1.call();
        ph2.call();
    }
}

class SmartPhone {
    String model;
    int batteryLevel;

    void call() {
        System.out.println(model + "로 전화를 겁니다 남은 배터리 : " + batteryLevel + "%");
    }
}