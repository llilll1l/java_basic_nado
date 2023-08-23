package chap_07.camera;

public class SlowActionCam { // extends ActionCam이 안됨.. ActionCam 클래스가 바로 final을 선언해 버렸기 때문
    public SlowActionCam(){
        //this.name = "솔로우 액션 카메라";
    }

//    public void makeVideo() { ActionCam에의 makeVideo() 에서 final 이라고 해줬지 때문에 오버라이딩 불가
//        System.out.println(this.name + " : " + this.lens
//                +  "로 촬영한 영상을 통해  멋진 슬로우모드 비디오를 제작합니다." );
//    }
}
