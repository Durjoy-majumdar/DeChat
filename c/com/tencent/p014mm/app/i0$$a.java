package com.tencent.p014mm.app;

import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tav.coremedia.TimeUtil;
import java.nio.charset.StandardCharsets;
import kj2.C117407d;
import p761yd.C91440a;

/* renamed from: com.tencent.mm.app.i0$$a */
public final /* synthetic */ class i0$$a implements Runnable {
    public final void run() {
        C86009m1[] u;
        Log.m105924i("MicroMsg.MMCrashReporter", "reportPreviousAnr");
        C86009m1 m1Var = new C86009m1(new C86009m1(new C86009m1(MMApplicationContext.getContext().getFilesDir(), "anr"), "history"), MMApplicationContext.getProcessName());
        if (m1Var.mo119967g() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 m1Var2 : u) {
                String name = m1Var2.getName();
                Log.m105924i("MicroMsg.MMCrashReporter", "reportPreviousAnr, fileName = " + name);
                String str = new String(Util.readFromFile(m1Var2.mo119971i()), StandardCharsets.UTF_8);
                long parseLong = Long.parseLong(name);
                AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
                C117407d.INSTANCE.mo160131h(19664, str, appForegroundDelegate.mo174210c(), 20, Integer.valueOf((C91440a.INSTANCE.mo125375b() || appForegroundDelegate.f343454n) ? 1 : 0), MMApplicationContext.getProcessName(), C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, parseLong / 1000), BuildInfo.REV, "", 0, 0, 1, 0, BuildInfo.CLIENT_VERSION, "", 0, 0, 0, "", "", "", "", "", 0, 1, "");
                m1Var2.mo119966f();
            }
        }
    }
}
