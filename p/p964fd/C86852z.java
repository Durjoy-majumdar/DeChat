package p964fd;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import po0.C89421g;

/* renamed from: fd.z */
public class C86852z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252117d;

    /* renamed from: e */
    public final /* synthetic */ int f252118e;

    /* renamed from: f */
    public final /* synthetic */ C86826e f252119f;

    public C86852z(C86826e eVar, int i, int i2) {
        this.f252119f = eVar;
        this.f252117d = i;
        this.f252118e = i2;
    }

    public void run() {
        C86826e eVar = this.f252119f;
        int i = this.f252117d;
        int i2 = this.f252118e;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        int i3 = 0;
        Log.m105925i(eVar.mo121291y(), "onVideoSizeChanged, width:%d, height:%d", Integer.valueOf(i), Integer.valueOf(i2));
        eVar.mo121283q(false);
        C87760d dVar = eVar.f252033h;
        if (dVar != null) {
            i3 = dVar.getDuration();
        }
        if (!(!eVar.f251990A || eVar.f252033h == null || (i == eVar.f251999J && i2 == eVar.f252000K && i3 == eVar.f252001L))) {
            if (eVar.mo121279N()) {
                ((C89421g) eVar.f252035i).mo123744e(i, i2, i3);
            }
            eVar.mo121272G();
            C86815a aVar = eVar.f252016V0;
            if (aVar != null) {
                aVar.mo121260c(new Size(i, i2));
            }
        }
        eVar.f251999J = i;
        eVar.f252000K = i2;
        eVar.f252001L = i3;
    }
}
