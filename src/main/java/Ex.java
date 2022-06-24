public class Ex {
    public static void main(String[] args) {

        Car benz = new Car("Sclass", 23, 140000);
        benz.decelerate();
        benz.accelerate();
        Car bmw = benz; // 여기에서 benz는 객체가 아니고 값이다. benz를 조종할 수 있는 리모컨처럼 됨.

        Car audi = new Car("Sclass", 23, 143300);
        bmw = audi;
        // 이렇게 될 경우, benz 객체는 힙에서 가비지 컬렉터에게 삭제 당한다.
        // 주기적으로 자바에서 힙 영역에서 필요없는 데이터를 삭제한다. (자동으로 해준다)

    }
}

class Car{
    // 명사
    private String carName;
    private int age;
    private int distanceDriven;

    public Car(String carName, int age, int distanceDriven) {
        this.carName = carName;
        this.age = age;
        this.distanceDriven = distanceDriven;
    }

    public void decelerate(){
        System.out.println("감속합니다");
    }
    public void accelerate(){
        System.out.println("가속합니다");
    }
}
