package uj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import tj0.C90503a;

/* renamed from: uj0.b */
public class C90666b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90668d f260484d;

    public C90666b(C90668d dVar) {
        this.f260484d = dVar;
    }

    public void run() {
        C90503a aVar = new C90503a();
        C81925i2 b0 = this.f260484d.f260489b.get().mo113047b0();
        String str = this.f260484d.f260488a.f182637e;
        Log.m105925i("MicroMsg.OnCanvasReportEventSampleConfigReceivedEvent", "hy: sending config; %s", str);
        aVar.mo115194p(b0);
        HashMap hashMap = new HashMap(1);
        hashMap.put("keyEventSampleConfig", str);
        aVar.mo115165o(hashMap);
        aVar.mo115158h();
    }
}
