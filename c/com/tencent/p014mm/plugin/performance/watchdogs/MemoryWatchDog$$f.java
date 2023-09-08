package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.sdk.platformtools.Log;
import p757xv.C91355x;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$f */
public class MemoryWatchDog$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MemoryWatchDog f248599d;

    /* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$f$a */
    public class C85322a implements Runnable {
        public C85322a() {
        }

        public void run() {
            Log.m105925i("MicroMsg.MemoryWatchDog", "after backgroundTrim: %s", MemoryWatchDog$$f.this.f248599d.mo118581g());
        }
    }

    public MemoryWatchDog$$f(MemoryWatchDog memoryWatchDog) {
        this.f248599d = memoryWatchDog;
    }

    public void run() {
        C91355x g = this.f248599d.mo118581g();
        Log.m105925i("MicroMsg.MemoryWatchDog", "backgroundTrim: %s", g);
        this.f248599d.mo118588n(g, true);
        C119179t tVar = C119157j.f356862d;
        C85322a aVar = new C85322a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183886q(aVar, 10000, (String) null);
    }
}
