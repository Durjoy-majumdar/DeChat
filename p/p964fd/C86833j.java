package p964fd;

import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: fd.j */
public class C86833j implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C86826e f252093a;

    public C86833j(C86826e eVar) {
        this.f252093a = eVar;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        String y = this.f252093a.mo121291y();
        Log.m105924i(y, "onBackground, type: " + i);
        C86826e eVar = this.f252093a;
        eVar.getClass();
        eVar.mo121276K(new C86835l(eVar, i));
    }

    /* renamed from: c */
    public void mo18010c() {
        Log.m105924i(this.f252093a.mo121291y(), "onForeground");
        C86826e eVar = this.f252093a;
        eVar.getClass();
        eVar.mo121276K(new C86834k(eVar));
    }

    public void onDestroy() {
        C86826e eVar = this.f252093a;
        eVar.getClass();
        eVar.mo121276K(new C86837n(eVar));
    }
}
