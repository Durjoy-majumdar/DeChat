package com.tencent.p014mm.app;

import android.content.p929pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.app.i0$$j */
public class i0$$j extends IPackageStatsObserver.Stub {
    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (packageStats != null) {
            try {
                long[] jArr = C80600i0.f235802u;
                jArr[0] = packageStats.cacheSize;
                jArr[1] = packageStats.dataSize;
                jArr[2] = packageStats.codeSize;
                Log.m105925i("MicroMsg.MMCrashReporter", "onGetStatsCompleted succeeded[%b] cacheSize :%d ,dataSize :%d ,codeSize :%d ", Boolean.valueOf(z), Long.valueOf(packageStats.cacheSize), Long.valueOf(packageStats.dataSize), Long.valueOf(packageStats.codeSize));
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MMCrashReporter", th, "onGetStatsCompleted", new Object[0]);
                return;
            }
        } else {
            Log.m105925i("MicroMsg.MMCrashReporter", "onGetStatsCompleted pStats is null succeeded[%b]", Boolean.valueOf(z));
        }
        synchronized (C80600i0.f235802u) {
            C80600i0.f235802u.notify();
        }
    }
}
