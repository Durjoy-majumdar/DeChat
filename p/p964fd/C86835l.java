package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd.l */
public class C86835l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f252095d;

    /* renamed from: e */
    public final /* synthetic */ C86826e f252096e;

    public C86835l(C86826e eVar, int i) {
        this.f252096e = eVar;
        this.f252095d = i;
    }

    public void run() {
        C86826e eVar = this.f252096e;
        int i = this.f252095d;
        Log.m105925i(eVar.mo121291y(), "*** handler(%s) handleWebViewBackground, type:%d", eVar.mo122122p(), Integer.valueOf(i));
        eVar.f252011T = true;
        C86836m mVar = new C86836m(eVar, i);
        Log.m105924i(eVar.mo121291y(), "handleWebViewBackground, abandonFocus");
        eVar.f252018W0.mo115002L();
        mVar.run();
    }
}
