package ak1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import p1029rf.C89938b;
import p757xv.C91351p;
import p761yd.C91441c;
import p995kf.C88146a;

/* renamed from: ak1.g */
public final class C79586g {

    /* renamed from: a */
    public static final C79586g f233383a = new C79586g();

    /* renamed from: a */
    public final void mo109701a(long j) {
        C89938b bVar;
        C89938b bVar2;
        if (((C91351p) C86312j.m106911c(C91351p.class)).mo112621iK()) {
            C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
            if (j <= 0) {
                int i = MultiProcessMMKV.getMultiDefault().getInt("clicfg_matrix_trace_evil_method_threshold", 700);
                if (!(aVar == null || (bVar2 = aVar.f254916i) == null)) {
                    bVar2.f258440f = (long) i;
                }
                Log.m105924i("Finder.FinderFpsMonitor", "changeMatrixEvilMethodThreshold default " + i);
                return;
            }
            if (!(aVar == null || (bVar = aVar.f254916i) == null)) {
                bVar.f258440f = j;
            }
            Log.m105924i("Finder.FinderFpsMonitor", "changeMatrixEvilMethodThreshold " + j);
        }
    }
}
