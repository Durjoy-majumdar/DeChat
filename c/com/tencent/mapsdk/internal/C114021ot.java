package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C114022ou;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;

/* renamed from: com.tencent.mapsdk.internal.ot */
public final class C114021ot extends C114022ou implements C114022ou.C104562a {

    /* renamed from: a */
    public static final int f340986a = 1;

    /* renamed from: b */
    public static final int f340987b = 16;

    /* renamed from: c */
    public static final int f340988c = 256;

    /* renamed from: d */
    public static final int f340989d = 4096;

    /* renamed from: e */
    public static final int f340990e = 65536;

    /* renamed from: A */
    public boolean f340991A;

    /* renamed from: B */
    public boolean f340992B;

    /* renamed from: C */
    public int f340993C;

    /* renamed from: D */
    public int f340994D;

    /* renamed from: S */
    private String f340995S;

    /* renamed from: T */
    private RectF f340996T;

    /* renamed from: U */
    private int f340997U;

    /* renamed from: V */
    private int f340998V;

    /* renamed from: W */
    private int f340999W;

    /* renamed from: X */
    private int f341000X;

    /* renamed from: Y */
    private boolean f341001Y;

    /* renamed from: f */
    public int f341002f;

    /* renamed from: g */
    public String f341003g;

    /* renamed from: h */
    public Bitmap[] f341004h;

    /* renamed from: i */
    public double f341005i;

    /* renamed from: j */
    public double f341006j;

    /* renamed from: k */
    public int f341007k;

    /* renamed from: l */
    public int f341008l;

    /* renamed from: m */
    public float f341009m;

    /* renamed from: n */
    public float f341010n;

    /* renamed from: o */
    public boolean f341011o;

    /* renamed from: p */
    public float f341012p;

    /* renamed from: q */
    public float f341013q;

    /* renamed from: r */
    public float f341014r;

    /* renamed from: s */
    public float f341015s;

    /* renamed from: t */
    public float f341016t;

    /* renamed from: u */
    public float f341017u;

    /* renamed from: v */
    public float f341018v;

    /* renamed from: w */
    public boolean f341019w;

    /* renamed from: x */
    public boolean f341020x;

    /* renamed from: y */
    public boolean f341021y;

    /* renamed from: z */
    public boolean f341022z;

    public C114021ot(C114109qi qiVar) {
        this(qiVar.mo172727a(), qiVar.f341544i, qiVar.f341546k, qiVar.f341547l, qiVar.f341552q, qiVar.f341553r, qiVar.f341545j);
    }

    /* renamed from: A */
    private boolean m158444A() {
        return this.f341001Y;
    }

    /* renamed from: B */
    private int m158445B() {
        return this.f340993C;
    }

    /* renamed from: C */
    private int m158446C() {
        return this.f340994D;
    }

    /* renamed from: a */
    private void m158447a(int i, int i2) {
        if (this.f340997U != i || this.f340998V != i2) {
            this.f340997U = i;
            this.f340998V = i2;
            float f = ((float) this.f341007k) / ((float) i);
            float f2 = ((float) this.f341008l) / ((float) i2);
            this.f340996T = new RectF(f, -f2, 0.0f, -0.0f);
            float f3 = this.f341009m - f;
            this.f341009m = f3;
            float f4 = this.f341010n - f2;
            this.f341010n = f4;
            int i3 = this.f340997U;
            float f5 = ((float) (-i3)) * f3;
            this.f341012p = f5;
            this.f341013q = ((float) i3) + f5;
            int i4 = this.f340998V;
            float f6 = ((float) i4) * f4;
            this.f341014r = f6;
            this.f341015s = f6 - ((float) i4);
        }
    }

    /* renamed from: b */
    private void m158450b(int i, int i2) {
        this.f341007k = i;
        this.f341008l = i2;
        this.f341011o = true;
    }

    /* renamed from: d */
    private void m158453d(boolean z) {
        this.f341011o = z;
    }

    /* renamed from: e */
    private double m158454e() {
        return this.f341005i;
    }

    /* renamed from: f */
    private double m158457f() {
        return this.f341006j;
    }

    /* renamed from: g */
    private boolean m158460g() {
        return this.f341011o;
    }

    /* renamed from: h */
    private boolean m158462h() {
        return this.f341021y;
    }

    /* renamed from: i */
    private String m158463i() {
        return this.f340995S;
    }

