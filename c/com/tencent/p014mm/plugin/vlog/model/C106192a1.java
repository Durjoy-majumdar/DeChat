package com.tencent.p014mm.plugin.vlog.model;

import a23.C39482c;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import te3.C110965ic;
import te3.C64645q23;

/* renamed from: com.tencent.mm.plugin.vlog.model.a1 */
public final class C106192a1 {

    /* renamed from: a */
    public static final C106192a1 f316410a = new C106192a1();

    /* renamed from: b */
    public static long f316411b;

    /* renamed from: c */
    public static long f316412c;

    /* renamed from: d */
    public static long f316413d;

    /* renamed from: e */
    public static final List<C110965ic> f316414e = new ArrayList();

    /* renamed from: f */
    public static long f316415f = -1;

    /* renamed from: g */
    public static C96557v0 f316416g;

    /* renamed from: a */
    public final void mo152108a(C96557v0 v0Var) {
        C96557v0 v0Var2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!(f316415f == -1 || (v0Var2 = f316416g) == null)) {
            C110965ic icVar = new C110965ic();
            icVar.f332072d = v0Var2.f282611a;
            icVar.f332073e = 1;
            icVar.f332074f = currentTimeMillis - f316415f;
            icVar.f332075g = System.currentTimeMillis();
            C64645q23 q232 = v0Var2.f282614d.f131933e;
            icVar.f332077i = (int) q232.f184934d;
            icVar.f332076h = (int) q232.f184935e;
            icVar.f332078j = (int) q232.f184937g;
            ((ArrayList) f316414e).add(icVar);
            Log.m105924i("MicroMsg.VlogReporter", "record watch: vlogscriptModel = " + v0Var2 + ", watch time = " + icVar.f332074f + LocaleUtil.MALAY);
        }
        f316415f = currentTimeMillis;
        f316416g = v0Var;
    }

    /* renamed from: b */
    public final void mo152109b() {
        ArrayList arrayList = (ArrayList) f316414e;
        if (!arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.VlogReporter", "do send result: behavior size = " + arrayList.size());
            C86709a0.m107529k().f251779b.mo123460f(new C39482c(f316411b, f316412c, f316413d, arrayList));
            arrayList.clear();
        }
        f316411b = 0;
        f316412c = 0;
        f316413d = 0;
        f316415f = -1;
        f316416g = null;
    }
}
