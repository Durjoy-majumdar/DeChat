package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import p981ie.C117159b;
import p981ie.C117173p;
import p988jj.C87968a;

/* renamed from: com.tencent.mm.feature.performance.q$$d */
public final /* synthetic */ class q$$d implements Runnable {
    public final void run() {
        int i;
        int k = C117159b.m165210k();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            i = C117173p.m165234j(MMApplicationContext.getContext()).mo181090g();
        } catch (Throwable unused) {
            i = -1;
        }
        if (k != availableProcessors || (i != -1 && i != availableProcessors)) {
            C87968a.C87969a.C87970a.m109467a("CpuCoreNum", (Throwable) null, (Map<String, Object>) null, String.valueOf(k), String.valueOf(availableProcessors), String.valueOf(i));
        }
    }
}
