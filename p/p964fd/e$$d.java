package p964fd;

import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82724i0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: fd.e$$d */
public class e$$d implements C82724i0.C29521a {

    /* renamed from: a */
    public final /* synthetic */ C86826e f252063a;

    public e$$d(C86826e eVar) {
        this.f252063a = eVar;
    }

    public void onPause() {
        Log.m105924i(this.f252063a.mo121291y(), "onPause");
        C86826e eVar = this.f252063a;
        eVar.getClass();
        eVar.mo121276K(new e$$b(eVar, true));
    }

    public void onResume() {
        Log.m105924i(this.f252063a.mo121291y(), "onResume");
        C86826e eVar = this.f252063a;
        eVar.getClass();
        eVar.mo121276K(new C86840q(eVar));
    }

    public void onStop() {
        Log.m105924i(this.f252063a.mo121291y(), "onStop");
        C86826e eVar = this.f252063a;
        eVar.getClass();
        eVar.mo121276K(new e$$c(eVar));
    }
}
