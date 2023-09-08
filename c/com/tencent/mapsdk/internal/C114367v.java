package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.C113961mq;
import com.tencent.tencentmap.mapsdk.maps.MapParamConstants;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.v */
public final class C114367v implements Cloneable {

    /* renamed from: a */
    public int f342782a = 0;

    /* renamed from: b */
    public C114369a f342783b = new C114369a();

    /* renamed from: c */
    public Rect f342784c = new Rect();

    /* renamed from: d */
    public int f342785d;

    /* renamed from: e */
    public double f342786e;

    /* renamed from: f */
    public double f342787f;

    /* renamed from: g */
    public double f342788g = 0.0d;

    /* renamed from: h */
    public double f342789h = 1.0d;

    /* renamed from: i */
    public double f342790i = 0.0d;

    /* renamed from: j */
    public double f342791j = 1.0d;

    /* renamed from: k */
    public double f342792k = 0.0d;

    /* renamed from: l */
    public double f342793l = 1.0d;

    /* renamed from: m */
    public GeoPoint f342794m = new GeoPoint();

    /* renamed from: n */
    public Rect f342795n;

    /* renamed from: o */
    public C113961mq f342796o;

    /* renamed from: p */
    public C114216sq f342797p;

    /* renamed from: q */
    public C113732fo f342798q = new C113732fo();

    /* renamed from: r */
    public C114370b f342799r;

    /* renamed from: s */
    public boolean f342800s = false;

    /* renamed from: com.tencent.mapsdk.internal.v$1 */
    public static /* synthetic */ class C1143681 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f342801a;

