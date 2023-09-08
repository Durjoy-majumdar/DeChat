package com.tencent.p014mm.app;

import com.tencent.p014mm.feature.performance.C80864q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.app.j0 */
public class C80602j0 implements Runnable {
    public void run() {
        try {
            if (C86312j.m106911c(C32735h.class) != null) {
                ((C80864q) C86312j.m106911c(C80864q.class)).f237694d.mo182011c();
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMCrashReporter", th, "", new Object[0]);
        }
    }
}
