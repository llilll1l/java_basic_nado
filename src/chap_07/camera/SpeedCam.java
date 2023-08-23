package chap_07.camera;

public class SpeedCam extends Camera{


    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }
    public void takePicture() {
        //사진 촬영
        super.takePicture();
        checkSpeed();
        recognizedLicensePlate();
    }

    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");
    }

    public  void recognizedLicensePlate() {
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation , 부모클래스에 override 할수 있는 요소가 있을 때 사용 가능.
    public void showMainReature() {
        System.out.println(this.name + " 의 주요 기능 : 속도 측정, 번호 인식");
    }
}
