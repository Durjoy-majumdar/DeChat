package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cj1.c4 */
public final class C54743c4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<Integer> f153451d;

    /* renamed from: e */
    public final /* synthetic */ C54847z3 f153452e;

    public C54743c4(List<Integer> list, C54847z3 z3Var) {
        this.f153451d = list;
        this.f153452e = z3Var;
    }

    public final void run() {
        if (!this.f153451d.isEmpty()) {
            Log.m105924i("MicroMsg.FinderLivePollingService", "notifyCmdIds " + this.f153452e.mo75798d(this.f153451d) + ' ' + this.f153452e.mo75797c());
            List<Integer> list = this.f153451d;
            C54847z3 z3Var = this.f153452e;
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                if (!((LinkedList) z3Var.f153755d).contains(Integer.valueOf(intValue2))) {
                    ((LinkedList) z3Var.f153755d).add(Integer.valueOf(intValue2));
                }
                z3Var.mo75801g(intValue2, false, true);
            }
            C54847z3.m61835b(this.f153452e);
        }
    }
}
