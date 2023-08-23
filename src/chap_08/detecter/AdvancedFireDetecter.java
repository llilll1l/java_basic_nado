package chap_08.detecter;

import javax.swing.*;

public class AdvancedFireDetecter implements Detectable {
    @Override
    public void detect() {
        System.out.println("향상된 성능으로 화재를 감지합니다.");
    }
}
