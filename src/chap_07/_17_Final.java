package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final 선언하면 값을 변경 불가
        //  순서
        //public (final) class ...
        //public (final) void ...


        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        //slowActionCam.recordVideo();
        //slowActionCam.makeVideo();



    }
}
