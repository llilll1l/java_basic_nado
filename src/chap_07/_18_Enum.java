package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형(Enum) 특수한 형태의 클래스.. 상수들의 묶음이라고 생각해라
        //달력 : JAN , FEB, MAR ...
        //옷 사이즈 : S, M, L, XL ...
        //OS 종류 : win10, win11,  MACOS, LINUX

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 논화 품질 : ");
        switch (resolution) {
            case HD :
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초 고화질");
                break;

        }

        resolution = Resolution.valueOf("UHD"); //vlaueof 가 문자열로부터 값을 가져와서 Resolution(열거형)으로 값을 바꿔줌
        System.out.println(resolution);

        System.out.println("----------------------------------------");

        for (Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("----------------------------------------");
        for (Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }

    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
}
