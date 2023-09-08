package com.tencent.p014mm.p136ui.tools;

/* renamed from: com.tencent.mm.ui.tools.z0 */
public class C116163z0 {
    /* renamed from: a */
    public static float[] m163435a(float[][] fArr, float[] fArr2) {
        int length = fArr2.length;
        float[] fArr3 = new float[length];
        for (int i = 0; i < length; i++) {
            float f = 0.0f;
            for (int i2 = 0; i2 < length; i2++) {
                f += fArr[i][i2] * fArr2[i2];
            }
            fArr3[i] = f;
        }
        return fArr3;
    }
}
