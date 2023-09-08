package com.tencent.p014mm.matrix;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.matrix.c$$a */
public final /* synthetic */ class c$$a implements Runnable {
    public final void run() {
        if (MMApplicationContext.isMainProcess()) {
            C115669n.INSTANCE.mo175913w(1699, 3, 1);
        } else if (MMApplicationContext.isAppBrandProcess()) {
            C115669n.INSTANCE.mo175913w(1699, 4, 1);
        } else if (MMApplicationContext.isToolsProcess()) {
            C115669n.INSTANCE.mo175913w(1699, 5, 1);
        }
    }
}
