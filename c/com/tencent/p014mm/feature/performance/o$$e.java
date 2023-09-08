package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.feature.performance.o$$e */
public final /* synthetic */ class o$$e implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ long f10306d;

    public /* synthetic */ o$$e(long j) {
        this.f10306d = j;
    }

    public final Object invoke(Object obj) {
        long j = this.f10306d;
        C86009m1 m1Var = new C86009m1((String) obj);
        C86009m1 m1Var2 = new C86009m1(MMApplicationContext.getContext().getExternalCacheDir() + "/hprofs");
        Log.m105925i("MicroMsg.MatrixShellService", "prepare hprof dir %s", m1Var2);
        if (!m1Var2.mo119967g()) {
            Log.m105921e("MicroMsg.MatrixShellService", "dir not exists, mkdir: %s", Boolean.valueOf(m1Var2.mo119987x()));
        }
        C86009m1 m1Var3 = new C86009m1(m1Var2, m1Var.getName());
        Log.m105925i("MicroMsg.MatrixShellService", "hprof file path is %s", m1Var3.mo119971i());
        C86013q1.m106463x(m1Var.mo119971i(), m1Var3.mo119971i());
        ((C119157j) C119157j.f356862d).mo183895z(new o$$g(j, m1Var3));
        return null;
    }
}
