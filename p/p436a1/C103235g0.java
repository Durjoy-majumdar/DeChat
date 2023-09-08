package p436a1;

import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112538d;
import p1166z0.C112539e;
import p1166z0.C112540f;

/* renamed from: a1.g0 */
public final class C103235g0 {
    /* renamed from: a */
    public static float[] m136668a(float[] fArr, int i, C8480h hVar) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        C87412m.m108594g(fArr, "values");
        return fArr;
    }

    /* renamed from: b */
    public static final long m136669b(float[] fArr, long j) {
        float c = C112539e.m153738c(j);
        float d = C112539e.m153739d(j);
        float f = (fArr[3] * c) + (fArr[7] * d) + fArr[15];
        float f2 = 0.0f;
        if (!(f == 0.0f)) {
            f2 = 1.0f / f;
        }
        return C112540f.m153745a(((fArr[0] * c) + (fArr[4] * d) + fArr[12]) * f2, f2 * ((fArr[1] * c) + (fArr[5] * d) + fArr[13]));
    }

    /* renamed from: c */
    public static final void m136670c(float[] fArr, C112538d dVar) {
        C87412m.m108594g(dVar, "rect");
        long b = m136669b(fArr, C112540f.m153745a(dVar.f336951a, dVar.f336952b));
        long b2 = m136669b(fArr, C112540f.m153745a(dVar.f336951a, dVar.f336954d));
        long b3 = m136669b(fArr, C112540f.m153745a(dVar.f336953c, dVar.f336952b));
        long b4 = m136669b(fArr, C112540f.m153745a(dVar.f336953c, dVar.f336954d));
        dVar.f336951a = Math.min(Math.min(C112539e.m153738c(b), C112539e.m153738c(b2)), Math.min(C112539e.m153738c(b3), C112539e.m153738c(b4)));
        dVar.f336952b = Math.min(Math.min(C112539e.m153739d(b), C112539e.m153739d(b2)), Math.min(C112539e.m153739d(b3), C112539e.m153739d(b4)));
        dVar.f336953c = Math.max(Math.max(C112539e.m153738c(b), C112539e.m153738c(b2)), Math.max(C112539e.m153738c(b3), C112539e.m153738c(b4)));
        dVar.f336954d = Math.max(Math.max(C112539e.m153739d(b), C112539e.m153739d(b2)), Math.max(C112539e.m153739d(b3), C112539e.m153739d(b4)));
    }

    /* renamed from: d */
    public static final void m136671d(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: e */
    public static void m136672e(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }
}
