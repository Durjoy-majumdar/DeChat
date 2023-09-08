package p212oe;

import android.content.Context;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import java.util.HashMap;
import p737wf.b$$a;
import p933be.C113173i;

/* renamed from: oe.v$$c */
public final /* synthetic */ class v$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89205v f352289d;

    /* renamed from: e */
    public final /* synthetic */ String f352290e;

    public /* synthetic */ v$$c(C89205v vVar, String str) {
        this.f352289d = vVar;
        this.f352290e = str;
    }

    public final void run() {
        C89205v vVar = this.f352289d;
        String str = this.f352290e;
        vVar.getClass();
        C113173i e = C117750b.m166047e();
        C114467i iVar = e == null ? null : new C117780w(e.f338613h, "module", str).f352286a;
        if (iVar != null) {
            iVar.mo173679v();
            ((HashMap) vVar.f257039b).put(str, iVar);
            if (str.equals("Finder") || str.equals("FinderLive")) {
                Context a = vVar.f349668a.mo165879a();
                C113173i e2 = C117750b.m166047e();
                if (e2 != null) {
                    e2.f338613h.f339059f.post(new b$$a(a, 3000));
                }
            }
        }
    }
}
