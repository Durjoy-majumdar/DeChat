package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;

/* renamed from: com.tencent.mapsdk.internal.sn */
public final class C114211sn extends C113831iz {

    /* renamed from: b */
    public static final long f341950b = 500;

    /* renamed from: c */
    public static final int f341951c = 10000;

    /* renamed from: I */
    public int f341952I = 0;

    /* renamed from: J */
    public int f341953J = 0;

    /* renamed from: K */
    public int f341954K = 0;

    /* renamed from: L */
    public int f341955L = 0;

    /* renamed from: M */
    public boolean f341956M = false;

    /* renamed from: N */
    public boolean f341957N = false;

    /* renamed from: O */
    public boolean f341958O = false;

    /* renamed from: P */
    public double f341959P = 0.0d;

    /* renamed from: Q */
    public boolean f341960Q = false;

    /* renamed from: R */
    public int f341961R = 0;

    /* renamed from: S */
    public int f341962S = 0;

    /* renamed from: T */
    public boolean f341963T = false;

    /* renamed from: U */
    public int f341964U = 0;

    /* renamed from: V */
    public int f341965V = 0;

    /* renamed from: W */
    public int f341966W = 0;

    /* renamed from: X */
    public int f341967X = 0;

    /* renamed from: Y */
    public int f341968Y = 0;

    /* renamed from: Z */
    public int f341969Z = 0;

    /* renamed from: a */
    public C114214a f341970a = null;

    /* renamed from: aa */
    public int f341971aa = 0;

    /* renamed from: ab */
    public int f341972ab = 0;

    /* renamed from: ac */
    public boolean f341973ac = false;

    /* renamed from: ad */
    public float f341974ad = 0.0f;

    /* renamed from: ae */
    public float f341975ae = 0.0f;

    /* renamed from: af */
    public float f341976af = 0.0f;

    /* renamed from: ag */
    public float f341977ag = 0.0f;

    /* renamed from: ah */
    public boolean f341978ah = false;

    /* renamed from: ai */
    public float f341979ai = 0.0f;

    /* renamed from: aj */
    public float f341980aj = 0.0f;

    /* renamed from: ak */
    public float f341981ak = 0.0f;

    /* renamed from: al */
    public float f341982al = 0.0f;

    /* renamed from: am */
    private final Runnable f341983am = new Runnable() {
        public final void run() {
            if (C114211sn.this.f341999f != null) {
                C114211sn.this.f341999f.onFinish();
            }
        }
    };

    /* renamed from: an */
    private final Runnable f341984an = new Runnable() {
        public final void run() {
            if (C114211sn.this.f341999f != null) {
                C114211sn.this.f341999f.onCancel();
            }
        }
    };

    /* renamed from: ao */
    private boolean f341985ao = false;

    /* renamed from: ap */
    private Interpolator f341986ap = new LinearInterpolator();

    /* renamed from: aq */
    private boolean f341987aq = false;

    /* renamed from: ar */
    private int f341988ar = 0;

    /* renamed from: as */
    private int f341989as = 0;

    /* renamed from: at */
    private boolean f341990at = false;

    /* renamed from: au */
    private float f341991au = 0.0f;

    /* renamed from: av */
    private float f341992av = 0.0f;

    /* renamed from: aw */
    private double f341993aw = 0.0d;

    /* renamed from: ax */
    private double f341994ax = 0.0d;

    /* renamed from: ay */
    private double f341995ay = 0.0d;

    /* renamed from: az */
    private double f341996az = 1.0d;

    /* renamed from: d */
    public long f341997d = 500;

    /* renamed from: e */
    public long f341998e = 0;

    /* renamed from: f */
    public TencentMap.CancelableCallback f341999f = null;

    /* renamed from: g */
    public boolean f342000g = false;

    /* renamed from: h */
    public boolean f342001h = false;

    /* renamed from: com.tencent.mapsdk.internal.sn$a */
    public interface C114214a {
        /* renamed from: a */
        float mo171656a();

        /* renamed from: a */
        void mo171657a(Runnable runnable);

        /* renamed from: b */
        int mo171658b();

        /* renamed from: c */
        GeoPoint mo171659c();

        /* renamed from: d */
        float mo171660d();

        /* renamed from: e */
        float mo171661e();

