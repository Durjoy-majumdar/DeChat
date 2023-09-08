package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.model.o */
public final class C19458o implements Runnable {

    /* renamed from: d */
    public static final C19458o f54986d = new C19458o();

    public final void run() {
        Log.m105925i("MicroMsg.BizImageBlankReporter", "alvinluo reportImageLoadCountInfo %s", C19449k.f54942d);
        C115669n.INSTANCE.mo160131h(17890, Integer.valueOf(C19449k.f54942d.f54971a), Integer.valueOf(C19449k.f54942d.f54974d), Integer.valueOf(C19449k.f54942d.f54973c), Integer.valueOf(C19449k.f54942d.f54972b));
        C19449k kVar = C19449k.f54939a;
        Log.m105925i("MicroMsg.BizImageBlankReporter", "alvinluo resetImageLoadCountInfo %s", C19449k.f54942d);
        C19449k.C19452c cVar = C19449k.f54942d;
        cVar.f54971a = 0;
        cVar.f54972b = 0;
        cVar.f54973c = 0;
        cVar.f54974d = 0;
    }
}
