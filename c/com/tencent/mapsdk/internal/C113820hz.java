package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.map.lib.models.GeoPoint;

/* renamed from: com.tencent.mapsdk.internal.hz */
public abstract class C113820hz {

    /* renamed from: a */
    public long f340555a = 1500;

    /* renamed from: b */
    public boolean f340556b = false;

    /* renamed from: c */
    public long f340557c = 0;

    /* renamed from: d */
    public boolean f340558d = false;

    /* renamed from: e */
    public boolean f340559e = false;

    /* renamed from: f */
    public Interpolator f340560f = new LinearInterpolator();

    /* renamed from: g */
    public C113821a f340561g = null;

    /* renamed from: h */
    public C113822b f340562h = null;

    /* renamed from: com.tencent.mapsdk.internal.hz$a */
    public interface C113821a {
        /* renamed from: a */
        void mo172183a();

        /* renamed from: b */
        void mo172184b();
    }

    /* renamed from: com.tencent.mapsdk.internal.hz$b */
    public interface C113822b {
        /* renamed from: a */
        void mo172208a(float f);

        /* renamed from: a */
        void mo172209a(float f, float f2);

        /* renamed from: a */
        void mo172210a(float f, float f2, float f3, float f4);

        /* renamed from: a */
        void mo172211a(int i, int i2);

        /* renamed from: b */
        void mo172212b(float f);
    }

    /* renamed from: c */
    private Interpolator mo172214c() {
        return this.f340560f;
    }

    /* renamed from: d */
    private static long m157195d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    private void m157196e() {
        this.f340556b = false;
    }

    /* renamed from: f */
    private boolean m157197f() {
        return this.f340556b;
    }

    /* renamed from: g */
    private boolean m157198g() {
        return this.f340558d;
    }

    /* renamed from: h */
    private boolean m157199h() {
        return this.f340559e;
    }

    /* renamed from: a */
    public abstract void mo172201a(float f, Interpolator interpolator);

    /* renamed from: a */
    public final void mo172204a(C113821a aVar) {
        this.f340561g = aVar;
    }

    /* renamed from: b */
    public final void mo172207b() {
        C113821a aVar;
        if (this.f340556b) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f340557c)) / ((float) this.f340555a);
            if (uptimeMillis > 1.0f) {
                this.f340556b = false;
                mo172201a(1.0f, this.f340560f);
                C113821a aVar2 = this.f340561g;
                if (aVar2 != null) {
                    aVar2.mo172184b();
                }
                this.f340559e = true;
                return;
            }
            mo172201a(uptimeMillis, this.f340560f);
        } else if (this.f340558d && !this.f340559e && (aVar = this.f340561g) != null) {
            aVar.mo172184b();
        }
    }

    /* renamed from: a */
    public void mo172205a(C113822b bVar) {
        this.f340562h = bVar;
    }

    /* renamed from: a */
    private void m157193a(Interpolator interpolator) {
        this.f340560f = interpolator;
    }

    /* renamed from: a */
    public void mo172203a(long j) {
        this.f340555a = j;
    }

    /* renamed from: a */
    public final long mo172202a() {
        return this.f340555a;
    }

    /* renamed from: a */
    public boolean mo172206a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (this.f340555a <= 0) {
            return false;
        }
        this.f340558d = true;
        this.f340557c = SystemClock.uptimeMillis();
        this.f340556b = true;
        C113821a aVar = this.f340561g;
        if (aVar != null) {
            aVar.mo172183a();
        }
        return true;
    }
}
