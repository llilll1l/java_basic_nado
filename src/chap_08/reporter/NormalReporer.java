package chap_08.reporter;

public class NormalReporer implements Reportable{
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    } //인터페이스를 정의implements 해라
}
