package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.hq */
public abstract class C24204hq {

    /* renamed from: a */
    public static final long f69283a = -1;

    /* renamed from: b */
    public static final int f69284b = 0;

    /* renamed from: c */
    public static final int f69285c = 1;

    /* renamed from: d */
    public static final int f69286d = 2;

    /* renamed from: e */
    public long f69287e;

    /* renamed from: f */
    public int f69288f = 0;

    /* renamed from: g */
    private long f69289g = -1;

    /* renamed from: h */
    private boolean f69290h;

    /* renamed from: i */
    private long f69291i;

    public C24204hq(long j) {
        this.f69287e = j;
    }

    /* renamed from: a */
    private void m30100a(long j) {
        this.f69291i = j;
    }

    /* renamed from: e */
    private void m30102e() {
        this.f69288f = 2;
    }

    /* renamed from: f */
    private boolean m30103f() {
        return this.f69288f == 1;
    }

    /* renamed from: a */
    public abstract void mo40958a(GL10 gl10, long j);

    /* renamed from: b */
    public void mo40959b() {
        this.f69288f = 1;
        this.f69289g = -1;
    }

    /* renamed from: c */
    public boolean mo40960c() {
        return this.f69288f == 2;
    }

    /* renamed from: d */
    public void mo40961d() {
        this.f69288f = 1;
        this.f69289g = -1;
    }

    /* renamed from: a */
    private void m30101a(boolean z) {
        this.f69290h = z;
    }

    /* renamed from: a */
    public final long mo40956a() {
        return this.f69287e;
    }

    /* renamed from: a */
    public void mo40957a(GL10 gl10) {
        if (this.f69288f == 1) {
            if (this.f69289g == -1) {
                this.f69289g = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f69289g;
            long j = this.f69291i;
            if (j - elapsedRealtime <= 0) {
                long j2 = elapsedRealtime - j;
                if (j2 >= this.f69287e) {
                    if (this.f69290h) {
                        mo40961d();
                    }
                    this.f69288f = 2;
                }
                mo40958a(gl10, j2);
            }
        }
    }
}
