package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화( Data abstraction)  몰라도 되는 부분은 숨기고, 알아야 하는 부분만 보이기
        // 추상 클래스 (아직 완성되지 않은 클래스) -> 객체로 만들수 없다. 상속후 구체적 정의 필요
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)
        // 추상클래스에 추상 메소드가 있다면 자식 클래스에서 메소드 구현을 꼭 해 줘야함

        //Camera camera = new Camera(); 추상 클래스
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.souwMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.souwMainFeature();

    }
}