        /* renamed from: f */
        float mo171662f();

        /* renamed from: g */
        GeoPoint mo171663g();

        /* renamed from: h */
        boolean mo171664h();
    }

    public C114211sn() {
        super(10000, (double[]) null);
    }

    /* renamed from: c */
    private static long m159657c() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: d */
    private boolean m159659d() {
        return this.f342001h;
    }

    /* renamed from: e */
    private static float m159660e(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    /* renamed from: e */
    private int m159661e() {
        return this.f341954K;
    }

    /* renamed from: f */
    private static float m159662f(float f) {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        if (f2 > 45.0f) {
            return 45.0f;
        }
        return f2;
    }

    /* renamed from: f */
    private int m159663f() {
        return this.f341955L;
    }

    /* renamed from: g */
    private boolean m159664g() {
        return this.f341957N || this.f341956M || this.f341958O;
    }

    /* renamed from: h */
    private float m159665h() {
        return (float) this.f341959P;
    }

    /* renamed from: i */
    private boolean m159666i() {
        return this.f341960Q;
    }

    /* renamed from: j */
    private int m159667j() {
        return this.f341961R;
    }

    /* renamed from: k */
    private int m159668k() {
        return this.f341962S;
    }

    /* renamed from: l */
    private boolean m159669l() {
        return this.f341963T;
    }

    /* renamed from: m */
    private int m159670m() {
        return this.f341971aa;
    }

    /* renamed from: n */
    private int m159671n() {
        return this.f341972ab;
    }

    /* renamed from: o */
    private float m159672o() {
        return this.f341977ag;
    }

    /* renamed from: p */
    private boolean m159673p() {
        return this.f341973ac;
    }

    /* renamed from: q */
    private boolean m159674q() {
        return this.f341978ah;
    }

    /* renamed from: r */
    private float m159675r() {
        return this.f341982al;
    }

    /* renamed from: s */
    private void m159676s() {
        this.f342000g = true;
    }

    /* renamed from: t */
    private boolean m159677t() {
        return this.f342000g;
    }

    /* renamed from: b */
    public final void mo172885b(float f) {
        if (f != 0.0f) {
            this.f341992av = f;
            this.f341957N = true;
        }
    }

    /* renamed from: a */
    private void m159655a(C114214a aVar) {
        this.f341970a = aVar;
    }

    /* renamed from: c */
    private void m159658c(int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.f342001h = false;
        }
        this.f341952I = i;
        this.f341953J = i2;
        this.f342001h = true;
    }

