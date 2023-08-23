package chap_07.camera;

public final class ActionCam extends Camera { // class에 final을 붙여버리면 이제 다른 클래스는 ActionCam 상속 불가능
    public final String lens = "광각렌즈"; //final 어디에서도 값 변경 불가, 선언만 하고 생성자내에서 값을 줄수도 있다. 객체가 생성되는 시점이기 때문 가능
    public ActionCam() {
        super("액션 카메라");
    }
    public final void makeVideo() { //final : 자식클래스에서 overriding 불가능
        System.out.println(this.name + " : " + this.lens  +  "로 촬영한 영상을 통해  멋진 비디오를 제작합니다." );
    }
}
