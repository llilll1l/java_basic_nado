package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    //상속 : 부모클래스의 모든것을 자식클래스에서 가져다 씀
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        //자식클래스에서는 name 변수를 선언하지 않았지만 부모클래스의 name변수를 사용할수 있다.
        //마찬가지로 takepicture() 와 recordVideo()도 부모 클래스인 Camera에서만 선언해주었다.
        //상속을 하면 부모 클래스의 기본적인 기능을 사용할수있다.
        //하나의 부모 클래스부터 로만 상속을 받을 수 있다.
        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizedLicensePlate();
    }

}
