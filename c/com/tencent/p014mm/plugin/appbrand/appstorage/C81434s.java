package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82852c;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.concurrent.atomic.AtomicLong;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.s */
public final class C81434s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f238982d;

    /* renamed from: e */
    public final /* synthetic */ String f238983e;

    /* renamed from: f */
    public final /* synthetic */ AtomicLong f238984f;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.s$a */
    public static final class C81435a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f238985d;

        /* renamed from: e */
        public final /* synthetic */ String f238986e;

        /* renamed from: f */
        public final /* synthetic */ AtomicLong f238987f;

        public C81435a(String str, String str2, AtomicLong atomicLong) {
            this.f238985d = str;
            this.f238986e = str2;
            this.f238987f = atomicLong;
        }

        public final void run() {
            if (C81429q.f238972a.mo113749a(this.f238985d)) {
                Log.m105928w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout but locked " + this.f238986e);
            } else if (C86013q1.m106446g(this.f238985d, true)) {
                this.f238987f.compareAndSet(-1, 0);
                AppBrandStorageQuotaManager.f238916a.mo113690g(this.f238986e, "temp", 0, true);
                Log.m105924i("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete success");
            } else {
                Log.m105928w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout delete failed");
            }
        }
    }

    public C81434s(String str, String str2, AtomicLong atomicLong) {
        this.f238982d = str;
        this.f238983e = str2;
        this.f238984f = atomicLong;
    }

    public final void run() {
        C115669n.INSTANCE.mo175911u(C82852c.CTRL_INDEX, 252);
        Log.m105928w("MicroMsg.AppBrandTempFileCleaner", "lruPruneAppDirTempFiles timeout! " + this.f238982d + " deletePath " + this.f238983e);
        ((C119157j) C119157j.f356862d).mo183884o(new C81435a(this.f238983e, this.f238982d, this.f238984f));
    }
}
