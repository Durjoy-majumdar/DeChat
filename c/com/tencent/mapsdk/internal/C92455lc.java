package com.tencent.mapsdk.internal;

import android.opengl.Matrix;
import java.lang.reflect.Array;

/* renamed from: com.tencent.mapsdk.internal.lc */
public final class C92455lc {
    /* renamed from: a */
    private static float[][] m116301a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        float[][] fArr4 = (float[][]) Array.newInstance(Float.TYPE, new int[]{6, 4});
        float[] fArr5 = fArr4[0];
        float f = fArr3[3] - fArr3[0];
        fArr5[0] = f;
        float f2 = fArr3[7] - fArr3[4];
        fArr5[1] = f2;
        float f3 = fArr3[11] - fArr3[8];
        fArr5[2] = f3;
        fArr5[3] = fArr3[15] - fArr3[12];
        double sqrt = Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
        float[] fArr6 = fArr4[0];
        fArr6[0] = (float) (((double) fArr6[0]) / sqrt);
        fArr6[1] = (float) (((double) fArr6[1]) / sqrt);
        fArr6[2] = (float) (((double) fArr6[2]) / sqrt);
        fArr6[3] = (float) (((double) fArr6[3]) / sqrt);
        float[] fArr7 = fArr4[1];
        float f4 = fArr3[3] + fArr3[0];
        fArr7[0] = f4;
        float f5 = fArr3[7] + fArr3[4];
        fArr7[1] = f5;
        float f6 = fArr3[11] + fArr3[8];
        fArr7[2] = f6;
        fArr7[3] = fArr3[15] + fArr3[12];
        double sqrt2 = Math.sqrt((double) ((f4 * f4) + (f5 * f5) + (f6 * f6)));
        float[] fArr8 = fArr4[1];
        fArr8[0] = (float) (((double) fArr8[0]) / sqrt2);
        fArr8[1] = (float) (((double) fArr8[1]) / sqrt2);
        fArr8[2] = (float) (((double) fArr8[2]) / sqrt2);
        fArr8[3] = (float) (((double) fArr8[3]) / sqrt2);
        float[] fArr9 = fArr4[2];
        float f7 = fArr3[3] + fArr3[1];
        fArr9[0] = f7;
        float f8 = fArr3[7] + fArr3[5];
        fArr9[1] = f8;
        float f9 = fArr3[11] + fArr3[9];
        fArr9[2] = f9;
        fArr9[3] = fArr3[15] + fArr3[13];
        double sqrt3 = Math.sqrt((double) ((f7 * f7) + (f8 * f8) + (f9 * f9)));
        float[] fArr10 = fArr4[2];
        fArr10[0] = (float) (((double) fArr10[0]) / sqrt3);
        fArr10[1] = (float) (((double) fArr10[1]) / sqrt3);
        fArr10[2] = (float) (((double) fArr10[2]) / sqrt3);
        fArr10[3] = (float) (((double) fArr10[3]) / sqrt3);
        float[] fArr11 = fArr4[3];
        float f15 = fArr3[3] - fArr3[1];
        fArr11[0] = f15;
        float f16 = fArr3[7] - fArr3[5];
        fArr11[1] = f16;
        float f17 = fArr3[11] - fArr3[9];
        fArr11[2] = f17;
        fArr11[3] = fArr3[15] - fArr3[13];
        double sqrt4 = Math.sqrt((double) ((f15 * f15) + (f16 * f16) + (f17 * f17)));
        float[] fArr12 = fArr4[3];
        fArr12[0] = (float) (((double) fArr12[0]) / sqrt4);
        fArr12[1] = (float) (((double) fArr12[1]) / sqrt4);
        fArr12[2] = (float) (((double) fArr12[2]) / sqrt4);
        fArr12[3] = (float) (((double) fArr12[3]) / sqrt4);
        float[] fArr13 = fArr4[4];
        float f18 = fArr3[3] - fArr3[2];
        fArr13[0] = f18;
        float f19 = fArr3[7] - fArr3[6];
        fArr13[1] = f19;
        float f25 = fArr3[11] - fArr3[10];
        fArr13[2] = f25;
        fArr13[3] = fArr3[15] - fArr3[14];
        double sqrt5 = Math.sqrt((double) ((f18 * f18) + (f19 * f19) + (f25 * f25)));
        float[] fArr14 = fArr4[4];
        fArr14[0] = (float) (((double) fArr14[0]) / sqrt5);
        fArr14[1] = (float) (((double) fArr14[1]) / sqrt5);
        fArr14[2] = (float) (((double) fArr14[2]) / sqrt5);
        fArr14[3] = (float) (((double) fArr14[3]) / sqrt5);
        float[] fArr15 = fArr4[5];
        float f26 = fArr3[3] + fArr3[2];
        fArr15[0] = f26;
        float f27 = fArr3[7] + fArr3[6];
        fArr15[1] = f27;
        float f28 = fArr3[11] + fArr3[10];
        fArr15[2] = f28;
        fArr15[3] = fArr3[15] + fArr3[14];
        double sqrt6 = Math.sqrt((double) ((f26 * f26) + (f27 * f27) + (f28 * f28)));
        float[] fArr16 = fArr4[5];
        fArr16[0] = (float) (((double) fArr16[0]) / sqrt6);
        fArr16[1] = (float) (((double) fArr16[1]) / sqrt6);
        fArr16[2] = (float) (((double) fArr16[2]) / sqrt6);
        fArr16[3] = (float) (((double) fArr16[3]) / sqrt6);
        return fArr4;
    }

    /* renamed from: b */
    private static boolean m116302b(float[][] fArr, float[] fArr2) {
        int length = fArr2.length / 3;
        for (int i = 0; i < 6; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                float[] fArr3 = fArr[i];
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                if ((fArr3[0] * fArr2[i3]) + (fArr3[1] * fArr2[i4]) + (fArr3[2] * fArr2[i5]) + fArr3[3] > 0.0f) {
                    break;
                }
                i2++;
                i3 = i6;
            }
            if (i2 == length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m116300a(float[][] fArr, float[] fArr2) {
        int length = fArr2.length / 3;
        for (int i = 0; i < 6; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                float[] fArr3 = fArr[i];
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                if ((fArr3[0] * fArr2[i3]) + (fArr3[1] * fArr2[i4]) + (fArr3[2] * fArr2[i5]) + fArr3[3] > 0.0f) {
                    break;
                }
                i2++;
                i3 = i6;
            }
            if (i2 == length) {
                return false;
            }
        }
        return true;
    }
}
