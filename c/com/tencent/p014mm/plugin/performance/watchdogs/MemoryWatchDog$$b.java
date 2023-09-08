package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1012ne.C88932a;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$b */
public class MemoryWatchDog$$b implements C88932a {

    /* renamed from: d */
    public final /* synthetic */ MemoryWatchDog f248597d;

    public MemoryWatchDog$$b(MemoryWatchDog memoryWatchDog) {
        this.f248597d = memoryWatchDog;
    }

    /* renamed from: a */
    public void mo112097a(boolean z) {
        Log.m105919d("MicroMsg.MemoryWatchDog", "[%s] isProcessForeground: %s", MMApplicationContext.getProcessName(), Boolean.valueOf(z));
        this.f248597d.f248583n = z;
        if (!z) {
            this.f248597d.f248588s = System.currentTimeMillis();
        }
    }
}
