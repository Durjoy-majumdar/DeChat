package xm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C52238za0;

/* renamed from: xm2.a */
public class C23105a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23108c f66389d;

    public C23105a(C23108c cVar) {
        this.f66389d = cVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        this.f66389d.f66399n.set(true);
        this.f66389d.mo36514a();
        C23108c cVar = this.f66389d;
        C23109g gVar = cVar.f66392d;
        if (gVar != null) {
            gVar.mo24594a(cVar.f66393e, false, (C52238za0) null);
        }
    }
}
