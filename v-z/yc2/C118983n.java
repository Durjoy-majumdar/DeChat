package yc2;

import android.hardware.display.DisplayManager;
import android.view.Display;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yc2.n */
public class C118983n implements DisplayManager.DisplayListener {

    /* renamed from: d */
    public final /* synthetic */ C118982m f356412d;

    public C118983n(C118982m mVar) {
        this.f356412d = mVar;
    }

    public void onDisplayAdded(int i) {
        String str = "";
        try {
            Display display = this.f356412d.f356408e.getDisplay(i);
            if (display != null) {
                str = display.getName();
            }
            this.f356412d.f356407d.put(Integer.valueOf(i), new m$$b(i, str, System.currentTimeMillis() / 1000));
        } catch (Throwable th) {
            Log.m105924i("MicroMsg.SRD", th.toString());
        }
    }

    public void onDisplayChanged(int i) {
    }

    public void onDisplayRemoved(int i) {
        this.f356412d.f356407d.remove(Integer.valueOf(i));
    }
}
