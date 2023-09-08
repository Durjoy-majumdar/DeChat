package com.tencent.p014mm.legacy.app;

import com.tencent.matrix.trace.tracer.SignalAnrTracer;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: com.tencent.mm.legacy.app.d */
public class C80960d implements Runnable {
    public C80960d(C80962f fVar) {
    }

    public void run() {
        if (!C86709a0.m107528h().f251724a.f251792d) {
            Log.m105920e("MicroMsg.DefaultBootStep", "Kernel has not startup done!");
            try {
                SignalAnrTracer.m98143l();
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.DefaultBootStep", "printTrace error, message = %s", th.getMessage());
            }
        }
    }
}
