package com.tencent.liteav.base.p1181b;

import android.os.SystemClock;

/* renamed from: com.tencent.liteav.base.b.a */
public final class C113456a {

    /* renamed from: a */
    public long f339519a = 0;

    /* renamed from: b */
    private final long f339520b;

    public C113456a(long j) {
        this.f339520b = j;
    }

    /* renamed from: a */
    public final boolean mo169948a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f339519a;
        if (j != 0 && elapsedRealtime - j <= this.f339520b) {
            return false;
        }
        this.f339519a = SystemClock.elapsedRealtime();
        return true;
    }
}
