package p697tm;

import com.tencent.p014mm.plugin.appbrand.appusage.C29390t0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81480f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83163g0;
import com.tencent.p014mm.plugin.appbrand.menu.C83688r;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86491q2;
import f40.C31896o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qe3.C89625d;
import wi0.C90983i;
import wi0.C90985j;

/* renamed from: tm.c */
public class C90517c implements C31896o0.C31897a {

    /* renamed from: d */
    public final List<C86491q2> f260134d;

    public C90517c() {
        ArrayList arrayList = new ArrayList();
        this.f260134d = arrayList;
        arrayList.add(new C90983i(new C90985j()));
        arrayList.add(new C29390t0());
        arrayList.add(new C81480f());
        arrayList.add(new C83163g0());
        arrayList.add(new C83688r.C83689a());
    }

    /* renamed from: aJ */
    public void mo58416aJ(int i) {
        Iterator it = ((ArrayList) this.f260134d).iterator();
        while (it.hasNext()) {
            C86491q2 q2Var = (C86491q2) it.next();
            if (q2Var.mo56581b(i)) {
                long currentTimeMillis = System.currentTimeMillis();
                q2Var.mo56582c(i);
                q2Var.f251315a = System.currentTimeMillis() - currentTimeMillis;
                Log.m105918d("MicroMsg.DataTransferBase", "doTransfer, timeConsumed = " + q2Var.f251315a + ", tag = " + q2Var.mo56580a());
            }
        }
        if (BuildInfo.IS_FLAVOR_RED) {
            C83163g0 g0Var = new C83163g0();
            if (g0Var.mo56581b(C89625d.f257841g)) {
                g0Var.mo56582c(C89625d.f257841g);
            }
        }
    }
}
