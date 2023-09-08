package p156gj;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import p149ej.C107276c;

/* renamed from: gj.k */
public class C107839k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f322860d;

    public C107839k(C107840l lVar, int i) {
        this.f322860d = i;
    }

    public void run() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f322860d, cameraInfo);
            C107276c.f320945a.mo157754g(this.f322860d, cameraInfo);
        } catch (Throwable th) {
            Log.m105920e("CameraUtilImplConfig", "CameraUtilImplConfig update CameraInfo Cache failed : " + th.getMessage());
        }
    }
}
