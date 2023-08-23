package chap_09.coffee;

public class CoffeeByName {
    public Object name; //오브젝트형 이기 때문에 Integer, Double, String, BlackBox 등 뭐든 받을 수 있다.

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
