package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.tencent.mapsdk.internal.mr */
public final class C113969mr extends Thread {

    /* renamed from: c */
    private static final int f340948c = 80;

    /* renamed from: a */
    public volatile boolean f340949a = false;

    /* renamed from: b */
    public volatile boolean f340950b = false;

    /* renamed from: d */
    private C113961mq f340951d;

    /* renamed from: e */
    private volatile boolean f340952e = false;

    public C113969mr(C113961mq mqVar) {
        setName("tms-texture");
        this.f340951d = mqVar;
    }

    /* renamed from: b */
    private void m158229b() {
        this.f340949a = true;
    }

    /* renamed from: c */
    private void m158230c() {
        this.f340949a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: d */
    private boolean m158231d() {
        C114216sq sqVar;
        C113961mq mqVar = this.f340951d;
        if (mqVar == null || (sqVar = mqVar.f340899g) == null || sqVar.f342024e == 0) {
            return false;
        }
        if (SystemClock.elapsedRealtime() - sqVar.f342030k > 560) {
            sqVar.f342023d.nativeClearDownloadURLCache(sqVar.f342024e);
            sqVar.f342030k = SystemClock.elapsedRealtime();
        }
        return sqVar.f342023d.nativeGenerateTextures(sqVar.f342024e);
    }

    /* renamed from: e */
    private boolean m158232e() {
        return this.f340950b;
    }

    /* renamed from: a */
    public final void mo172475a() {
        this.f340949a = false;
        this.f340952e = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public final void run() {
        C113961mq mqVar;
        C114216sq sqVar;
        while (!this.f340952e) {
            boolean z = false;
            if (!(this.f340949a || (mqVar = this.f340951d) == null || (sqVar = mqVar.f340899g) == null || sqVar.f342024e == 0)) {
                if (SystemClock.elapsedRealtime() - sqVar.f342030k > 560) {
                    sqVar.f342023d.nativeClearDownloadURLCache(sqVar.f342024e);
                    sqVar.f342030k = SystemClock.elapsedRealtime();
                }
                z = sqVar.f342023d.nativeGenerateTextures(sqVar.f342024e);
            }
            if (!z) {
                try {
                    synchronized (this) {
                        wait(80);
                    }
                } catch (InterruptedException e) {
                    C113889km.m157537a(Log.getStackTraceString(e));
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.f340950b = true;
    }
}
