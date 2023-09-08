package com.tencent.p014mm.feature.performance;

import com.tencent.matrix.mallctl.MallCtl;
import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import p1028re.C89928a;
import p206nj.C76862i;

/* renamed from: com.tencent.mm.feature.performance.y */
public class C28939y implements C89928a {
    public C28939y(C80864q qVar) {
    }

    /* renamed from: a */
    public void mo391a(int i) {
        mo56334c();
    }

    /* renamed from: b */
    public void mo392b() {
        mo56334c();
    }

    /* renamed from: c */
    public final void mo56334c() {
        if (C76862i.m92661a("xperf")) {
            try {
                int d = MallCtl.m98071d();
                int i = 1;
                Log.m105925i("MicroMsg.PluginPerformance", "doMallOpt = %d", Integer.valueOf(d));
                if (d == -2) {
                    i = 4;
                } else if (d == -1) {
                    i = 3;
                } else if (d == 0) {
                    i = 0;
                } else if (d != 1) {
                    i = -1;
                }
                C117407d.INSTANCE.mo182088q(1939, i);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.PluginPerformance", th, "doMallOpt failed", new Object[0]);
            }
        } else {
            Log.m105924i("MicroMsg.PluginPerformance", "xperf Expansion NOT installed");
        }
    }
}
