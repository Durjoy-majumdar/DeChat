package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.concurrent.atomic.AtomicLong;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.i */
public final class C85268i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f248423d;

    /* renamed from: e */
    public final /* synthetic */ String f248424e;

    /* renamed from: f */
    public final /* synthetic */ AtomicLong f248425f;

    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.i$a */
    public static final class C85269a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f248426d;

        /* renamed from: e */
        public final /* synthetic */ String f248427e;

        /* renamed from: f */
        public final /* synthetic */ AtomicLong f248428f;

        public C85269a(String str, String str2, AtomicLong atomicLong) {
            this.f248426d = str;
            this.f248427e = str2;
            this.f248428f = atomicLong;
        }

        public final void run() {
            if (C85264g.f248417a.mo118429a(this.f248426d)) {
                Log.m105928w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout but locked " + this.f248427e);
            } else if (C86013q1.m106446g(this.f248426d, true)) {
                this.f248428f.compareAndSet(-1, 0);
                MagicBrushStorageQuotaManager.f248404a.mo118421d(this.f248427e, "temp", 0, true);
                Log.m105924i("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete success");
            } else {
                Log.m105928w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout delete failed");
            }
        }
    }

    public C85268i(String str, String str2, AtomicLong atomicLong) {
        this.f248423d = str;
        this.f248424e = str2;
        this.f248425f = atomicLong;
    }

    public final void run() {
        ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicTempFileClearTimeout.name(), 1, (String) null);
        Log.m105928w("MicroMsg.MagicBrushTempFileCleaner", "lruPruneMagicDirTempFiles timeout! " + this.f248423d + " deletePath " + this.f248424e);
        ((C119157j) C119157j.f356862d).mo183884o(new C85269a(this.f248424e, this.f248423d, this.f248425f));
    }
}
