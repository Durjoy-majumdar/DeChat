package x23;

import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sp3.C110801c;
import sp3.C110807k;
import sx3.C110818d0;
import sx3.C36907w;

/* renamed from: x23.a */
public final class C102552a {
    /* renamed from: a */
    public static final C96552p0 m135387a(C110807k kVar) {
        String str;
        long j;
        String str2;
        C96552p0 p0Var;
        C110807k kVar2 = kVar;
        C87412m.m108594g(kVar2, "videoComposition");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<C110801c> arrayList = kVar2.f331511l;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (true) {
            str = "TimeCost";
            if (!it.hasNext()) {
                break;
            }
            C110801c cVar = (C110801c) it.next();
            C106205q0 q0Var = new C106205q0(cVar.f331482t, cVar.f331483u, 0);
            q0Var.mo81191e(cVar.f331464b);
            q0Var.mo81187a(cVar.f331465c);
            q0Var.mo81190d(cVar.f331466d);
            q0Var.mo81188b(cVar.f331467e);
            q0Var.mo152162m(cVar.f331468f);
            q0Var.f316501l.f331474l.set(cVar.f331474l);
            q0Var.f316501l.f331475m.set(cVar.f331475m);
            Log.m105918d(str, "videoComposition2VLogComposition cost1:" + (System.currentTimeMillis() - currentTimeMillis));
            arrayList2.add(q0Var);
        }
        C96552p0 p0Var2 = new C96552p0((List<C106205q0>) arrayList2);
        ArrayList<C106205q0> arrayList3 = p0Var2.f282570c;
        if (arrayList3.isEmpty()) {
            j = currentTimeMillis;
            str2 = str;
            p0Var = p0Var2;
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            Iterator<C106205q0> it4 = arrayList3.iterator();
            long j2 = 0;
            C106205q0 q0Var2 = null;
            long j3 = 0;
            while (it4.hasNext()) {
                C106205q0 next = it4.next();
                C110801c cVar2 = next.f316501l;
                long j4 = currentTimeMillis;
                C96552p0 p0Var3 = p0Var2;
                Iterator<C106205q0> it5 = it4;
                String str3 = str;
                long j5 = (long) (((float) (cVar2.f331467e - cVar2.f331466d)) / cVar2.f331468f);
                long min = Math.min(cVar2.f331477o.mo162376b() ? next.f316501l.f331477o.f331495c : 0, Math.min(j2, j5));
                C110801c cVar3 = q0Var2 != null ? q0Var2.f316501l : null;
                if (cVar3 != null) {
                    cVar3.f331479q = j3 - (min / ((long) 2));
                }
                next.f316501l.f331478p = j3 - (min / ((long) 2));
                next.mo81191e(j3 - min);
                next.mo81187a(next.f316501l.f331464b + j5);
                j3 = next.f316501l.f331465c;
                j2 = j5;
                p0Var2 = p0Var3;
                q0Var2 = next;
                str = str3;
                currentTimeMillis = j4;
                it4 = it5;
            }
            j = currentTimeMillis;
            str2 = str;
            p0Var = p0Var2;
            C110801c cVar4 = ((C106205q0) C110818d0.m150923U(arrayList3)).f316501l;
            cVar4.f331479q = cVar4.f331465c;
            Log.m105918d(str2, "videoComposition2VLogComposition cost3:" + (System.currentTimeMillis() - currentTimeMillis2));
        }
        Log.m105918d(str2, "videoComposition2VLogComposition cost4:" + (System.currentTimeMillis() - j));
        Log.m105918d(str2, "videoComposition2VLogComposition cost2:" + (System.currentTimeMillis() - j));
        return p0Var;
    }
}
