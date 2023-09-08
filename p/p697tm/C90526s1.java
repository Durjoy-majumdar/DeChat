package p697tm;

import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81494g0;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import f40.C86709a0;
import java.util.Set;
import js0.C88024r;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: tm.s1 */
public class C90526s1 implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        if (C86709a0.m107522a()) {
            Set<Object> set = C81478e0.f239071d;
        }
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        boolean z;
        if (C86709a0.m107522a()) {
            Set<Object> set = C81478e0.f239071d;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C81481f0.C81483b bVar = C81481f0.C81483b.f239080a;
            String g = C48374j0.m53718g(aVar.f94242a.f227631h);
            if (!Util.isNullOrNil(g)) {
                Set<Object> set2 = C84737f0.f247137a;
                C88024r.m109571a().postToWorker(new C81494g0(bVar, g));
            }
        }
    }
}