    /* renamed from: j */
    private int m158464j() {
        return this.f341002f;
    }

    /* renamed from: k */
    private float m158465k() {
        return this.f341009m;
    }

    /* renamed from: l */
    private float m158466l() {
        return this.f341010n;
    }

    /* renamed from: m */
    private float m158467m() {
        return this.f341016t;
    }

    /* renamed from: n */
    private float m158468n() {
        return this.f341017u;
    }

    /* renamed from: o */
    private float m158469o() {
        return this.f341018v;
    }

    /* renamed from: p */
    private boolean m158470p() {
        return this.f341019w;
    }

    /* renamed from: q */
    private boolean m158471q() {
        return this.f341022z;
    }

    /* renamed from: r */
    private boolean m158472r() {
        return this.f341020x;
    }

    /* renamed from: s */
    private boolean m158473s() {
        return this.f340991A;
    }

    /* renamed from: t */
    private boolean m158474t() {
        return this.f340992B;
    }

    /* renamed from: u */
    private RectF m158475u() {
        return new RectF(this.f340996T);
    }

    /* renamed from: v */
    private String m158476v() {
        return this.f341003g;
    }

    /* renamed from: w */
    private float m158477w() {
        return this.f341012p;
    }

    /* renamed from: x */
    private float m158478x() {
        return this.f341013q;
    }

    /* renamed from: y */
    private float m158479y() {
        return this.f341014r;
    }

    /* renamed from: z */
    private float m158480z() {
        return this.f341015s;
    }

    /* renamed from: b */
    public final boolean mo147884b() {
        return true;
    }

