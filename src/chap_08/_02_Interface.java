package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detecter.AdvancedFireDetecter;
import chap_08.detecter.Detectable;
import chap_08.detecter.FireDetecter;
import chap_08.reporter.NormalReporer;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        //추상 클래스가 완성되지 않은거라면 인터페이스 클래스는 기능만 명시
        //단일상속 문제를 해결

        Reportable normalReporer = new NormalReporer(); //Reportable normalReporter와 같다.
        normalReporer.report();

        Reportable videoReporter = new VideoReporter(); // Reportable normalReporter와 같다.
        videoReporter.report();

        Detectable fireDecter = new FireDetecter();
        fireDecter.detect();

        Detectable advancedFireDetecter = new AdvancedFireDetecter();
        advancedFireDetecter.detect();

        System.out.println("------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetecter(advancedFireDetecter);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();


    }
}
