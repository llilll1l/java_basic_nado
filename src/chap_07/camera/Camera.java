package chap_07.camera;

public class Camera {
    public String name;

    public Camera() {
        this("카메라");
    }

    protected Camera(String name) { //protected : 같은 패키지에서는 접근 제한 X, 다른 패키지에서는 자식 클래스만 접근 허용.
        this.name = name;
    }

    public void takePicture() {
        //사진 촬영
        System.out.println(this.name + " 사진을 촬영합니다.");
    }

    public void recordVideo() {
        //동영상 녹화
        System.out.println(this.name + " 동영상을 녹화합니다.");
    }

    public  void showMainReature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }

}
