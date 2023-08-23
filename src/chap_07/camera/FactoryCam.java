package chap_07.camera;

public class FactoryCam extends Camera {


    public FactoryCam() {
        //this.name = "공장 카메라";
        super(); //부모클래스의 생성자에 바로 접근
    }
    public void recordVideo() { //자식클래스에서 부모 메소드 오버라이딩 하긴 했지만 부모내용 그대로 쓰면서 추가적 기능 사용 가능
        super.recordVideo();
        detectFire();
    }
    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    public  void showMainReature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
