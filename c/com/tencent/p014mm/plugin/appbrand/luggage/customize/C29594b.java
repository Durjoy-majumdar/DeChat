package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C1520d;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29320c;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29339n;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import mi0.C34574b;
import ni0.C34850b;
import p1039tb.C90388a;
import p523fp.C32147e;
import p823sg.C77710q;
import wi0.C38158d;

@Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.b */
public class C29594b implements C90388a {
    /* renamed from: Fn */
    public void mo56833Fn() {
        Class cls = C32147e.class;
        if (MMApplicationContext.isMainProcess()) {
            ((C32147e) C86312j.m106911c(cls)).b70(38, 1, ((C32147e) C86312j.m106911c(cls)).mo58514sC(38, 1), false);
        } else {
            Log.m105924i("MicroMsg.AppBrandGlobalSystemConfigResUpdateListener", "onConfigFileDeleted: not in main proc, ignore");
        }
    }

    /* renamed from: IV */
    public C34850b mo56834IV() {
        return (C34850b) C81161g2.Bx0(C34850b.class);
    }

    public C29328h Np0() {
        C81161g2.requireAccountInitializedOnDemand();
        return C81161g2.f238469e;
    }

    /* renamed from: Sl */
    public void mo56836Sl(String str) {
        C81161g2.requireAccountInitializedOnDemand();
        C29328h hVar = C81161g2.f238469e;
        for (int i = 0; i <= 3; i++) {
            hVar.mo56590S(i, str);
        }
        hVar.getClass();
        long longValue = new C77710q(((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(str)).longValue();
        C29339n.f80095h.mo56626a(longValue).mo56617a(str);
        C29320c.C29322b bVar = C29320c.f80053i;
        C87412m.m108594g(str, "appId");
        new C29320c(longValue, str, "", (C29339n) null).mo56592a(str);
        C34850b IV = mo56834IV();
        if (IV != null) {
            IV.mo59761jo(str);
        }
        C1520d.f10881a.mo1533a(longValue, str);
    }

    /* renamed from: dI */
    public C81414g0 mo56837dI(String str, int i, String str2) {
        Class cls = C34574b.class;
        if (i == 2) {
            return C29339n.f80095h.mo56626a(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue());
        } else if (i == 4) {
            C29339n a = C29339n.f80095h.mo56626a(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue());
            return C29320c.f80053i.mo56600b(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue(), str, str2, a);
        } else if (i != 5) {
            return C29339n.f80095h.mo56626a(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue());
        } else {
            return C29320c.f80053i.mo56600b(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue(), str, str2, (C29339n) null);
        }
    }

    /* renamed from: h1 */
    public C38158d mo56838h1() {
        return C81161g2.m99451h1();
    }

    /* renamed from: jx */
    public long mo56839jx(String str) {
        Class cls = C34574b.class;
        C81161g2.requireAccountInitializedOnDemand();
        C29328h hVar = C81161g2.f238469e;
        long j = 0;
        if (hVar != null) {
            j = 0 + ((long) hVar.mo56589Bk(str));
        } else {
            Log.m105920e("MicroMsg.CustomizeWxaStorage", "appbrand kv storage is null");
        }
        long longValue = new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue();
        C29320c.C29322b bVar = C29320c.f80053i;
        return j + ((long) C29339n.f80095h.mo56626a(longValue).mo56589Bk(str)) + ((long) new C29320c(new C77710q(((C34574b) C86312j.m106911c(cls)).mo56629LU(str)).longValue(), str, "", (C29339n) null).mo56589Bk(str));
    }
}
