package p450b1;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C8480h;
import gy3.C87412m;
import p450b1.C103985g;

/* renamed from: b1.d */
public final class C103980d {
    /* renamed from: a */
    public static C103979c m138713a(C103979c cVar, C104000m mVar, C103976a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C103976a.f307528b;
        }
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(mVar, "whitePoint");
        C87412m.m108594g(aVar, "adaptation");
        if (!C103978b.m138706a(cVar.f307536b, C103978b.f307530a)) {
            return cVar;
        }
        C103990k kVar = (C103990k) cVar;
        if (m138715c(kVar.f307579d, mVar)) {
            return cVar;
        }
        return new C103990k(kVar.f307535a, kVar.f307583h, mVar, m138718f(m138714b(aVar.f307529a, kVar.f307579d.mo145596a(), mVar.mo145596a()), kVar.f307584i), kVar.f307586k, kVar.f307588m, kVar.f307580e, kVar.f307581f, kVar.f307582g, -1);
    }

    /* renamed from: b */
    public static final float[] m138714b(float[] fArr, float[] fArr2, float[] fArr3) {
        C87412m.m108594g(fArr, "matrix");
        C87412m.m108594g(fArr2, "srcWhitePoint");
        C87412m.m108594g(fArr3, "dstWhitePoint");
        m138720h(fArr, fArr2);
        m138720h(fArr, fArr3);
        return m138718f(m138717e(fArr), m138719g(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    /* renamed from: c */
    public static final boolean m138715c(C104000m mVar, C104000m mVar2) {
        C87412m.m108594g(mVar, "a");
        C87412m.m108594g(mVar2, "b");
        if (mVar == mVar2) {
            return true;
        }
        return Math.abs(mVar.f307606a - mVar2.f307606a) < 0.001f && Math.abs(mVar.f307607b - mVar2.f307607b) < 0.001f;
    }

    /* renamed from: d */
    public static C103985g m138716d(C103979c cVar, C103979c cVar2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            C103981e eVar = C103981e.f307538a;
            cVar2 = C103981e.f307541d;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C87412m.m108594g(cVar, "$this$connect");
        C87412m.m108594g(cVar2, FirebaseAnalytics.C113379b.DESTINATION);
        if (cVar == cVar2) {
            return new C103984f(cVar, 1);
        }
        long j = cVar.f307536b;
        long j2 = C103978b.f307530a;
        return (!C103978b.m138706a(j, j2) || !C103978b.m138706a(cVar2.f307536b, j2)) ? new C103985g(cVar, cVar2, i, (C8480h) null) : new C103985g.C103986a((C103990k) cVar, (C103990k) cVar2, i, (C8480h) null);
    }

    /* renamed from: e */
    public static final float[] m138717e(float[] fArr) {
        float[] fArr2 = fArr;
        C87412m.m108594g(fArr2, "m");
        float f = fArr2[0];
        float f2 = fArr2[3];
        float f3 = fArr2[6];
        float f4 = fArr2[1];
        float f5 = fArr2[4];
        float f6 = fArr2[7];
        float f7 = fArr2[2];
        float f8 = fArr2[5];
        float f9 = fArr2[8];
        float f15 = (f5 * f9) - (f6 * f8);
        float f16 = (f6 * f7) - (f4 * f9);
        float f17 = (f4 * f8) - (f5 * f7);
        float f18 = (f * f15) + (f2 * f16) + (f3 * f17);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f15 / f18;
        fArr3[1] = f16 / f18;
        fArr3[2] = f17 / f18;
        fArr3[3] = ((f3 * f8) - (f2 * f9)) / f18;
        fArr3[4] = ((f9 * f) - (f3 * f7)) / f18;
        fArr3[5] = ((f7 * f2) - (f8 * f)) / f18;
        fArr3[6] = ((f2 * f6) - (f3 * f5)) / f18;
        fArr3[7] = ((f3 * f4) - (f6 * f)) / f18;
        fArr3[8] = ((f * f5) - (f2 * f4)) / f18;
        return fArr3;
    }

    /* renamed from: f */
    public static final float[] m138718f(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C87412m.m108594g(fArr3, "lhs");
        C87412m.m108594g(fArr4, "rhs");
        float f = fArr3[3];
        float f2 = fArr4[1];
        float f3 = fArr3[6];
        float f4 = fArr4[2];
        float f5 = fArr3[1];
        float f6 = fArr4[0];
        float f7 = fArr3[4];
        float f8 = fArr3[7];
        float f9 = fArr3[5];
        float f15 = fArr3[8];
        float f16 = fArr3[0];
        float f17 = fArr4[4];
        float f18 = (fArr4[3] * f16) + (f * f17);
        float f19 = fArr4[5];
        float f25 = fArr3[1];
        float f26 = fArr4[3];
        float f27 = fArr3[2];
        float f28 = f16 * fArr4[6];
        float f29 = fArr3[3];
        float f35 = fArr4[7];
        float f36 = f28 + (f29 * f35);
        float f37 = fArr4[8];
        float f38 = fArr4[6];
        return new float[]{(fArr3[0] * fArr4[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (fArr3[2] * f6) + (fArr4[1] * f9) + (f4 * f15), f18 + (f3 * f19), (f25 * f26) + (f7 * f17) + (f8 * f19), (f26 * f27) + (f9 * fArr4[4]) + (f19 * f15), f36 + (f3 * f37), (f25 * f38) + (fArr3[4] * f35) + (f8 * f37), (f27 * f38) + (fArr3[5] * fArr4[7]) + (f15 * f37)};
    }

    /* renamed from: g */
    public static final float[] m138719g(float[] fArr, float[] fArr2) {
        C87412m.m108594g(fArr, "lhs");
        C87412m.m108594g(fArr2, "rhs");
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    /* renamed from: h */
    public static final float[] m138720h(float[] fArr, float[] fArr2) {
        C87412m.m108594g(fArr, "lhs");
        C87412m.m108594g(fArr2, "rhs");
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }
}
