package com.tencent.p014mm.app;

import com.tencent.matrix.trace.tracer.ThreadTracer;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.k0 */
public class C80603k0 implements C114660c0 {

    /* renamed from: com.tencent.mm.app.k0$a */
    public class C80604a implements Runnable {
        public C80604a(C80603k0 k0Var) {
        }

        public void run() {
            C80600i0.f235798q = false;
            if (!AppForegroundDelegate.INSTANCE.f343454n) {
                try {
                    int j = ThreadTracer.m98151j();
                    Log.m105924i("MicroMsg.MMCrashReporter", "keySeq = " + j);
                    if (j > 100) {
                        C117407d.INSTANCE.mo160131h(19816, 2005, Long.valueOf(System.currentTimeMillis()), 0, "", "", Integer.valueOf(j), "", MMApplicationContext.getProcessName(), 0, "", BuildInfo.REV);
                    }
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.MMCrashReporter", "report pthread key seq failed, et = " + th.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public void mo112345b(boolean z) {
        synchronized (this) {
            if (z) {
                if (!C80600i0.f235798q) {
                    C80600i0.f235798q = true;
                    ((C119157j) C119157j.f356862d).mo183879j(new C80604a(this), 60, "pthread-key-report");
                }
            }
        }
    }
}
