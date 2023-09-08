package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.app.i0$$c */
public final /* synthetic */ class i0$$c implements Runnable {
    public final void run() {
        C86009m1[] u;
        Log.m105924i("MicroMsg.MMCrashReporter", "deleteAnrHistory");
        C86009m1 m1Var = new C86009m1(new C86009m1(new C86009m1(MMApplicationContext.getContext().getFilesDir(), "anr"), "history"), MMApplicationContext.getProcessName());
        if (m1Var.mo119967g() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 f : u) {
                f.mo119966f();
            }
            Log.m105924i("MicroMsg.MMCrashReporter", "deleteAnrHistory, done");
        }
    }
}
