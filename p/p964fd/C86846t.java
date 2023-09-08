package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import p1066yc.C91423s;

/* renamed from: fd.t */
public class C86846t implements C91423s {

    /* renamed from: a */
    public final /* synthetic */ C86826e f252108a;

    public C86846t(C86826e eVar) {
        this.f252108a = eVar;
    }

    public void pause() {
        Log.m105924i(this.f252108a.mo121291y(), "pause");
        C86826e eVar = this.f252108a;
        eVar.getClass();
        eVar.mo121276K(new e$$b(eVar, false));
    }

    public void start() {
        Log.m105924i(this.f252108a.mo121291y(), IXWebBroadcastListener.STAGE_START);
        C86826e eVar = this.f252108a;
        eVar.getClass();
        eVar.mo121276K(new C86840q(eVar));
    }
}