    /* renamed from: c */
    public final void mo172591c(boolean z) {
        this.f340992B = z;
        C113889km.m157545b(C0949kl.f2236f, "setAvoidMarker = ".concat(String.valueOf(z)));
        this.f341011o = true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C114021ot) && this.f341002f == ((C114021ot) obj).f341002f;
    }

    public final int hashCode() {
        return String.valueOf(this.f341002f).hashCode() + C1883v2.CTRL_INDEX;
    }

    /* renamed from: d */
    private void m158452d(int i) {
        this.f340993C = i;
    }

    /* renamed from: e */
    private void m158456e(boolean z) {
        this.f341019w = z;
    }

    /* renamed from: f */
    private void m158458f(boolean z) {
        this.f341022z = z;
    }

    /* renamed from: g */
    private void m158459g(boolean z) {
        this.f341020x = z;
        this.f341011o = true;
    }

    /* renamed from: h */
    private void m158461h(boolean z) {
        this.f341001Y = z;
    }

    /* renamed from: e */
    private void m158455e(int i) {
        this.f340994D = i;
    }

    /* renamed from: d */
    public final synchronized Bitmap mo147886d() {
        return m158451c(this.f341030H);
    }

    /* renamed from: b */
    private void m158449b(float f, float f2) {
        this.f341017u = f;
        this.f341018v = f2;
        this.f341011o = true;
    }

    /* renamed from: c */
    public final String mo147885c() {
        return this.f341003g;
    }

    /* renamed from: c */
    private Bitmap m158451c(int i) {
        Bitmap[] bitmapArr = this.f341004h;
        if (bitmapArr == null) {
            return null;
        }
        if (i < 0 || i >= bitmapArr.length) {
            return bitmapArr[0];
        }
        return bitmapArr[i];
    }

    /* renamed from: b */
    public final void mo172590b(boolean z) {
        this.f340991A = z;
        C113889km.m157545b(C0949kl.f2236f, "setAvoidPoi = ".concat(String.valueOf(z)));
        this.f341011o = true;
    }

    private C114021ot(String str, GeoPoint geoPoint, Bitmap... bitmapArr) {
        this(str, geoPoint, 0.5f, 0.5f, 0, 0, bitmapArr);
    }

    private C114021ot(String str, GeoPoint geoPoint, float f, float f2, Bitmap... bitmapArr) {
        this(str, geoPoint, f, f2, 0, 0, bitmapArr);
    }

    /* renamed from: b */
    public final synchronized void mo172589b(int i) {
        this.f340999W = i;
        this.f341011o = true;
        mo172588a(true);
        Bitmap c = m158451c(i);
        if (c != null) {
            int width = c.getWidth();
            int height = c.getHeight();
            if (!(this.f340997U == width && this.f340998V == height)) {
                m158447a(width, height);
            }
        }
        super.mo172589b(i);
    }

    private C114021ot(String str, GeoPoint geoPoint, float f, float f2, int i, int i2, Bitmap... bitmapArr) {
        this.f340999W = 0;
        this.f341009m = 0.5f;
        this.f341010n = 0.5f;
        this.f341011o = false;
        this.f341012p = 0.0f;
        this.f341013q = 0.0f;
        this.f341014r = 0.0f;
        this.f341015s = 0.0f;
        this.f341016t = 1.0f;
        this.f341000X = 0;
        this.f341017u = 1.0f;
        this.f341018v = 1.0f;
        this.f341019w = false;
        this.f341020x = true;
        this.f341021y = false;
        this.f341022z = true;
        this.f340991A = false;
        this.f340992B = false;
        this.f341001Y = true;
        mo172594a(this);
        this.f341009m = f;
        this.f341010n = f2;
        this.f341007k = i;
        this.f341008l = i2;
        if (geoPoint != null) {
            this.f341005i = ((double) geoPoint.getLongitudeE6()) / 1000000.0d;
            this.f341006j = ((double) geoPoint.getLatitudeE6()) / 1000000.0d;
        }
        mo172587a(str, bitmapArr);
    }

    /* renamed from: a */
    private void m158448a(GeoPoint geoPoint) {
        if (geoPoint != null) {
            double d = this.f341019w ? 1.0d : 1000000.0d;
            this.f341005i = ((double) geoPoint.getLongitudeE6()) / d;
            this.f341006j = ((double) geoPoint.getLatitudeE6()) / d;
            this.f341011o = true;
        }
    }

    /* renamed from: a */
    public final void mo172588a(boolean z) {
        this.f341021y = z;
        if (!z) {
            this.f340995S = this.f341003g;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo172587a(java.lang.String r2, android.graphics.Bitmap... r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r1)
            return
        L_0x0005:
            r0 = 1
            r1.f341011o = r0     // Catch:{ all -> 0x0030 }
            r1.mo172588a((boolean) r0)     // Catch:{ all -> 0x0030 }
            r1.f341003g = r2     // Catch:{ all -> 0x0030 }
            r1.f341004h = r3     // Catch:{ all -> 0x0030 }
            int r2 = r1.f340999W     // Catch:{ all -> 0x0030 }
            if (r2 < 0) goto L_0x0016
            int r0 = r3.length     // Catch:{ all -> 0x0030 }
            if (r2 < r0) goto L_0x0019
        L_0x0016:
            r2 = 0
            r1.f340999W = r2     // Catch:{ all -> 0x0030 }
        L_0x0019:
            int r2 = r1.f340999W     // Catch:{ all -> 0x0030 }
            r2 = r3[r2]     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            int r2 = r2.getWidth()     // Catch:{ all -> 0x0030 }
            int r0 = r1.f340999W     // Catch:{ all -> 0x0030 }
            r3 = r3[r0]     // Catch:{ all -> 0x0030 }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x0030 }
            r1.m158447a((int) r2, (int) r3)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r1)
            return
        L_0x0030:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114021ot.mo172587a(java.lang.String, android.graphics.Bitmap[]):void");
    }

    /* renamed from: a */
    public final void mo172584a(float f, float f2) {
        this.f341009m = f;
        this.f341010n = f2;
        m158447a(this.f340997U, this.f340998V);
        this.f341011o = true;
    }

    /* renamed from: a */
    public final void mo172583a(float f) {
        this.f341016t = f;
        this.f341011o = true;
    }

    /* renamed from: a */
    public final void mo172585a(int i) {
        this.f341000X = i;
        this.f341011o = true;
    }

    /* renamed from: a */
    public final float mo172582a() {
        return (float) (this.f341001Y ? 360 - this.f341000X : this.f341000X);
    }

    /* renamed from: a */
    public final void mo172586a(C114109qi qiVar) {
        mo172583a(qiVar.f341548m);
        mo172584a(qiVar.f341546k, qiVar.f341547l);
        mo172585a(qiVar.f341550o);
        this.f341019w = qiVar.f341556u;
        this.f341022z = qiVar.f341557v;
        mo172590b(qiVar.f341559x);
        mo172591c(qiVar.f341560y);
        this.f341001Y = qiVar.f341561z;
        this.f341020x = qiVar.f341549n;
        this.f341011o = true;
        this.f340993C = qiVar.f341555t;
        this.f340994D = qiVar.f341554s;
    }
}
