package p156gj;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import p149ej.C107276c;

/* renamed from: gj.g */
public class C107832g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f322841d;

    public C107832g(C107834h hVar, int i) {
        this.f322841d = i;
    }

    public void run() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f322841d, cameraInfo);
            C107276c.f320945a.mo157754g(this.f322841d, cameraInfo);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.CameraUtil.CameraUtilImpl22", "CameraUtilImpl22 update cache failed : " + th.getMessage());
        }
    }
}
