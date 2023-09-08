package gl0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.xeffect.FaceTracker;
import gl0.C107850a;
import java.util.HashMap;

/* renamed from: gl0.f */
public class C107858f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107850a f322979d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f322980e;

    /* renamed from: f */
    public final /* synthetic */ int f322981f;

    /* renamed from: g */
    public final /* synthetic */ C87269g f322982g;

    public C107858f(C87269g gVar, C107850a aVar, C81925i2 i2Var, int i) {
        this.f322982g = gVar;
        this.f322979d = aVar;
        this.f322980e = i2Var;
        this.f322981f = i;
    }

    public void run() {
        C107850a.C107853c cVar;
        C107850a.C107853c cVar2 = C107850a.C107853c.ResultOK;
        C107850a.C107853c cVar3 = C107850a.C107853c.ResultStopFail;
        this.f322979d.f322944c.clear();
        FaceTracker faceTracker = C107850a.f322941d.f322942a;
        if (faceTracker != null) {
            faceTracker.mo154899a();
            C107850a.f322941d.f322942a = null;
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a = this.f322979d.mo158270a(cVar);
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", Integer.valueOf(a));
        this.f322980e.mo109647a(this.f322981f, this.f322982g.mo115112m(cVar == cVar2 ? "ok:stop ok" : cVar == cVar3 ? "fail:stop fail" : "fail:undefine error", hashMap));
    }
}
