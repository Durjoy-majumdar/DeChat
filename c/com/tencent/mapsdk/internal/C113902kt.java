package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLU;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.kt */
public final class C113902kt {

    /* renamed from: a */
    private static final String[] f340749a = {"北", "东北", "东", "东南", "南", "西南", "西", "西北"};

    /* renamed from: a */
    private static double m157716a(double d) {
        return (d / 3.141592653589793d) * 180.0d;
    }

    /* renamed from: a */
    private static String m157724a(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        int i = 0;
        while (true) {
            String[] strArr = f340749a;
            if (i >= strArr.length) {
                return strArr[0];
            }
            float f2 = ((float) (i * 45)) - 22.0f;
            if (f < 45.0f + f2 && f >= f2) {
                return strArr[i];
            }
            i++;
        }
    }

    /* renamed from: b */
    private static double m157729b(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    /* renamed from: b */
    private static IntBuffer m157734b(GL10 gl10, int i, int i2, int i3, int i4) {
        IntBuffer wrap = IntBuffer.wrap(new int[(i3 * i4)]);
        wrap.position(0);
        gl10.glReadPixels(i, i2, i3, i4, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        return wrap;
    }

    /* renamed from: c */
    private static double m157735c(double d) {
        double abs = Math.abs(d % 360.0d);
        return abs > 270.0d ? 360.0d - abs : abs;
    }

    /* renamed from: d */
    private static double m157737d(double d, double d2, double d3, double d4) {
        double asin = Math.asin((d3 - d) / Math.sqrt(Math.pow(d - d3, 2.0d) + Math.pow(d2 - d4, 2.0d)));
        if (d4 - d2 < 0.0d) {
            asin = 3.141592653589793d - asin;
        }
        return (asin / 3.141592653589793d) * 180.0d;
    }

    /* renamed from: c */
    private static double m157736c(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double abs;
        double d7 = d3 - d;
        double d8 = d4 - d2;
        double atan = Math.atan(d8 / d7);
        double d9 = 1.5707963267948966d;
        int i = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
        if (i <= 0 || d8 <= 0.0d) {
            if (i < 0 || d8 > 0.0d) {
                d9 = 4.71238898038469d;
                if (d7 > 0.0d || d8 > 0.0d) {
                    d6 = Math.abs(atan);
                } else {
                    abs = Math.abs(atan);
                }
            } else {
                d6 = Math.abs(atan);
            }
            d5 = d9 + d6;
            return (d5 * 180.0d) / 3.141592653589793d;
        }
        abs = Math.abs(atan);
        d5 = d9 - abs;
        return (d5 * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: a */
    private static Bitmap m157719a(GL10 gl10, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int i15 = i6;
        int i16 = i2 + i8;
        int[] iArr = new int[(i7 * i16)];
        int[] iArr2 = new int[(i9 * i15)];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        long currentTimeMillis = System.currentTimeMillis();
        gl10.glReadPixels(i, 0, i3, i16, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        C113889km.m157537a("readPixels 使用的时间:" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
        long currentTimeMillis2 = System.currentTimeMillis();
        float f = ((float) i7) / ((float) i9);
        float f2 = ((float) i8) / ((float) i15);
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            for (int i19 = 0; i19 < i9; i19++) {
                int i25 = iArr[(((int) Math.ceil(((double) (((float) i17) * f2)) - 0.5d)) * i7) + ((int) Math.ceil(((double) (((float) i19) * f)) - 0.5d))];
                iArr2[(((i15 - i18) - 1) * i9) + i19] = (i25 & -16711936) | ((i25 << 16) & 16711680) | ((i25 >> 16) & 255);
            }
            i17++;
            i18++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i9, i15, Bitmap.Config.RGB_565);
        C113889km.m157537a("buffer 转成位图使用的时间:" + (System.currentTimeMillis() - currentTimeMillis2) + LocaleUtil.MALAY);
        return createBitmap;
    }

    /* renamed from: b */
    private static int m157732b(float f) {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            int i3 = 2 << i;
            if (i3 >= ((int) Math.ceil((double) f))) {
                return i3;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    private static double m157730b(double d, double d2, double d3, double d4) {
        return Math.sqrt(Math.pow(d - d3, 2.0d) + Math.pow(d2 - d4, 2.0d));
    }

    /* renamed from: b */
    private static C92454gb m157733b(float f, float f2, float[] fArr, float[] fArr2, int[] iArr) {
        float[] a = m157727a(f, f2, 0.0f, fArr, fArr2, iArr);
        float[] a2 = m157727a(f, f2, 1.0f, fArr, fArr2, iArr);
        for (int i = 0; i < 3; i++) {
            a[i] = a[i] / a[3];
            a2[i] = a2[i] / a2[3];
        }
        return new C92454gb(a2[0] - a[0], a2[1] - a[1], a2[2] - a[2]);
    }

    /* renamed from: b */
    private static float m157731b(C113747gc gcVar, C113747gc gcVar2) {
        double asin = Math.asin(((double) (gcVar2.f340323a - gcVar.f340323a)) / Math.sqrt(Math.pow((double) (gcVar.f340323a - gcVar2.f340323a), 2.0d) + Math.pow((double) (gcVar.f340325c - gcVar2.f340325c), 2.0d)));
        if (gcVar2.f340325c - gcVar.f340325c < 0.0f) {
            asin = 3.141592653589793d - asin;
        }
        return (float) ((asin / 3.141592653589793d) * 180.0d);
    }

    /* renamed from: a */
    private static C113747gc m157723a(float f, float f2, float f3, float[] fArr, float f4) {
        float[] fArr2 = new float[16];
        Matrix.invertM(fArr2, 0, fArr, 0);
        C113747gc gcVar = new C113747gc(f, f2, f4);
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, new float[]{gcVar.f340323a, gcVar.f340324b, gcVar.f340325c, gcVar.f340326d}, 0);
        float f5 = fArr3[0];
        float f6 = fArr3[3];
        C113747gc gcVar2 = new C113747gc(f5 / f6, fArr3[1] / f6, fArr3[2] / f6);
        float f7 = gcVar2.f340324b;
        float f8 = f7 != 0.0f ? f3 / f7 : 1.0f;
        return new C113747gc(gcVar2.f340323a * f8, f3, gcVar2.f340325c * f8);
    }

    /* renamed from: a */
    private static C113747gc m157722a(double d, double d2, double d3, double d4) {
        return new C113747gc((float) (d - d3), 0.0f, -((float) (d2 - d4)));
    }

    /* renamed from: a */
    private static PointF m157720a(C113747gc gcVar, double d, double d2) {
        return new PointF((float) (((double) gcVar.f340323a) + d), (float) (((double) (-gcVar.f340325c)) + d2));
    }

    /* renamed from: a */
    private static double m157717a(C113747gc gcVar, C113747gc gcVar2) {
        return Math.sqrt(Math.pow((double) (gcVar.f340323a - gcVar2.f340323a), 2.0d) + Math.pow((double) (gcVar.f340325c - gcVar2.f340325c), 2.0d));
    }

    /* renamed from: a */
    private static float[] m157727a(float f, float f2, float f3, float[] fArr, float[] fArr2, int[] iArr) {
        float[] fArr3 = new float[4];
        if (GLU.gluUnProject(f, ((float) iArr[3]) - f2, f3, fArr, 0, fArr2, 0, iArr, 0, fArr3, 0) == 1) {
            return fArr3;
        }
        throw new RuntimeException("unProject fail");
    }

    /* renamed from: a */
    private static C92454gb m157721a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float[] fArr2 = {f4 - f, f5 - f2, f6 - f3};
        float f9 = f8 - f2;
        float f15 = fArr[8] - f3;
        float[] fArr3 = {f7 - f, f9, f15};
        float f16 = fArr2[2];
        float f17 = fArr3[0];
        float f18 = fArr2[0];
        return new C92454gb((fArr2[1] * f15) - (f9 * f16), (f16 * f17) - (f15 * f18), (f18 * fArr3[1]) - (fArr2[1] * f17));
    }

    /* renamed from: a */
    private static boolean m157726a(float[] fArr, float[] fArr2) {
        C113746ga gaVar = new C113746ga(fArr2);
        C113747gc gcVar = new C113747gc(fArr[0], fArr[1], fArr[2]);
        return ((double) Math.abs(gaVar.mo172120a() - ((new C113746ga(gcVar, gaVar.f340319a, gaVar.f340320b).mo172120a() + new C113746ga(gcVar, gaVar.f340319a, gaVar.f340321c).mo172120a()) + new C113746ga(gcVar, gaVar.f340320b, gaVar.f340321c).mo172120a()))) < 0.001d;
    }

    /* renamed from: a */
    private static float[] m157728a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        float[] fArr5 = new float[3];
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        float f7 = fArr3[0];
        float f8 = fArr3[1];
        float f9 = fArr3[2];
        float f15 = fArr4[0];
        float f16 = fArr4[1];
        float f17 = fArr4[2];
        float f18 = (f7 * f) + (f8 * f2) + (f9 * f3);
        if (f18 == 0.0f) {
            return null;
        }
        float f19 = ((((f4 - f15) * f) + ((f5 - f16) * f2)) + ((f6 - f17) * f3)) / f18;
        fArr5[0] = f15 + (f7 * f19);
        fArr5[1] = f16 + (f8 * f19);
        fArr5[2] = f17 + (f9 * f19);
        return fArr5;
    }

    /* renamed from: a */
    private static Bitmap m157718a(GL10 gl10, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i4;
        int i7 = i2 + i6;
        int[] iArr = new int[(i5 * i7)];
        int[] iArr2 = new int[(i5 * i6)];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        long currentTimeMillis = System.currentTimeMillis();
        gl10.glReadPixels(i, 0, i3, i7, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        C113889km.m157537a("readPixels 使用的时间:" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
        long currentTimeMillis2 = System.currentTimeMillis();
        float f = (float) i5;
        float f2 = f / f;
        float f3 = (float) i6;
        float f4 = f3 / f3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            for (int i15 = 0; i15 < i5; i15++) {
                int i16 = iArr[(((int) Math.ceil(((double) (((float) i8) * f4)) - 0.5d)) * i5) + ((int) Math.ceil(((double) (((float) i15) * f2)) - 0.5d))];
                iArr2[(((i6 - i9) - 1) * i5) + i15] = (i16 & -16711936) | ((i16 << 16) & 16711680) | ((i16 >> 16) & 255);
            }
            i8++;
            i9++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i5, i6, Bitmap.Config.RGB_565);
        C113889km.m157537a("buffer 转成位图使用的时间:" + (System.currentTimeMillis() - currentTimeMillis2) + LocaleUtil.MALAY);
        return createBitmap;
    }

    /* renamed from: a */
    private static boolean m157725a(float f, float f2, float[] fArr, float[] fArr2, int[] iArr) {
        float[] fArr3 = fArr;
        float f3 = fArr3[0];
        float f4 = fArr3[1];
        float f5 = fArr3[2];
        float f6 = fArr3[3];
        float f7 = fArr3[4];
        float f8 = fArr3[5];
        float f9 = fArr3[6];
        float[] fArr4 = {f6 - f3, f7 - f4, f8 - f5};
        float f15 = fArr3[7] - f4;
        float f16 = fArr3[8] - f5;
        float[] fArr5 = {f9 - f3, f15, f16};
        float f17 = fArr4[2];
        float f18 = fArr5[0];
        float f19 = fArr4[0];
        C92454gb gbVar = new C92454gb((fArr4[1] * f16) - (f15 * f17), (f17 * f18) - (f16 * f19), (f19 * fArr5[1]) - (fArr4[1] * f18));
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        float f25 = f;
        float f26 = f2;
        float[] fArr7 = fArr6;
        float[] fArr8 = fArr2;
        int[] iArr2 = iArr;
        float[] a = m157727a(f25, f26, 0.0f, fArr7, fArr8, iArr2);
        float[] a2 = m157727a(f25, f26, 1.0f, fArr7, fArr8, iArr2);
        for (int i = 0; i < 3; i++) {
            a[i] = a[i] / a[3];
            a2[i] = a2[i] / a2[3];
        }
        C92454gb gbVar2 = new C92454gb(a2[0] - a[0], a2[1] - a[1], a2[2] - a[2]);
        float[] a3 = gbVar.mo126459a();
        float[] fArr9 = {fArr3[0], fArr3[1], fArr3[2]};
        float[] a4 = gbVar2.mo126459a();
        float f27 = a[0];
        float f28 = a[1];
        float f29 = a[2];
        float[] fArr10 = new float[3];
        float f35 = a3[0];
        float f36 = a3[1];
        float f37 = a3[2];
        float f38 = fArr9[0];
        float f39 = fArr9[1];
        float f44 = fArr9[2];
        float f45 = a4[0];
        float f46 = a4[1];
        float f47 = a4[2];
        float f48 = (f45 * f35) + (f46 * f36) + (f47 * f37);
        if (f48 == 0.0f) {
            fArr10 = null;
        } else {
            float f49 = ((((f38 - f27) * f35) + ((f39 - f28) * f36)) + ((f44 - f29) * f37)) / f48;
            fArr10[0] = f27 + (f45 * f49);
            fArr10[1] = f28 + (f46 * f49);
            fArr10[2] = f29 + (f47 * f49);
        }
        if (fArr10 == null) {
            return false;
        }
        C113746ga gaVar = new C113746ga(fArr3);
        C113747gc gcVar = new C113747gc(fArr10[0], fArr10[1], fArr10[2]);
        return ((double) Math.abs(gaVar.mo172120a() - ((new C113746ga(gcVar, gaVar.f340319a, gaVar.f340320b).mo172120a() + new C113746ga(gcVar, gaVar.f340319a, gaVar.f340321c).mo172120a()) + new C113746ga(gcVar, gaVar.f340320b, gaVar.f340321c).mo172120a()))) < 0.001d;
    }
}
