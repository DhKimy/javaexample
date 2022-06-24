import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sClass sclassDiesel = new sClass("Diesel");
        sClass sclassGasoline = new sClass("galsoline");
        // Sclass 형식의 sclassDiesel의 변수 박스에 Sclass의 인스턴스를 생성하여 담는다.
        // 만약 맨 왼쪽에 int를 쓴다면, sclassDiesel은 int 형태와 호환되지않는(상속도 받지 않았고, 같은 형태도 아니다) 타입이기 때문에
        // 실행시 오류가 난다.

        sclassDiesel.start();
        System.out.println(sclassDiesel.getShape());
        System.out.println(sclassDiesel.getTire());
        System.out.println(sclassGasoline.getEngine());
    }
}

class benz{
    static String shape = "Metal Aluminum";
    public benz(){
        String tire = "15인치";
        int maxSpeed = 200;
        String engine = "fossil Fuels";
    }


    public void start(){
        System.out.println("부릉");
    }
}

class sClass extends benz{
    private String tire, engine;
    private int maxSpeed;
    public sClass(String engine) {
        this.tire = "19인치";
        this.maxSpeed = 300;
        this.engine = engine;
    }


    public String getEngine() {
        return engine;
    }

    public String getShape() {
        return shape;
    }
    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start(){
        System.out.println("부르릉");
    }

}