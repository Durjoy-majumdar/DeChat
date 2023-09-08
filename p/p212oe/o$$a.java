package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p933be.C113173i;

/* renamed from: oe.o$$a */
public final /* synthetic */ class o$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117772o f352214d;

    /* renamed from: e */
    public final /* synthetic */ C113173i f352215e;

    public /* synthetic */ o$$a(C117772o oVar, C113173i iVar) {
        this.f352214d = oVar;
        this.f352215e = iVar;
    }

    public final void run() {
        C117772o oVar = this.f352214d;
        C113173i iVar = this.f352215e;
        oVar.getClass();
        Log.m105924i("MicroMsg.DataSamplingMonitor", "start, name = DozeOn");
        C113173i e = C117750b.m166047e();
        C114467i iVar2 = e == null ? null : new C117773p(e.f338613h, "dataSampling", "DozeOn").f352286a;
        if (iVar2 != null) {
            iVar2.mo173679v();
            iVar.f338613h.f339059f.postDelayed(new o$$b(iVar2), 12000);
        }
    }
}