    /* renamed from: d */
    public final void mo172888d(float f) {
        this.f341979ai = m159662f(f);
        this.f341978ah = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        if (r0 > 1.0f) goto L_0x012b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171260a() {
        /*
            r12 = this;
            boolean r0 = r12.f341985ao
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0115
            r12.f341985ao = r2
            boolean r0 = r12.f342001h
            if (r0 == 0) goto L_0x0010
            r12.f341988ar = r1
            r12.f341989as = r1
        L_0x0010:
            boolean r0 = r12.f341956M
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = 1101004800(0x41a00000, float:20.0)
            if (r0 != 0) goto L_0x0022
            boolean r0 = r12.f341957N
            if (r0 != 0) goto L_0x0022
            boolean r0 = r12.f341958O
            if (r0 == 0) goto L_0x0033
        L_0x0022:
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            float r0 = r0.mo171662f()
            float r0 = r7 - r0
            double r8 = (double) r0
            double r8 = java.lang.Math.pow(r3, r8)
            double r8 = r5 / r8
            r12.f341994ax = r8
        L_0x0033:
            boolean r0 = r12.f341956M
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            if (r0 == 0) goto L_0x0080
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            boolean r0 = r0.mo171664h()
            if (r0 == 0) goto L_0x0047
            r0 = 22
            goto L_0x0049
        L_0x0047:
            r0 = 20
        L_0x0049:
            com.tencent.mapsdk.internal.sn$a r10 = r12.f341970a
            if (r10 == 0) goto L_0x0055
            int r10 = r10.mo171658b()
            int r0 = java.lang.Math.min(r10, r0)
        L_0x0055:
            float r10 = r12.f341991au
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x005e
            r12.f341991au = r0
        L_0x005e:
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            if (r0 == 0) goto L_0x0074
            float r0 = r0.mo171662f()
            float r10 = r12.f341991au
            float r10 = r10 - r0
            float r0 = java.lang.Math.abs(r10)
            double r10 = (double) r0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r12.f341990at = r2
        L_0x0074:
            float r0 = r12.f341991au
            float r7 = r7 - r0
            double r7 = (double) r7
            double r3 = java.lang.Math.pow(r3, r7)
            double r5 = r5 / r3
            r12.f341993aw = r5
            goto L_0x00a3
        L_0x0080:
            boolean r0 = r12.f341957N
            if (r0 == 0) goto L_0x00a3
            float r0 = r12.f341992av
            float r0 = java.lang.Math.abs(r0)
            double r10 = (double) r0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            r12.f341990at = r2
        L_0x0091:
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            float r0 = r0.mo171662f()
            float r8 = r12.f341992av
            float r0 = r0 + r8
            float r7 = r7 - r0
            double r7 = (double) r7
            double r3 = java.lang.Math.pow(r3, r7)
            double r5 = r5 / r3
            r12.f341993aw = r5
        L_0x00a3:
            boolean r0 = r12.f341963T
            if (r0 == 0) goto L_0x00d2
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            if (r0 == 0) goto L_0x00d2
            boolean r3 = r12.f342000g
            if (r3 != r2) goto L_0x00b4
            com.tencent.map.lib.models.GeoPoint r0 = r0.mo171663g()
            goto L_0x00b8
        L_0x00b4:
            com.tencent.map.lib.models.GeoPoint r0 = r0.mo171659c()
        L_0x00b8:
            if (r0 == 0) goto L_0x00d2
            int r3 = r0.getLatitudeE6()
            r12.f341966W = r3
            int r0 = r0.getLongitudeE6()
            r12.f341967X = r0
            int r3 = r12.f341964U
            int r4 = r12.f341966W
            int r3 = r3 - r4
            r12.f341968Y = r3
            int r3 = r12.f341965V
            int r3 = r3 - r0
            r12.f341969Z = r3
        L_0x00d2:
            boolean r0 = r12.f341973ac
            if (r0 == 0) goto L_0x00fc
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            if (r0 == 0) goto L_0x00e0
            float r0 = r0.mo171660d()
            r12.f341975ae = r0
        L_0x00e0:
            float r0 = r12.f341974ad
            float r3 = r12.f341975ae
            float r0 = r0 - r3
            r12.f341976af = r0
            r3 = 1127481344(0x43340000, float:180.0)
            r4 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f3
            float r0 = r0 - r4
            r12.f341976af = r0
            goto L_0x00fc
        L_0x00f3:
            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00fc
            float r0 = r0 + r4
            r12.f341976af = r0
        L_0x00fc:
            boolean r0 = r12.f341978ah
            if (r0 == 0) goto L_0x010f
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            if (r0 == 0) goto L_0x010f
            float r0 = r0.mo171661e()
            r12.f341980aj = r0
            float r3 = r12.f341979ai
            float r3 = r3 - r0
            r12.f341981ak = r3
        L_0x010f:
            long r3 = android.os.SystemClock.uptimeMillis()
            r12.f341998e = r3
        L_0x0115:
            boolean r0 = r12.f341987aq
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x012b
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = r12.f341998e
            long r4 = r4 - r6
            float r0 = (float) r4
            long r4 = r12.f341997d
            float r4 = (float) r4
            float r0 = r0 / r4
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x012d
        L_0x012b:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x012d:
            android.view.animation.Interpolator r4 = r12.f341986ap
            float r4 = r4.getInterpolation(r0)
            r12.f341987aq = r2
            boolean r5 = r12.f342001h
            if (r5 == 0) goto L_0x0165
            int r5 = r12.f341952I
            float r6 = (float) r5
            float r6 = r6 * r4
            int r6 = (int) r6
            int r7 = r12.f341953J
            float r7 = (float) r7
            float r7 = r7 * r4
            int r7 = (int) r7
            int r8 = r12.f341988ar
            int r8 = r6 - r8
            int r9 = r12.f341989as
            int r9 = r7 - r9
            r12.f341988ar = r6
            r12.f341989as = r7
            r12.f341954K = r8
            r12.f341955L = r9
            int r5 = java.lang.Math.abs(r5)
            if (r5 > 0) goto L_0x0163
            int r5 = r12.f341953J
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L_0x0165
        L_0x0163:
            r12.f341987aq = r1
        L_0x0165:
            boolean r5 = r12.f341956M
            if (r5 != 0) goto L_0x0171
            boolean r5 = r12.f341957N
            if (r5 != 0) goto L_0x0171
            boolean r5 = r12.f341958O
            if (r5 == 0) goto L_0x0182
        L_0x0171:
            double r5 = r12.f341994ax
            double r7 = r12.f341993aw
            double r7 = r7 - r5
            double r9 = (double) r4
            double r7 = r7 * r9
            double r5 = r5 + r7
            r12.f341959P = r5
            boolean r5 = r12.f341990at
            if (r5 != 0) goto L_0x0182
            r12.f341987aq = r1
        L_0x0182:
            boolean r5 = r12.f341963T
            if (r5 == 0) goto L_0x01ac
            int r5 = r12.f341966W
            int r6 = r12.f341968Y
            float r7 = (float) r6
            float r7 = r7 * r4
            int r7 = (int) r7
            int r5 = r5 + r7
            r12.f341971aa = r5
            int r5 = r12.f341967X
            int r7 = r12.f341969Z
            float r7 = (float) r7
            float r7 = r7 * r4
            int r7 = (int) r7
            int r5 = r5 + r7
            r12.f341972ab = r5
            int r5 = java.lang.Math.abs(r6)
            if (r5 > r2) goto L_0x01aa
            int r5 = r12.f341969Z
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= r2) goto L_0x01ac
        L_0x01aa:
            r12.f341987aq = r1
        L_0x01ac:
            boolean r5 = r12.f341973ac
            if (r5 == 0) goto L_0x01c3
            float r5 = r12.f341975ae
            float r6 = r12.f341976af
            float r7 = r6 * r4
            float r5 = r5 + r7
            r12.f341977ag = r5
            float r5 = java.lang.Math.abs(r6)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01c3
            r12.f341987aq = r1
        L_0x01c3:
            boolean r5 = r12.f341978ah
            if (r5 == 0) goto L_0x01da
            float r5 = r12.f341980aj
            float r6 = r12.f341981ak
            float r4 = r4 * r6
            float r5 = r5 + r4
            r12.f341982al = r5
            float r4 = java.lang.Math.abs(r6)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x01da
            r12.f341987aq = r1
        L_0x01da:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01ec
            com.tencent.tencentmap.mapsdk.maps.TencentMap$CancelableCallback r0 = r12.f341999f
            if (r0 == 0) goto L_0x01eb
            com.tencent.mapsdk.internal.sn$a r0 = r12.f341970a
            if (r0 == 0) goto L_0x01eb
            java.lang.Runnable r1 = r12.f341983am
            r0.mo171657a(r1)
        L_0x01eb:
            return r2
        L_0x01ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114211sn.mo171260a():boolean");
    }

    /* renamed from: b */
    public final void mo172886b(int i, int i2) {
        this.f341964U = i;
        this.f341965V = i2;
        this.f341963T = true;
    }

    /* renamed from: b */
    public final void mo172219b() {
        C114214a aVar;
        super.mo172219b();
        this.f341987aq = true;
        if (this.f341999f != null && (aVar = this.f341970a) != null) {
            aVar.mo171657a(this.f341984an);
        }
    }

    /* renamed from: c */
    public final void mo172887c(float f) {
        this.f341974ad = m159660e(f);
        this.f341973ac = true;
    }

    /* renamed from: a */
    public final void mo172882a(float f) {
        if (f > 0.0f) {
            this.f341991au = f;
            this.f341956M = true;
        }
    }

    /* renamed from: a */
    private void m159654a(double d) {
        this.f341993aw = d;
        this.f341958O = true;
    }

    /* renamed from: a */
    public final void mo172883a(int i, int i2) {
        this.f341961R = i;
        this.f341962S = i2;
        this.f341960Q = true;
    }

    /* renamed from: a */
    private void m159656a(TencentMap.CancelableCallback cancelableCallback) {
        this.f341999f = cancelableCallback;
    }

    /* renamed from: a */
    public final void mo172884a(long j) {
        this.f341997d = j;
    }
}
