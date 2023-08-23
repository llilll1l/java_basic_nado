package chap_08.Camera;

import chap_08.detecter.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detecter;
    private Reportable reporter;

    //추상 클래스인 카메라 클래스에서 추상 메소드로 정의만 한 showMainFeature() 를 구현해줌
    @Override
    public void souwMainFeature() {
        System.out.println("화재 감지");
    }


    public void setDetecter(Detectable detecter) {
        this.detecter = detecter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void detect() {
        detecter.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
