package chap_07;

import javax.swing.*;

public class _01_Class {
    public static void main(String[] args) {
        //객체 지향 프로그래밍 (OOp: Object-Oriented Programming)
        //유지보수 용이
        //높은 재사용성

        //차량용 블랙박스
        //우리가 만든 첫 번째 제품
        //모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        //새로운 제품을 개발
//        String modelName2 = "하양이";
//        String resolution2 = "UHD";
//        int price2 = 300000;
//        String color2 = "화이트";

        BlackBox bbox = new BlackBox();
        //bbox가 객체이름
        //BlackBox 클래스로부터 bbox 객체 생성
        //bbox 객체는 Black 클래스의 인스턴스
        //BlackBox는 설계도, bbox는 그것을 보고 만든 인스턴스, 객체

        BlackBox bbox2 = new BlackBox();



    }
}
