package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import p830xc.C91165a;

/* renamed from: cd.x */
public class C80014x implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C80005q f234409a;

    public C80014x(C80005q qVar) {
        this.f234409a = qVar;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        String w = this.f234409a.mo110227w();
        Log.m105924i(w, "onBackground, type: " + i);
        C80005q qVar = this.f234409a;
        qVar.getClass();
        qVar.mo110217G(new q$$n(qVar, i));
    }

    /* renamed from: c */
    public void mo18010c() {
        Log.m105924i(this.f234409a.mo110227w(), "onForeground");
        C80005q qVar = this.f234409a;
        qVar.getClass();
        qVar.mo110217G(new q$$d(qVar));
    }

    public void onDestroy() {
        C80005q qVar = this.f234409a;
        qVar.getClass();
        qVar.mo110217G(new q$$b(qVar));
    }
}
