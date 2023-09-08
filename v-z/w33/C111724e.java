package w33;

import c20.C104278a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: w33.e */
public final class C111724e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111721d f334481d;

    public C111724e(C111721d dVar) {
        this.f334481d = dVar;
    }

    public final void run() {
        if (Util.milliSecondsToNow(this.f334481d.f334470r) > 300000) {
            C111721d dVar = this.f334481d;
            if (!dVar.f334469q) {
                dVar.f334452L = new C104278a();
            }
        }
        C111721d dVar2 = this.f334481d;
        C104278a aVar = dVar2.f334452L;
        if (aVar != null) {
            dVar2.f334469q = true;
            long j = 0;
            dVar2.f334466n = aVar.mo145940b() > 0 ? ((long) aVar.mo145940b()) - dVar2.f334466n : 0;
            dVar2.f334467o = aVar.mo145939a() > 0 ? ((long) aVar.mo145939a()) - dVar2.f334467o : 0;
            if (aVar.mo145941c() > 0) {
                j = ((long) aVar.mo145941c()) - dVar2.f334468p;
            }
            dVar2.f334468p = j;
            Log.m105924i("MicroMsg.VoIPProfileReport", "current profile latest gpu info  is gl:" + dVar2.f334466n + " egl:" + dVar2.f334467o + " gfx:" + dVar2.f334468p);
        }
        this.f334481d.f334452L = null;
    }
}
