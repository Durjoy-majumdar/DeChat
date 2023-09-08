package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$e */
public class MemoryWatchDog$$e implements Runnable {
    public MemoryWatchDog$$e(MemoryWatchDog memoryWatchDog) {
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "trigger memory hook\n(toast for debug/coolassist)", 0).show();
    }
}
