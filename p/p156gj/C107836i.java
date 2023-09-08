package p156gj;

import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import p149ej.C107276c;

/* renamed from: gj.i */
public class C107836i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f322858d;

    public C107836i(C107837j jVar, int i) {
        this.f322858d = i;
    }

    public void run() {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f322858d, cameraInfo);
            C107276c.f320945a.mo157754g(this.f322858d, cameraInfo);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.CameraUtil", "CameraUtilImpl23 update CameraInfo Cache failed : " + th.getMessage());
        }
    }
}
