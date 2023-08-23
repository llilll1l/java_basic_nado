package chap_07;

public class BlackBox {
    //아래 4개의 값들을  인스턴스 변수, 필드 라고도 한다.
    String modelName;
    String resulution;
    int price;
    String color;
    int serialNumber; //시리얼 번호
    static int counter = 0; //시리얼 번호를 생성해주는 역할 (처음에 0이었다가 ++ 연산을 통해 증가)

    //class변수가 되는 static 변수
//class 변수는 모든 객체에 공통적으로 적용되는 클래스 변수이기 때문에 class명.AutoReport 로 접근
    static boolean canAutoReport = false; //자동 신고 기능


    // 생성자 만들기
    BlackBox () {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox (String modelName, String resulution, int Price, String color) {
//        this(); //기본 생성자인 BlackBox()를 수행
//
//        System.out.println("시용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resulution = resulution;
//        this.price = price;
//        this.color = color;
    }


    //자동신고 기능이 있는 메소드
    void autoReport(){
        if (canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type){
        if (type ==1){//일반영상
            return 9; //일반영상은 9개있다.

        }
        else if (type == 2){
            return 1;
        }
        return 10;
    }

    //showDateTime : 날짜정보 표시여부
    //showspeed: 영상 속도정보 표시여부
    //min :
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if (showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + " 분 단위로 표시됩니다.");
    }

    //메소드 오버로딩은 메우 빈번하다.
    void record() {
        record(true, true, 5);
    }

    //static 메소드는 모든 객체에 똑같이 적용됨
    static void callServiceCenter() {
        System.out.println("서비스센터(1588-0000)로 연결합니다.");
        //modelName = "test"; static 변수가 아니라 static 메소드에서 사용 불가
        //canAutoReport = fasle; //static으로 선언한 클래스 변수는 static Method에서 사용할 수 있다.
    }


    void appendModelName(String modelName) {
        //modelName += modelName; 전달받은 파라미터 값에 더하는 것 뿐
        this.modelName += modelName; //인스턴스 모델이름 + 전달받은 파라미터 모델이름
    }

    //Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResulution() {
        if (resulution == null || resulution.isEmpty()) {
            return "판매자에게 문의 하세요.";
        }
        return  resulution;
    }

    void setResulution(String resulution) {
        this.resulution = resulution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if ( price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color){
        this.color = color;
    }



}
