package com.tencent.p014mm.plugin.fts.logic;

import a70.C112760b;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.logic.FTS5SearchFeatureLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import kv1.C99252h;

/* renamed from: com.tencent.mm.plugin.fts.logic.c */
public class C93916c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f271038d;

    /* renamed from: e */
    public final /* synthetic */ FTS5SearchFeatureLogic.C938762 f271039e;

    public C93916c(FTS5SearchFeatureLogic.C938762 r1, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f271039e = r1;
        this.f271038d = checkResUpdateCacheFileEvent;
    }

    public void run() {
        FTS5SearchFeatureLogic fTS5SearchFeatureLogic = FTS5SearchFeatureLogic.this;
        String str = this.f271038d.f78743d.f78746c;
        fTS5SearchFeatureLogic.getClass();
        C86009m1 m1Var = new C86009m1(new C86009m1(C112760b.m154231g(), "fts"), "feature");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        C86009m1 m1Var2 = new C86009m1(m1Var, "temp");
        if (m1Var2.mo119967g()) {
            C86013q1.m106445f(m1Var2.mo119971i());
        }
        m1Var2.mo119987x();
        try {
            int R = C86013q1.m106436R(str, m1Var2.mo119971i());
            Log.m105925i("MicroMsg.FTS.FTS5SearchFeatureLogic", "unzip %s %d", str, Integer.valueOf(R));
            if (R >= 0) {
                C86009m1 d = FTS5SearchFeatureLogic.m118587d();
                C86009m1 m1Var3 = new C86009m1(m1Var2, "fts_feature");
                int e = fTS5SearchFeatureLogic.mo128827e(m1Var3);
                int e2 = fTS5SearchFeatureLogic.mo128827e(d);
                Log.m105925i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList: updateVersion %d currentVersion %d", Integer.valueOf(e), Integer.valueOf(e2));
                if (e > e2) {
                    C86013q1.m106445f(d.mo119971i());
                    m1Var3.mo119988y(d);
                    ((C93836i) fTS5SearchFeatureLogic.f270922e).mo128803c(65596, new FTS5SearchFeatureLogic.C93880d(d.mo119971i()));
                }
            }
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", e3, "updateFeatureList", new Object[0]);
            C99252h.m129300e(22);
        }
    }
}
