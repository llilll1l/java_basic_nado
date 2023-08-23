package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    //참조 -> 가리키는 대상이 바뀌는 것. 기본자료형의 복사와 다르다.

    public static void main(String[] args) {
       //기본자료형 (Primitive Data Types) : int, float, bouble, long, boolean, ,,,,
        int[] i = new int[3];
        System.out.println(i[0]); // 0


        double[] d  = new double[3];
        System.out.println(d[0]); // 0.0

        //참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam,
        String[] s = new String[3];
        System.out.println(s[0]); //null 참조자료형은 아무값도 넣지 않으면 null 이다.

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); //true
        //참조 자료형은 대문자로 시작, 그리고 메소드가 있다면 사용할 수 있다.
        System.out.println("-----------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; // c1이 잡고있는 new Camera()를 c2도 잡게됨... 즉 c1이 참조하고 있는 것을 c2도 참조함
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 코장난 카메라 - c2만 바꿨는데 c1 까지 바뀐이유는...?
        System.out.println(c2.name); // 고장난 카메라
        changeName(c2);
        System.out.println(c1.name); // "잘못된 카메라"
        System.out.println(c2.name); // "잘못된 카메라"

        //참조를 끊고싶다면 !!
        c2 = null;
        //System.out.println(c2.name); null pointer exception.

    }

    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }

}
