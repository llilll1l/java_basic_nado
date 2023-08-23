package chap_09.coffee;
import chap_09.user.User;

public class CoffeeByUser <T extends User>{ //user class를 상속하는 T를 써야 한다. User 클래스 또는 User 클래스를 상속하는 클래스 형태만 들어올수 있다.
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
