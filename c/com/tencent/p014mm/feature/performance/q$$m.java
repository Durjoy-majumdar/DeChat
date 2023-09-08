package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p285zh.C119114c;
import p285zh.c$$e;

/* renamed from: com.tencent.mm.feature.performance.q$$m */
public class q$$m implements C80883e<IPCInteger, IPCVoid> {
    private q$$m() {
    }

    public void invoke(Object obj, C1256g gVar) {
        int i = ((IPCInteger) obj).f10313d;
        boolean z = C119114c.f356684a;
        Log.m105924i("MicroMsg.NotifyPowerInspector", "pushNotifyDelegate: func=" + i);
        if (MMApplicationContext.isMainProcess()) {
            c$$e c__e = C119114c.f356687d;
            if (c__e.mo183788b() || !C119114c.f356685b) {
                c__e.mo183789c(String.valueOf(i));
            }
        }
    }
}
