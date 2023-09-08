package com.tencent.p014mm.app;

import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.Callable;
import p757xv.C91355x;

/* renamed from: com.tencent.mm.app.i0$$d */
public final /* synthetic */ class i0$$d implements Callable {
    public final Object call() {
        C91355x h = MemoryWatchDog.f248575A.mo118582h(false, 0);
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("totalMem:");
            sb.append(h.f262022x.totalMem / 1000);
            sb.append(" ");
            sb.append("VmSize:");
            sb.append(h.f262003e);
            sb.append(" ");
            sb.append("javaMaxMem:");
            sb.append(h.f262016r / 1000);
            sb.append(" ");
            sb.append("javaUsedMem:");
            sb.append(h.f262014p / 1000);
            sb.append(" ");
            sb.append("javaFreeMem:");
            sb.append((h.f262016r - h.f262014p) / 1000);
            return sb.toString();
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.MemoryInfo", "getAnrReportMemoryInfoString error : %s", th.getMessage());
            return sb.toString();
        }
    }
}
