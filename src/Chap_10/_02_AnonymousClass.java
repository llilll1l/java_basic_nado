package Chap_10;


public class _02_AnonymousClass {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("--------------------------------");
        
        HomeMadeBurger bromadeBurger = getBroMadeBurger();
        bromadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨 패티, 양배추 샐러드, 딸기잼, 치즈 , 삶은 계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 삥, 소고기 패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }

}




abstract class HomeMadeBurger { //추상클래스는 재정의 해줘야 사용 가능
    public abstract void cook();
}