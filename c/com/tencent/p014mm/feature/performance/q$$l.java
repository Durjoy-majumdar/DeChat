package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p285zh.C119114c;
import p285zh.c$$e;

/* renamed from: com.tencent.mm.feature.performance.q$$l */
public class q$$l implements C80883e<IPCInteger, IPCVoid> {
    private q$$l() {
    }

    public void invoke(Object obj, C1256g gVar) {
        int i = ((IPCInteger) obj).f10313d;
        boolean z = C119114c.f356684a;
        C119114c.m167920e("MicroMsg.NotifyPowerInspector", "notePushNetSceneDelegate: func=" + i);
        if (MMApplicationContext.isMainProcess()) {
            c$$e c__e = C119114c.f356689f;
            if (c__e.mo183788b() || !C119114c.f356685b) {
                c__e.mo183789c(String.valueOf(i));
            }
        }
    }
}
