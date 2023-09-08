package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.iz */
public class C113831iz {

    /* renamed from: F */
    public static final C113831iz f340581F = new C113831iz(1, (double[]) null);

    /* renamed from: G */
    public static final C113831iz f340582G = new C113831iz(2, (double[]) null, true);

    /* renamed from: H */
    public static final C113831iz f340583H = new C113831iz(104, (double[]) null);

    /* renamed from: i */
    public static final int f340584i = 1;

    /* renamed from: j */
    public static final int f340585j = 2;

    /* renamed from: k */
    public static final int f340586k = 3;

    /* renamed from: l */
    public static final int f340587l = 4;

    /* renamed from: m */
    public static final int f340588m = 5;

    /* renamed from: n */
    public static final int f340589n = 6;

    /* renamed from: o */
    public static final int f340590o = 100;

    /* renamed from: p */
    public static final int f340591p = 101;

    /* renamed from: q */
    public static final int f340592q = 102;

    /* renamed from: r */
    public static final int f340593r = 103;

    /* renamed from: s */
    public static final int f340594s = 104;

    /* renamed from: t */
    public static final int f340595t = 105;

    /* renamed from: u */
    public static final int f340596u = 10000;

    /* renamed from: v */
    public static final int f340597v = 108;

    /* renamed from: w */
    public static final int f340598w = 109;

    /* renamed from: x */
    public static final int f340599x = 110;

    /* renamed from: y */
    public static final int f340600y = 120;

    /* renamed from: A */
    public double[] f340601A;

    /* renamed from: B */
    public long f340602B;

    /* renamed from: C */
    public boolean f340603C;

    /* renamed from: D */
    public boolean f340604D;

    /* renamed from: E */
    public Runnable f340605E;

    /* renamed from: a */
    private C113830ii f340606a;

    /* renamed from: z */
    public int f340607z;

    public C113831iz() {
        this.f340602B = -1;
        this.f340603C = false;
    }

    /* renamed from: a */
    private void m157234a(C113830ii iiVar) {
        this.f340606a = iiVar;
    }

    /* renamed from: c */
    private long m157235c() {
        long j = this.f340602B;
        return j >= 0 ? j : this.f340607z >= 100 ? 20 : 0;
    }

    /* renamed from: d */
    private static void m157236d() {
    }

    /* renamed from: a */
    public boolean mo171260a() {
        return true;
    }

    /* renamed from: b */
    public void mo172219b() {
    }

    /* renamed from: a */
    public boolean mo172218a(C113835jc jcVar) {
        boolean a = mo171260a();
        jcVar.mo171240c(this);
        return a;
    }

    public C113831iz(int i, double[] dArr) {
        this(i, dArr, false);
    }

    public C113831iz(int i, double[] dArr, boolean z) {
        this.f340602B = -1;
        this.f340603C = false;
        this.f340607z = i;
        this.f340601A = dArr;
        this.f340604D = z;
    }

    public C113831iz(Runnable runnable) {
        this.f340602B = -1;
        this.f340603C = false;
        this.f340607z = 6;
        this.f340605E = runnable;
    }
}
