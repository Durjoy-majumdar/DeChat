package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: ad.j */
public class C79510j implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233147a;

    public C79510j(C79502b bVar) {
        this.f233147a = bVar;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        String v = this.f233147a.mo109516v();
        Log.m105924i(v, "onBackground, type: " + i);
        C79502b bVar = this.f233147a;
        bVar.getClass();
        bVar.mo109503D(new b$$m(bVar, i));
    }

    /* renamed from: c */
    public void mo18010c() {
        Log.m105924i(this.f233147a.mo109516v(), "onForeground");
        C79502b bVar = this.f233147a;
        bVar.getClass();
        bVar.mo109503D(new b$$b(bVar));
    }

    public void onDestroy() {
        C79502b bVar = this.f233147a;
        bVar.getClass();
        bVar.mo109503D(new b$$c(bVar));
    }
}
