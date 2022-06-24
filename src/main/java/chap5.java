public class chap5 {
    public static void main(String[] args) {
        Car1 a1 = new Car1(1, 230);

        Car1 a2 = new Car1(2, 210);
        a1.run();
        a2.run();
        Car1 a3 = new Car1();
        a3.run();
    }
}

class Car1{
    int carname;
    int maxspeed;

    public Car1(){
    }
    public Car1(int carname, int maxspeed) {
        this.carname = carname;
        this.maxspeed = maxspeed;
    }
    void run(){
        System.out.println(carname + "번 자동차가 최고속력 "+ maxspeed +"로 달립니다.");
    }
}