        static {
            int[] iArr = new int[C113744fy.m156911a().length];
            f342801a = iArr;
            try {
                iArr[C113744fy.f340316c - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.v$a */
    public static class C114369a implements Cloneable {

        /* renamed from: a */
        public static final int f342802a = 20;

        /* renamed from: b */
        public static final int f342803b = 20;

        /* renamed from: c */
        public static final int f342804c = 20;

        /* renamed from: d */
        public static final int f342805d = 19;

        /* renamed from: e */
        public static final int f342806e = 22;

        /* renamed from: f */
        public static final int f342807f = 16;

        /* renamed from: g */
        public static final int f342808g = 3;

        /* renamed from: h */
        public static final float f342809h = 1.6f;

        /* renamed from: i */
        public static final float f342810i = 0.8f;

        /* renamed from: j */
        public static final float f342811j = 4.0f;

        /* renamed from: k */
        public static final float f342812k = 3.0517578E-5f;

        /* renamed from: r */
        public static final int f342813r = 20;

        /* renamed from: s */
        public static final int f342814s = 1;

        /* renamed from: t */
        public static final float f342815t = 1.9073486E-6f;

        /* renamed from: l */
        public float f342816l = 3.0517578E-5f;

        /* renamed from: m */
        public float f342817m = 4.0f;

        /* renamed from: n */
        public int f342818n = 3;

        /* renamed from: o */
        public int f342819o = 20;

        /* renamed from: p */
        public float f342820p;

        /* renamed from: q */
        public int f342821q;

        /* renamed from: a */
        public static float m160574a(int i) {
            return ((float) (1 << (i - 1))) * 1.9073486E-6f;
        }

        /* renamed from: a */
        private void m160575a(float f) {
            this.f342820p = f;
        }

        /* renamed from: c */
        private int m160581c() {
            return this.f342821q;
        }

        /* renamed from: d */
        private int m160583d() {
            return this.f342818n;
        }

        /* renamed from: e */
        private int m160584e() {
            return this.f342819o;
        }

        /* renamed from: f */
        private static int m160585f() {
            return 20;
        }

        /* renamed from: g */
        private float m160586g() {
            return this.f342816l;
        }

        public final Object clone() {
            return super.clone();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C114369a)) {
                return false;
            }
            C114369a aVar = (C114369a) obj;
            return this.f342820p == aVar.f342820p && this.f342821q == aVar.f342821q;
        }

        public final int hashCode() {
            return toString().hashCode();
        }

        public final String toString() {
            return "scale:" + this.f342820p + ", scaleLevel:" + this.f342821q;
        }

        /* renamed from: b */
        private void m160579b(float f) {
            C114369a aVar = new C114369a();
            this.f342818n = aVar.f342821q;
            this.f342816l = f / aVar.mo173072a();
        }

        /* renamed from: c */
        private void m160582c(int i) {
            this.f342818n = i;
        }

        /* renamed from: a */
        public final void mo173073a(int i, float f) {
            this.f342820p = f;
            this.f342821q = i;
        }

        /* renamed from: a */
        private void m160576a(C114369a aVar) {
            this.f342816l = aVar.f342816l;
            this.f342817m = aVar.f342817m;
            this.f342818n = aVar.f342818n;
            this.f342819o = aVar.f342819o;
            this.f342820p = aVar.f342820p;
            this.f342821q = aVar.f342821q;
        }

        /* renamed from: b */
        private float m160577b() {
            return this.f342820p;
        }

        /* renamed from: b */
        private void m160580b(int i) {
            this.f342819o = i;
        }

        /* renamed from: a */
        public final float mo173072a() {
            return this.f342820p / m160574a(this.f342821q);
        }
    }

    public C114367v(C113961mq mqVar) {
        this.f342796o = mqVar;
        this.f342797p = mqVar.f340899g;
    }

    /* renamed from: a */
    private void m160523a(C114367v vVar) {
        this.f342782a = vVar.f342782a;
        C114369a aVar = this.f342783b;
        C114369a aVar2 = vVar.f342783b;
        aVar.f342816l = aVar2.f342816l;
        aVar.f342817m = aVar2.f342817m;
        aVar.f342818n = aVar2.f342818n;
        aVar.f342819o = aVar2.f342819o;
        aVar.f342820p = aVar2.f342820p;
        aVar.f342821q = aVar2.f342821q;
        this.f342784c.set(vVar.f342784c);
        this.f342785d = vVar.f342785d;
        this.f342786e = vVar.f342786e;
        this.f342787f = vVar.f342787f;
        this.f342788g = vVar.f342788g;
        this.f342789h = vVar.f342789h;
        this.f342790i = vVar.f342790i;
        this.f342791j = vVar.f342791j;
        this.f342792k = vVar.f342792k;
        this.f342793l = vVar.f342793l;
        this.f342794m.setGeoPoint(vVar.f342794m);
        C113732fo foVar = this.f342798q;
        C113732fo foVar2 = vVar.f342798q;
        foVar.mo172083a(foVar2.f340215a, foVar2.f340216b);
        this.f342795n = vVar.f342795n;
    }

    /* renamed from: b */
    private void m160527b() {
        if (this.f342796o != null) {
            this.f342794m = this.f342797p.mo172953o();
            int q = this.f342797p.mo172955q();
            float p = this.f342797p.mo172954p();
            C114369a aVar = this.f342783b;
            if (q != aVar.f342821q) {
                this.f342796o.f340901i.mo171238c(C113744fy.f340316c);
            } else if (p != aVar.f342820p) {
                this.f342796o.f340901i.mo171238c(C113744fy.f340315b);
            }
            if (this.f342783b != null) {
                float d = m160533d(p);
                if (d < mo173058a()) {
                    float f = m160538f(d);
                    if (this.f342797p.mo172956r() > f) {
                        mo173064b(f);
                    }
                }
                this.f342783b.mo173073a(q, p);
            }
            this.f342782a = this.f342797p.mo172959u();
        }
    }

    /* renamed from: b */
    public static boolean m160528b(int i) {
        return i == 8 || i == 13 || i == 10;
    }

    /* renamed from: c */
    private int m160531c() {
        C114216sq sqVar = this.f342797p;
        if (sqVar == null) {
            return this.f342782a;
        }
        return sqVar.mo172959u();
    }

    /* renamed from: d */
    private float m160532d() {
        return this.f342797p.mo172957s();
    }

    /* renamed from: e */
    private double m160535e() {
        return this.f342788g;
    }

    /* renamed from: f */
    private double m160537f() {
        return this.f342789h;
    }

    /* renamed from: f */
    public static float m160538f(float f) {
        if (f < 16.0f) {
            return 40.0f;
        }
        if (f >= 16.0f && f < 17.0f) {
            return ((f - 16.0f) * 10.0f) + 40.0f;
        }
        if (f >= 17.0f && f < 18.0f) {
            return ((f - 17.0f) * 10.0f) + 50.0f;
        }
        if (f < 18.0f || f >= 19.0f) {
            return 75.0f;
        }
        return ((f - 18.0f) * 15.0f) + 60.0f;
    }

    /* renamed from: g */
    private double m160540g() {
        return this.f342790i;
    }

    /* renamed from: h */
    private double m160543h() {
        return this.f342791j;
    }

    /* renamed from: i */
    private double m160545i() {
        return this.f342793l;
    }

    /* renamed from: j */
    private double m160547j() {
        return this.f342792k;
    }

    /* renamed from: k */
    private float m160548k() {
        return this.f342797p.mo172956r();
    }

    /* renamed from: l */
    private int m160549l() {
        return this.f342785d;
    }

    /* renamed from: m */
    private double m160550m() {
        return this.f342786e;
    }

    /* renamed from: n */
    private double m160551n() {
        return this.f342787f;
    }

    /* renamed from: o */
    private float m160552o() {
        return this.f342783b.f342820p;
    }

    /* renamed from: p */
    private int m160553p() {
        return this.f342783b.f342821q;
    }

    /* renamed from: q */
    private float m160554q() {
        return this.f342783b.mo173072a();
    }

    /* renamed from: r */
    private int m160555r() {
        return this.f342783b.f342818n;
    }

    /* renamed from: s */
    private int m160556s() {
        return this.f342783b.f342819o;
    }

    /* renamed from: t */
    private static int m160557t() {
        return 20;
    }

    /* renamed from: u */
    private float m160558u() {
        return this.f342783b.f342816l;
    }

    /* renamed from: v */
    private GeoPoint m160559v() {
        return this.f342794m;
    }

    /* renamed from: w */
    private Rect m160560w() {
        return this.f342795n;
    }

    /* renamed from: x */
    private C113732fo m160561x() {
        return this.f342798q;
    }

    /* renamed from: y */
    private C114370b m160562y() {
        return this.f342799r;
    }

    /* renamed from: z */
    private static byte[] m160563z() {
        return null;
    }

    public final Object clone() {
        C114367v vVar = (C114367v) super.clone();
        vVar.f342784c = new Rect(this.f342784c);
        vVar.f342783b = (C114369a) this.f342783b.clone();
        vVar.f342794m = new GeoPoint(this.f342794m);
        C113732fo foVar = this.f342798q;
        vVar.f342798q = new C113732fo(foVar.f340215a, foVar.f340216b);
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C114367v)) {
            return false;
        }
        C114367v vVar = (C114367v) obj;
        return vVar.f342794m.equals(this.f342794m) && vVar.f342783b.equals(this.f342783b) && vVar.f342782a == this.f342782a;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GeoPoint geoPoint = this.f342794m;
        sb.append("mapParam: ");
        sb.append("center:" + geoPoint.toString() + " ");
        sb.append("mode:" + this.f342782a + " ");
        sb.append("mapScale:" + this.f342783b.toString() + " ");
        StringBuilder sb4 = new StringBuilder("screenRect:");
        Rect rect = this.f342795n;
        sb4.append(rect != null ? rect.toString() : "null");
        sb4.append(" ");
        sb.append(sb4.toString());
        return sb.toString();
    }

    /* renamed from: com.tencent.mapsdk.internal.v$b */
    public static class C114370b {

        /* renamed from: a */
        public float f342822a;

        /* renamed from: b */
        public float f342823b;

        public C114370b(float f, float f2) {
            this.f342822a = f;
            this.f342823b = f2;
        }

        /* renamed from: a */
        private void m160590a(float f, float f2) {
            this.f342822a = f;
            this.f342823b = f2;
        }

        /* renamed from: b */
        private float m160591b() {
            return this.f342823b;
        }

        /* renamed from: a */
        private float m160589a() {
            return this.f342822a;
        }
    }

    /* renamed from: d */
    private void m160534d(int i) {
        double d = (double) ((1 << i) * 256);
        this.f342785d = (int) d;
        this.f342786e = d / 360.0d;
        this.f342787f = d / 6.283185307179586d;
    }

    /* renamed from: e */
    private static float m160536e(int i) {
        return C114369a.m160574a(i);
    }

    /* renamed from: f */
    private void m160539f(int i) {
        this.f342783b.f342819o = i;
    }

    /* renamed from: g */
    private int m160541g(float f) {
        C114216sq sqVar = this.f342797p;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a((double) f) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                        C114216sq.this.f342023d.nativeSetScale(C114216sq.this.f342024e, r2, false);
                    }
                }
            });
        }
        this.f342783b.f342820p = f;
        return C113744fy.f340316c;
    }

    /* renamed from: h */
    private void m160544h(float f) {
        float d = m160533d(f);
        if (d < mo173058a()) {
            float f2 = m160538f(d);
            if (this.f342797p.mo172956r() > f2) {
                mo173064b(f2);
            }
        }
    }

    /* renamed from: i */
    private void m160546i(float f) {
        if (this.f342800s) {
            MapParamConstants.MAX_SKEW_ANGLE = m160538f(f);
        } else {
            MapParamConstants.MAX_SKEW_ANGLE = 40.0f;
        }
    }

    /* renamed from: e */
    public final void mo173068e(float f) {
        C114369a aVar = this.f342783b;
        C114369a aVar2 = new C114369a();
        aVar.f342818n = aVar2.f342821q;
        aVar.f342816l = f / aVar2.mo173072a();
    }

    /* renamed from: c */
    public final int mo173065c(float f) {
        float f2;
        int i;
        C113961mq mqVar;
        int i2 = C113744fy.f340314a;
        C114369a aVar = this.f342783b;
        float f3 = aVar.f342820p;
        int i3 = aVar.f342821q;
        C114216sq sqVar = this.f342797p;
        if (sqVar != null) {
            double d = (double) f;
            if (!(0 == sqVar.f342024e || (mqVar = sqVar.f342029j) == null)) {
                mqVar.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(d) {

                    /* renamed from: b */
                    public final /* synthetic */ boolean f342265b = false;

                    /* renamed from: a */
                    public final void mo54067a(GL10 gl10) {
                        if (C114216sq.this.f342024e != 0) {
                            C114216sq.this.f342023d.nativeSetScale(C114216sq.this.f342024e, r6, this.f342265b);
                        }
                    }
                });
            }
            f2 = this.f342797p.mo172954p();
            i = this.f342797p.mo172955q();
        } else {
            i = i3;
            f2 = f3;
        }
        this.f342783b.mo173073a(i, f2);
        if (i != i3) {
            i2 = C113744fy.f340316c;
        } else if (f2 != f3) {
            i2 = C113744fy.f340315b;
        }
        if (C1143681.f342801a[i2 - 1] == 1) {
            double d2 = (double) ((1 << this.f342783b.f342821q) * 256);
            this.f342785d = (int) d2;
            this.f342786e = d2 / 360.0d;
            this.f342787f = d2 / 6.283185307179586d;
        }
        C113732fo a = C114373y.m160621a(this, this.f342794m);
        this.f342798q.mo172083a(a.f340215a, a.f340216b);
        return i2;
    }

    /* renamed from: d */
    public static float m160533d(float f) {
        return ((float) (Math.log((double) f) / Math.log(2.0d))) + 20.0f;
    }

    /* renamed from: g */
    private void m160542g(int i) {
        this.f342783b.f342818n = i;
    }

    /* renamed from: a */
    private void m160522a(Rect rect, int i, int i2) {
        this.f342795n = rect;
        this.f342784c = GeometryConstants.BOUNDARY_WORLD;
        mo173066c(13);
        mo173062a(0);
        mo173063a(i, i2, false);
    }

    /* renamed from: b */
    public final float mo173064b(float f) {
        if (this.f342797p.mo172956r() == f) {
            return f;
        }
        m160546i(mo173058a());
        float max = Math.max(0.0f, Math.min(MapParamConstants.MAX_SKEW_ANGLE, f));
        double radians = Math.toRadians((double) f);
        this.f342790i = Math.sin(radians);
        this.f342791j = Math.cos(radians);
        double d = 1.5707963267948966d - radians;
        this.f342793l = Math.cos(d);
        this.f342792k = Math.sin(d);
        C114216sq sqVar = this.f342797p;
        if (sqVar != null) {
            sqVar.mo172925b(max);
        }
        return max;
    }

    /* renamed from: c */
    public final boolean mo173066c(int i) {
        return mo173065c(C114369a.m160574a(i)) == C113744fy.f340316c;
    }

    /* renamed from: a */
    public final boolean mo173062a(int i) {
        int u;
        C114216sq sqVar = this.f342797p;
        if (sqVar == null || (u = sqVar.mo172959u()) == i) {
            return false;
        }
        if (u == 11) {
            this.f342796o.mo172450b(false);
        }
        if (i == 11) {
            this.f342796o.mo172450b(true);
        }
        this.f342782a = i;
        this.f342797p.mo172934c(i);
        this.f342797p.mo172938d(m160528b(i));
        C113889km.m157545b(C0949kl.f2236f, "setMapStyle : styleId[" + i + "]");
        C113961mq mqVar = this.f342796o;
        if (mqVar.f340909q) {
            mqVar.mo172410B();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m160530b(GeoPoint geoPoint) {
        int i;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i2 = 1 << (20 - this.f342783b.f342821q);
        int i3 = 0;
        if (131072 > i2) {
            i3 = ((this.f342795n.width() * 131072) - (this.f342795n.width() * i2)) / 2;
            i = ((this.f342795n.height() * 131072) - (this.f342795n.height() * i2)) / 2;
        } else {
            i = 0;
        }
        Rect rect = this.f342784c;
        int i4 = rect.left - i3;
        int i5 = rect.right + i3;
        int i6 = rect.top - i;
        int i7 = rect.bottom + i;
        if (latitudeE6 < i6) {
            latitudeE6 = i6;
        }
        if (latitudeE6 <= i7) {
            i7 = latitudeE6;
        }
        if (longitudeE6 < i4) {
            longitudeE6 = i4;
        }
        if (longitudeE6 <= i5) {
            i5 = longitudeE6;
        }
        GeoPoint geoPoint2 = new GeoPoint(i7, i5);
        C114216sq sqVar = this.f342797p;
        sqVar.f342029j.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(geoPoint2) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, geoPoint, false);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public final float mo173059a(float f) {
        if (this.f342797p.mo172957s() == f) {
            return f;
        }
        float f2 = f % 360.0f;
        double radians = Math.toRadians((double) f);
        this.f342788g = Math.sin(radians);
        this.f342789h = Math.cos(radians);
        C114216sq sqVar = this.f342797p;
        if (sqVar != null) {
            sqVar.mo172914a((C113961mq.C113963a) new C113961mq.C113963a(f2) {
                /* renamed from: a */
                public final void mo54067a(GL10 gl10) {
                    if (0 != C114216sq.this.f342024e) {
                        C114216sq.this.f342023d.nativeSetRotate(C114216sq.this.f342024e, f, false);
                    }
                }
            });
        }
        return f2;
    }

    /* renamed from: a */
    public final float mo173058a() {
        return m160533d(this.f342783b.f342820p);
    }

    /* renamed from: b */
    private boolean m160529b(int i, int i2) {
        int i3;
        int i4 = 1 << (20 - this.f342783b.f342821q);
        int i5 = 0;
        if (131072 > i4) {
            i5 = ((this.f342795n.width() * 131072) - (this.f342795n.width() * i4)) / 2;
            i3 = ((this.f342795n.height() * 131072) - (this.f342795n.height() * i4)) / 2;
        } else {
            i3 = 0;
        }
        Rect rect = this.f342784c;
        int i6 = rect.left - i5;
        int i7 = rect.right + i5;
        int i8 = rect.top - i3;
        int i9 = rect.bottom + i3;
        if (i < i8) {
            i = i8;
        }
        if (i <= i9) {
            i9 = i;
        }
        if (i2 < i6) {
            i2 = i6;
        }
        if (i2 <= i7) {
            i7 = i2;
        }
        GeoPoint geoPoint = new GeoPoint(i9, i7);
        C114216sq sqVar = this.f342797p;
        sqVar.f342029j.mo172432a((C113961mq.C113963a) new C113961mq.C113963a(geoPoint) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (0 != C114216sq.this.f342024e && C114216sq.this.f342029j != null) {
                    C114216sq.this.f342023d.nativeSetCenter(C114216sq.this.f342024e, geoPoint, false);
                }
            }
        });
        return true;
    }

    /* renamed from: a */
    public final void mo173060a(Rect rect) {
        this.f342784c.set(rect);
    }

    /* renamed from: a */
    private boolean m160526a(GeoPoint geoPoint) {
        return mo173063a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), true);
    }

    /* renamed from: a */
    private boolean m160525a(int i, int i2) {
        return mo173063a(i, i2, false);
    }

    /* renamed from: a */
    private void m160521a(double d, double d2) {
        this.f342798q.mo172083a(d, d2);
    }

    /* renamed from: a */
    public final boolean mo173061a(float f, float f2, boolean z) {
        C114370b bVar = this.f342799r;
        if (bVar == null) {
            this.f342799r = new C114370b(f, f2);
        } else {
            bVar.f342822a = f;
            bVar.f342823b = f2;
        }
        this.f342796o.mo172424a(f, f2, z);
        return true;
    }

    /* renamed from: a */
    private void m160524a(boolean z) {
        this.f342800s = z;
    }

    /* renamed from: a */
    public final boolean mo173063a(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = this.f342783b.f342821q;
        boolean z2 = true;
        int i6 = (1 << (20 - i5)) < 0 ? 0 : 20 - i5;
        if (131072 > i6) {
            i4 = ((this.f342795n.width() * 131072) - (this.f342795n.width() * i6)) / 2;
            i3 = ((this.f342795n.height() * 131072) - (this.f342795n.height() * i6)) / 2;
        } else {
            i4 = 0;
            i3 = 0;
        }
        Rect rect = this.f342784c;
        int i7 = rect.left - i4;
        int i8 = rect.right + i4;
        int i9 = rect.top - i3;
        int i15 = rect.bottom + i3;
        if (i < i9) {
            i = i9;
        }
        if (i <= i15) {
            i15 = i;
        }
        if (i2 < i7) {
            i2 = i7;
        }
        if (i2 <= i8) {
            i8 = i2;
        }
        if (i15 == this.f342794m.getLatitudeE6() && i8 == this.f342794m.getLongitudeE6()) {
            z2 = false;
        }
        this.f342794m.setLatitudeE6(i15);
        this.f342794m.setLongitudeE6(i8);
        C113732fo a = C114373y.m160621a(this, this.f342794m);
        m160521a(a.f340215a, a.f340216b);
        this.f342797p.mo172913a(this.f342794m, z);
        return z2;
    }
}
