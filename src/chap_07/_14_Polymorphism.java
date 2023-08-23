package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //Factory is a Camera 맞다.
        //SpeedCam is a Camera  맞다
        //
        //Class Person : 사람
        //Class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        //Class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
        //역은 성립하지 않는다. 이것은 상속의 개념



        //다형성에 대해 알아 보자....
        //부모클래스는 부모클래스를 상속하는 자식 클래스 개체를 만들수있다.
        //Camera 부모 클래스로 서로 다른 객체(팩토리 캠, 스피트 캠)를 만들수 있다
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainReature();
        factoryCam.showMainReature();
        speedCam.showMainReature();

        //카메라 라는 이름으로 배열을 만들었고 서로 다른 형태의 객체를 집어넣음으로서 반복문으로 위에서 한 동작 똑같이 할 수있다.
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainReature();
        }

        System.out.println("---------------------------");

        //factorycam에는 detectfire()가 있었지만 접근 불가...
        //speedcam에만 있는 메소드에도 접근 불가

        if (camera instanceof Camera) { //camera가 Camera 클래스의 인스턴스인지 여부 확인
            System.out.println("카메라 입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            //FactoryCam클래스로 형 변환하여 사용
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof  SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizedLicensePlate();
        }

        // Java 에는 java.lang.Object가 있다. 우리가 사용하는 모든 클래스의 최초 인류정도에 해당하는 조상이라고 생각하면 됨
        //모든 클래스는 오브젝트라는 클래스를 상속하고있고 오브젝트 배열을 사용하면 어떤 형태이건 모든 클래스 객체를 집어넣을수 있어서 한꺼번에 관리 가능하다
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
