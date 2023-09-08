package p450b1;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;

/* renamed from: b1.e */
public final class C103981e {

    /* renamed from: a */
    public static final C103981e f307538a = new C103981e();

    /* renamed from: b */
    public static final float[] f307539b;

    /* renamed from: c */
    public static final float[] f307540c;

    /* renamed from: d */
    public static final C103990k f307541d;

    /* renamed from: e */
    public static final C103990k f307542e;

    /* renamed from: f */
    public static final C103990k f307543f;

    /* renamed from: g */
    public static final C103990k f307544g;

    /* renamed from: h */
    public static final C103990k f307545h;

    /* renamed from: i */
    public static final C103990k f307546i;

    /* renamed from: j */
    public static final C103990k f307547j;

    /* renamed from: k */
    public static final C103990k f307548k;

    /* renamed from: l */
    public static final C103990k f307549l;

    /* renamed from: m */
    public static final C103990k f307550m;

    /* renamed from: n */
    public static final C103990k f307551n;

    /* renamed from: o */
    public static final C103990k f307552o;

    /* renamed from: p */
    public static final C103990k f307553p;

    /* renamed from: q */
    public static final C103990k f307554q;

    /* renamed from: r */
    public static final C103979c f307555r;

    /* renamed from: s */
    public static final C103979c f307556s;

    /* renamed from: t */
    public static final C103990k f307557t;

    /* renamed from: u */
    public static final C103979c f307558u;

    /* renamed from: v */
    public static final C103979c[] f307559v;

    /* renamed from: b1.e$a */
    public static final class C103982a extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public static final C103982a f307560d = new C103982a();

        public C103982a() {
            super(1);
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            double d = doubleValue < 0.0d ? -doubleValue : doubleValue;
            return Double.valueOf(Math.copySign(d >= 0.0031308049535603718d ? (Math.pow(d, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d / 0.07739938080495357d, doubleValue));
        }
    }

    /* renamed from: b1.e$b */
    public static final class C103983b extends C87413o implements C32226l<Double, Double> {

        /* renamed from: d */
        public static final C103983b f307561d = new C103983b();

        public C103983b() {
            super(1);
        }

        public Object invoke(Object obj) {
            double doubleValue = ((Number) obj).doubleValue();
            double d = doubleValue < 0.0d ? -doubleValue : doubleValue;
            return Double.valueOf(Math.copySign(d >= 0.04045d ? Math.pow((0.9478672985781991d * d) + 0.05213270142180095d, 2.4d) : d * 0.07739938080495357d, doubleValue));
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f307539b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f307540c = fArr2;
        C103999l lVar = new C103999l(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (C8480h) null);
        C103999l lVar2 = new C103999l(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, (C8480h) null);
        C104000m mVar = C103987h.f307571d;
        float[] fArr3 = fArr;
        C104000m mVar2 = mVar;
        C103990k kVar = new C103990k("sRGB IEC61966-2.1", fArr3, mVar2, lVar, 0);
        f307541d = kVar;
        C103990k kVar2 = new C103990k("sRGB IEC61966-2.1 (Linear)", fArr3, mVar2, 1.0d, 0.0f, 1.0f, 1);
        f307542e = kVar2;
        C103990k kVar3 = new C103990k("scRGB-nl IEC 61966-2-2:2003", fArr3, mVar2, (float[]) null, C103982a.f307560d, C103983b.f307561d, -0.799f, 2.399f, lVar, 2);
        f307543f = kVar3;
        C103990k kVar4 = new C103990k("scRGB IEC 61966-2-2:2003", fArr3, mVar2, 1.0d, -0.5f, 7.499f, 3);
        f307544g = kVar4;
        C103990k kVar5 = new C103990k("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, mVar2, new C103999l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (C8480h) null), 4);
        f307545h = kVar5;
        C103990k kVar6 = new C103990k("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, mVar2, new C103999l(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, (C8480h) null), 5);
        f307546i = kVar6;
        C103990k kVar7 = new C103990k("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C104000m(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f307547j = kVar7;
        C103990k kVar8 = new C103990k("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, mVar, lVar, 7);
        f307548k = kVar8;
        C103990k kVar9 = new C103990k("NTSC (1953)", fArr2, C103987h.f307568a, new C103999l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (C8480h) null), 8);
        f307549l = kVar9;
        C104000m mVar3 = mVar;
        C103990k kVar10 = new C103990k("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, mVar3, new C103999l(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, (C8480h) null), 9);
        f307550m = kVar10;
        C103990k kVar11 = new C103990k("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, mVar3, 2.2d, 0.0f, 1.0f, 10);
        f307551n = kVar11;
        C103990k kVar12 = new C103990k("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, C103987h.f307569b, new C103999l(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, (C8480h) null), 11);
        f307552o = kVar12;
        C104000m mVar4 = C103987h.f307570c;
        C103990k kVar13 = new C103990k("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, mVar4, 1.0d, -65504.0f, 65504.0f, 12);
        f307553p = kVar13;
        C103990k kVar14 = new C103990k("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, mVar4, 1.0d, -65504.0f, 65504.0f, 13);
        f307554q = kVar14;
        C104001n nVar = new C104001n("Generic XYZ", 14);
        f307555r = nVar;
        C103988i iVar = new C103988i("Generic L*a*b*", 15);
        f307556s = iVar;
        float[] fArr4 = fArr;
        C103990k kVar15 = new C103990k("None", fArr4, mVar, lVar2, 16);
        f307557t = kVar15;
        C103989j jVar = new C103989j("Oklab", 17);
        f307558u = jVar;
        f307559v = new C103979c[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, nVar, iVar, kVar15, jVar};
    }
}
