package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p933be.C113173i;

/* renamed from: oe.m$$b */
public final /* synthetic */ class m$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117770m f352211d;

    public /* synthetic */ m$$b(C117770m mVar) {
        this.f352211d = mVar;
    }

    public final void run() {
        C117770m mVar = this.f352211d;
        mVar.getClass();
        Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "start, name = " + mVar.f352207a);
        String str = mVar.f352207a;
        C113173i e = C117750b.m166047e();
        C114467i iVar = e == null ? null : new C117771n(e.f338613h, "biz", str).f352286a;
        mVar.f352209c = iVar;
        if (iVar != null) {
            iVar.mo173679v();
        }
    }
}
