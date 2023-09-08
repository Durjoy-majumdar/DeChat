package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.tencent.mapsdk.internal.ho */
public class C113814ho {

    /* renamed from: a */
    public long f340544a = 1500;

    /* renamed from: b */
    public boolean f340545b;

    /* renamed from: c */
    public long f340546c = 0;

    /* renamed from: d */
    public boolean f340547d;

    /* renamed from: e */
    public C113815a f340548e = null;

    /* renamed from: f */
    public C113816b f340549f = null;

    /* renamed from: g */
    private boolean f340550g;

    /* renamed from: h */
    private boolean f340551h;

    /* renamed from: i */
    private Interpolator f340552i = new LinearInterpolator();

    /* renamed from: com.tencent.mapsdk.internal.ho$a */
    public static abstract class C113815a {
        /* renamed from: a */
        private static void m157180a() {
        }

        /* renamed from: b */
        private static void m157181b() {
        }

        /* renamed from: a */
        public void mo172195a(float f) {
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ho$b */
    public interface C113816b {
        /* renamed from: a */
        void mo172196a();

        /* renamed from: b */
        void mo172197b();

        /* renamed from: c */
        void mo172198c();

        /* renamed from: d */
        void mo172199d();

        /* renamed from: e */
        void mo172200e();
    }

    /* renamed from: c */
    private Interpolator m157167c() {
        return this.f340552i;
    }

    /* renamed from: d */
    private static long m157168d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    private void m157169e() {
        this.f340545b = false;
    }

    /* renamed from: f */
    private boolean m157170f() {
        return this.f340545b;
    }

    /* renamed from: g */
    private boolean m157171g() {
        return this.f340550g;
    }

    /* renamed from: h */
    private boolean m157172h() {
        return this.f340551h;
    }

    /* renamed from: i */
    private boolean m157173i() {
        return this.f340547d;
    }

    /* renamed from: a */
    public final void mo172191a(C113815a aVar) {
        this.f340548e = aVar;
    }

    /* renamed from: b */
    public final void mo172194b() {
        if (!this.f340545b && this.f340551h && this.f340546c == 0) {
            this.f340546c = SystemClock.uptimeMillis();
            this.f340545b = true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = ((float) (uptimeMillis - this.f340546c)) / ((float) this.f340544a);
        if (f > 1.0f) {
            if (this.f340550g) {
                this.f340546c = uptimeMillis;
            } else {
                this.f340545b = false;
            }
            f = 1.0f;
        }
        Interpolator interpolator = this.f340552i;
        if (interpolator != null) {
            f = interpolator.getInterpolation(f);
        }
        mo172189a(f);
        if (!this.f340545b) {
            this.f340547d = true;
        }
    }

    /* renamed from: a */
    private void m157165a(C113816b bVar) {
        this.f340549f = bVar;
    }

    /* renamed from: a */
    private void m157164a(Interpolator interpolator) {
        this.f340552i = interpolator;
    }

    /* renamed from: a */
    public final void mo172190a(long j) {
        this.f340544a = j;
    }

    /* renamed from: a */
    public final boolean mo172192a() {
        return mo172193a(false);
    }

    /* renamed from: a */
    public final boolean mo172193a(boolean z) {
        if (this.f340544a <= 0 || this.f340551h) {
            return false;
        }
        this.f340551h = true;
        this.f340550g = z;
        return true;
    }

    /* renamed from: a */
    public void mo172189a(float f) {
        C113815a aVar = this.f340548e;
        if (aVar != null) {
            aVar.mo172195a(f);
        }
    }

    /* renamed from: b */
    private float m157166b(float f) {
        Interpolator interpolator = this.f340552i;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }
}
