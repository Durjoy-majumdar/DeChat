package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import p975hd.C87478c;

/* renamed from: fd.h */
public class C86831h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252087d;

    /* renamed from: e */
    public final /* synthetic */ int f252088e;

    /* renamed from: f */
    public final /* synthetic */ C86826e f252089f;

    public C86831h(C86826e eVar, int i, int i2) {
        this.f252089f = eVar;
        this.f252087d = i;
        this.f252088e = i2;
    }

    public void run() {
        C86826e eVar = this.f252089f;
        int i = this.f252087d;
        int i2 = this.f252088e;
        if (!eVar.f251992C) {
            Log.m105924i(eVar.mo121291y(), "onMediaPlayerError, mp released");
            return;
        }
        Log.m105925i(eVar.mo121291y(), "onError, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        C87478c cVar = eVar.f252042n;
        if (cVar != null) {
            cVar.mo110145b(i, i2);
        }
    }
}
