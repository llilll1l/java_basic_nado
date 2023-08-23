package chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resulution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resulution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        //새로운 블랙박스 신제품

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resulution = "UHD";
        b2.price = 300000;
        b2.color = "화이트";
    }
}
