package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import p285zh.C119114c;

/* renamed from: com.tencent.mm.feature.performance.q$$k */
public class q$$k implements C80883e<IPCLong, IPCVoid> {
    private q$$k() {
    }

    public void invoke(Object obj, C1256g gVar) {
        long j = ((IPCLong) obj).f10314d;
        boolean z = C119114c.f356684a;
        Log.m105924i("MicroMsg.NotifyPowerInspector", "noteLightPushTimeDelegate: " + j);
        C119114c.f356686c = C119114c.f356686c + j;
    }
}
