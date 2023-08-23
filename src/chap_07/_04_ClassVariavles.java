package chap_07;

public class _04_ClassVariavles {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";

        //특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" ---개발 전---");
        System.out.println(b1.modelName + "자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b1.modelName + "자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : false : " + BlackBox.canAutoReport);

        //기능 개발
        BlackBox.canAutoReport = true;

        //클래스 변수는 b1,b2객체에 공통적으로 접근 가능.
        System.out.println(" ---개발 후---");
        System.out.println(b1.modelName + "자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b1.modelName + "자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : false : " + BlackBox.canAutoReport);


    }
}
