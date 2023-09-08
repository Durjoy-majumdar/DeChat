package androidx.compose.p002ui.platform;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104273u;
import p009c2.C54652b0;

/* renamed from: androidx.compose.ui.platform.u */
public final class C54188u {

    /* renamed from: a */
    public static C32226l<? super C104273u, ? extends C54652b0> f152139a = C54189a.f152140d;

    /* renamed from: androidx.compose.ui.platform.u$a */
    public static final class C54189a extends C87413o implements C32226l<C104273u, C54652b0> {

        /* renamed from: d */
        public static final C54189a f152140d = new C54189a();

        public C54189a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C104273u uVar = (C104273u) obj;
            C87412m.m108594g(uVar, LocaleUtil.ITALIAN);
            return new C54652b0(uVar);
        }
    }

    /* renamed from: a */
    public static final void m60891a(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float b = m60892b(fArr4, 0, fArr3, 0);
        float b2 = m60892b(fArr4, 0, fArr3, 1);
        float b3 = m60892b(fArr4, 0, fArr3, 2);
        float b4 = m60892b(fArr4, 0, fArr3, 3);
        float b5 = m60892b(fArr4, 1, fArr3, 0);
        float b6 = m60892b(fArr4, 1, fArr3, 1);
        float b7 = m60892b(fArr4, 1, fArr3, 2);
        float b8 = m60892b(fArr4, 1, fArr3, 3);
        float b9 = m60892b(fArr4, 2, fArr3, 0);
        float b15 = m60892b(fArr4, 2, fArr3, 1);
        float b16 = m60892b(fArr4, 2, fArr3, 2);
        float b17 = m60892b(fArr4, 2, fArr3, 3);
        float b18 = m60892b(fArr4, 3, fArr3, 0);
        float b19 = m60892b(fArr4, 3, fArr3, 1);
        float b25 = m60892b(fArr4, 3, fArr3, 2);
        float b26 = m60892b(fArr4, 3, fArr3, 3);
        fArr3[0] = b;
        fArr3[1] = b2;
        fArr3[2] = b3;
        fArr3[3] = b4;
        fArr3[4] = b5;
        fArr3[5] = b6;
        fArr3[6] = b7;
        fArr3[7] = b8;
        fArr3[8] = b9;
        fArr3[9] = b15;
        fArr3[10] = b16;
        fArr3[11] = b17;
        fArr3[12] = b18;
        fArr3[13] = b19;
        fArr3[14] = b25;
        fArr3[15] = b26;
    }

    /* renamed from: b */
    public static final float m60892b(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }
}
