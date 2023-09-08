package aa1;

import ba1.C16777c;
import ca1.C113264b;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import i91.C21062c;
import op3.C117877b;
import te3.C118427eg2;
import te3.C118467t1;
import te3.C22505ka3;

/* renamed from: aa1.b */
public final class C16453b {
    /* renamed from: a */
    public static C117877b<C118427eg2, Integer> m15287a() {
        if (C115411b.m162220c()) {
            Log.m105928w("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getCurPageFlowItem, doNotNeedSessionMonitor: TRUE");
            return null;
        }
        C22505ka3 e = C16777c.m16413e();
        if (e == null) {
            Log.m105920e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession is NULL");
            return null;
        }
        Log.m105925i("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curSession: %s", e.f64087d);
        C118467t1 g = C21062c.m23249d().mo32776g();
        if (g == null) {
            Log.m105920e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, curAR is NULL");
            return null;
        }
        C117877b<C118427eg2, Integer> e2 = C113264b.m155059e(e.f64087d, g.f354392d.f354001d);
        if (e2 == null) {
            Log.m105920e("HABBYGE-MALI.BaseBizCollector", "BaseBizCollector, getPageFlowItemOfCurSession is NULL");
            return null;
        }
        C118427eg2 eg22 = (C118427eg2) e2.mo182596a(0);
        ((Integer) e2.mo182596a(1)).intValue();
        return e2;
    }
}
