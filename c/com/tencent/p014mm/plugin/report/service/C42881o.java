package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import mj2.C47057f;
import ob0.C11385n;
import ob0.C117747y;
import te3.C50058k0;

/* renamed from: com.tencent.mm.plugin.report.service.o */
public class C42881o implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C115669n f116107d;

    /* renamed from: com.tencent.mm.plugin.report.service.o$a */
    public class C42882a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C50058k0 f116108d;

        public C42882a(C50058k0 k0Var) {
            this.f116108d = k0Var;
        }

        public void run() {
            try {
                C42881o.this.f116107d.f346962j = System.currentTimeMillis();
                C85801v1 i = C86709a0.m107535s().mo121142i();
                i.mo119677K(C72994y1.C72995a.USERINFO_CLOG_SAMPLING_REFRESH_TIME_LONG, Long.valueOf(C42881o.this.f116107d.f346962j));
                i.mo119681a(false);
                C115669n nVar = C42881o.this.f116107d;
                int i2 = nVar.f346960h;
                C50058k0 k0Var = this.f116108d;
                int i3 = k0Var.f136480d;
                if (i2 == i3 && nVar.f346961i == k0Var.f136483g) {
                    Log.m105925i("MicroMsg.cLog", "Version not changed, use previous settings (%d / %d)", Integer.valueOf(i3), Integer.valueOf(this.f116108d.f136483g));
                    return;
                }
                C86013q1.m106437S(C86009m1.m106378c(MMApplicationContext.getContext().getFileStreamPath("clog-settings")).mo119976n(), k0Var.toByteArray());
                C115669n.m162701p(C42881o.this.f116107d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.cLog", e, "Failed to parse response.", new Object[0]);
            }
        }
    }

    public C42881o(C115669n nVar) {
        this.f116107d = nVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.setHasCallbackToQueue(true);
        if (i != 0) {
            Log.m105920e("MicroMsg.cLog", "NetScene failed, code=" + i2 + ", msg=" + str);
            return;
        }
        C86709a0.m107525e().postToWorker(new C42882a(((C47057f) yVar).f126469g));
    }
}
