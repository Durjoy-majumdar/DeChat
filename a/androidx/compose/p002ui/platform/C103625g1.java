package androidx.compose.p002ui.platform;

import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.g1 */
public final class C103625g1 {
    /* renamed from: a */
    public static final boolean m137807a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C87412m.m108594g(fArr3, "$this$invertTo");
        C87412m.m108594g(fArr4, "other");
        float f = fArr3[0];
        float f2 = fArr3[1];
        float f3 = fArr3[2];
        float f4 = fArr3[3];
        float f5 = fArr3[4];
        float f6 = fArr3[5];
        float f7 = fArr3[6];
        float f8 = fArr3[7];
        float f9 = fArr3[8];
        float f15 = fArr3[9];
        float f16 = fArr3[10];
        float f17 = fArr3[11];
        float f18 = fArr3[12];
        float f19 = fArr3[13];
        float f25 = fArr3[14];
        float f26 = fArr3[15];
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f * f7) - (f3 * f5);
        float f29 = (f * f8) - (f4 * f5);
        float f35 = (f2 * f7) - (f3 * f6);
        float f36 = (f2 * f8) - (f4 * f6);
        float f37 = (f3 * f8) - (f4 * f7);
        float f38 = (f9 * f19) - (f15 * f18);
        float f39 = (f9 * f25) - (f16 * f18);
        float f44 = (f9 * f26) - (f17 * f18);
        float f45 = (f15 * f25) - (f16 * f19);
        float f46 = (f15 * f26) - (f17 * f19);
        float f47 = (f16 * f26) - (f17 * f25);
        float f48 = (((((f27 * f47) - (f28 * f46)) + (f29 * f45)) + (f35 * f44)) - (f36 * f39)) + (f37 * f38);
        if (f48 == 0.0f) {
            return false;
        }
        float f49 = 1.0f / f48;
        fArr4[0] = (((f6 * f47) - (f7 * f46)) + (f8 * f45)) * f49;
        fArr4[1] = ((((-f2) * f47) + (f3 * f46)) - (f4 * f45)) * f49;
        fArr4[2] = (((f19 * f37) - (f25 * f36)) + (f26 * f35)) * f49;
        fArr4[3] = ((((-f15) * f37) + (f16 * f36)) - (f17 * f35)) * f49;
        float f54 = -f5;
        fArr4[4] = (((f54 * f47) + (f7 * f44)) - (f8 * f39)) * f49;
        fArr4[5] = (((f47 * f) - (f3 * f44)) + (f4 * f39)) * f49;
        float f55 = -f18;
        fArr4[6] = (((f55 * f37) + (f25 * f29)) - (f26 * f28)) * f49;
        fArr4[7] = (((f37 * f9) - (f16 * f29)) + (f17 * f28)) * f49;
        fArr4[8] = (((f5 * f46) - (f6 * f44)) + (f8 * f38)) * f49;
        fArr4[9] = ((((-f) * f46) + (f44 * f2)) - (f4 * f38)) * f49;
        fArr4[10] = (((f18 * f36) - (f19 * f29)) + (f26 * f27)) * f49;
        fArr4[11] = ((((-f9) * f36) + (f29 * f15)) - (f17 * f27)) * f49;
        fArr4[12] = (((f54 * f45) + (f6 * f39)) - (f7 * f38)) * f49;
        fArr4[13] = (((f * f45) - (f2 * f39)) + (f3 * f38)) * f49;
        fArr4[14] = (((f55 * f35) + (f19 * f28)) - (f25 * f27)) * f49;
        fArr4[15] = (((f9 * f35) - (f15 * f28)) + (f16 * f27)) * f49;
        return true;
    }
}
