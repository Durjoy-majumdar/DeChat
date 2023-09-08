package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.nio.charset.StandardCharsets;

/* renamed from: com.tencent.mm.app.i0$$b */
public final /* synthetic */ class i0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f9015d;

    public /* synthetic */ i0$$b(String str) {
        this.f9015d = str;
    }

    public final void run() {
        String str = this.f9015d;
        try {
            Log.m105924i("MicroMsg.MMCrashReporter", "saveAnrHistory");
            C86009m1 m1Var = new C86009m1(new C86009m1(new C86009m1(MMApplicationContext.getContext().getFilesDir(), "anr"), "history"), MMApplicationContext.getProcessName());
            if (!m1Var.mo119967g()) {
                m1Var.mo119987x();
            }
            Util.writeToFile(new C86009m1(m1Var, System.currentTimeMillis() + "").mo119971i(), str.getBytes(StandardCharsets.UTF_8));
            Log.m105924i("MicroMsg.MMCrashReporter", "saveAnrHistory, done");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMCrashReporter", "saveAnrLocal failed, msg = " + th.getMessage());
        }
    }
}
