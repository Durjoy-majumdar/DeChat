package ca3;

import com.tencent.p014mm.sdk.platformtools.Log;
import p975hd.C87478c;

/* renamed from: ca3.t */
public final class C16914t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16886m f45733d;

    /* renamed from: e */
    public final /* synthetic */ int f45734e;

    /* renamed from: f */
    public final /* synthetic */ int f45735f;

    public C16914t(C16886m mVar, int i, int i2) {
        this.f45733d = mVar;
        this.f45734e = i;
        this.f45735f = i2;
    }

    public final void run() {
        C16886m mVar = this.f45733d;
        int i = this.f45734e;
        int i2 = this.f45735f;
        if (!mVar.f45656I) {
            Log.m105924i(mVar.mo17980x(), "onMediaPlayerError, mp released");
            return;
        }
        Log.m105925i(mVar.mo17980x(), "onError, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
        C87478c cVar = mVar.f45673V;
        if (cVar != null) {
            ((C79968g) cVar).mo110145b(i, i2);
        }
    }
}
