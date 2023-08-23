package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingNumber;   //alt + insert 로 constructor생성자 생성 가능

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }

}
