package com.tencent.liteav.videobase.utils;

import android.os.SystemClock;
import com.tencent.liteav.base.p1181b.C113456a;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videobase.utils.e */
public final class C17246e {

    /* renamed from: a */
    private final String f46616a;

    /* renamed from: b */
    private final int f46617b;

    /* renamed from: c */
    private final C113456a f46618c = new C113456a(3000);

    /* renamed from: d */
    private long f46619d;

    /* renamed from: e */
    private long f46620e;

    /* renamed from: f */
    private long f46621f;

    /* renamed from: g */
    private final C17247a f46622g;

    /* renamed from: h */
    private double f46623h = 0.0d;

    /* renamed from: com.tencent.liteav.videobase.utils.e$a */
    public interface C17247a {
        /* renamed from: a */
        void mo20224a(double d);
    }

    public C17246e(String str, int i, C17247a aVar) {
        this.f46616a = str + "(" + hashCode() + ")";
        this.f46617b = (int) Math.max((long) i, TimeUnit.SECONDS.toMillis(1));
        mo20223b();
        this.f46622g = aVar;
    }

    /* renamed from: a */
    public final void mo20222a() {
        this.f46619d++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f46621f;
        if (j == 0) {
            this.f46621f = SystemClock.elapsedRealtime();
        } else if (elapsedRealtime - j >= ((long) this.f46617b)) {
            this.f46623h = (double) ((((float) (this.f46619d - this.f46620e)) * 1000.0f) / ((float) (elapsedRealtime - j)));
            if (this.f46618c.mo169948a()) {
                LiteavLog.m16901i("FpsCalculate", "meter name:" + this.f46616a + " fps:" + this.f46623h);
            }
            this.f46621f = elapsedRealtime;
            this.f46620e = this.f46619d;
            C17247a aVar = this.f46622g;
            if (aVar != null) {
                aVar.mo20224a(this.f46623h);
            }
        }
    }

    /* renamed from: b */
    public final void mo20223b() {
        this.f46619d = 0;
        this.f46620e = 0;
        this.f46621f = 0;
    }
}
