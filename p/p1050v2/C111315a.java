package p1050v2;

import android.graphics.Color;
import p1057w2.C90885a;

/* renamed from: v2.a */
public class C111315a {

    /* renamed from: a */
    public final float f333274a;

    /* renamed from: b */
    public final float f333275b;

    /* renamed from: c */
    public final float f333276c;

    /* renamed from: d */
    public final float f333277d;

    /* renamed from: e */
    public final float f333278e;

    /* renamed from: f */
    public final float f333279f;

    public C111315a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f333274a = f;
        this.f333275b = f2;
        this.f333276c = f3;
        this.f333277d = f7;
        this.f333278e = f8;
        this.f333279f = f9;
    }

    /* renamed from: a */
    public static C111315a m151794a(int i) {
        C111332i iVar = C111332i.f333312k;
        float b = C111316b.m151798b(Color.red(i));
        float b2 = C111316b.m151798b(Color.green(i));
        float b3 = C111316b.m151798b(Color.blue(i));
        float[][] fArr = C111316b.f333283d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * b) + (fArr2[1] * b2) + (fArr2[2] * b3);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * b) + (fArr3[1] * b2) + (fArr3[2] * b3);
        float[] fArr4 = fArr[2];
        float f3 = (b * fArr4[0]) + (b2 * fArr4[1]) + (b3 * fArr4[2]);
        float[][] fArr5 = C111316b.f333280a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[0] * f) + (fArr6[1] * f2) + (fArr6[2] * f3);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[0] * f) + (fArr7[1] * f2) + (fArr7[2] * f3);
        float[] fArr8 = fArr5[2];
        float f6 = (f * fArr8[0]) + (f2 * fArr8[1]) + (f3 * fArr8[2]);
        float[] fArr9 = iVar.f333319g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float pow = (float) Math.pow(((double) (iVar.f333320h * Math.abs(f7))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (iVar.f333320h * Math.abs(f8))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (iVar.f333320h * Math.abs(f9))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f7) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f15 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f16 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f17 = signum2 * 20.0f;
        float f18 = (((signum * 20.0f) + f17) + (21.0f * signum3)) / 20.0f;
        float f19 = (((signum * 40.0f) + f17) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f16, (double) f15)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f19 * iVar.f333314b) / iVar.f333313a), (double) (iVar.f333316d * iVar.f333322j))) * 100.0f;
        float sqrt = (4.0f / iVar.f333316d) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (iVar.f333313a + 4.0f) * iVar.f333321i;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) iVar.f333318f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * iVar.f333317e) * iVar.f333315c) * ((float) Math.sqrt((double) ((f15 * f15) + (f16 * f16))))) / (f18 + 0.305f)), 0.9d));
        float sqrt2 = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f26 = sqrt2 * iVar.f333321i;
        float sqrt3 = ((float) Math.sqrt((double) ((pow5 * iVar.f333316d) / (iVar.f333313a + 4.0f)))) * 50.0f;
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * f26) + 1.0f))) * 43.85965f;
        double d2 = (double) f25;
        return new C111315a(atan2, sqrt2, pow4, sqrt, f26, sqrt3, f27, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: b */
    public static C111315a m151795b(float f, float f2, float f3) {
        float f4 = f;
        C111332i iVar = C111332i.f333312k;
        double d = ((double) f4) / 100.0d;
        float sqrt = (4.0f / iVar.f333316d) * ((float) Math.sqrt(d)) * (iVar.f333313a + 4.0f);
        float f5 = iVar.f333321i;
        float f6 = sqrt * f5;
        float f7 = f5 * f2;
        float sqrt2 = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * iVar.f333316d) / (iVar.f333313a + 4.0f)))) * 50.0f;
        float f8 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) f7) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f3) / 180.0f);
        return new C111315a(f3, f2, f, f6, f7, sqrt2, f8, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: c */
    public int mo163011c(C111332i iVar) {
        float f;
        C111332i iVar2 = iVar;
        float f2 = this.f333275b;
        if (((double) f2) != 0.0d) {
            float f3 = this.f333276c;
            if (((double) f3) != 0.0d) {
                f = f2 / ((float) Math.sqrt(((double) f3) / 100.0d));
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) iVar2.f333318f), 0.73d), 1.1111111111111112d);
                double d = (double) ((this.f333274a * 3.1415927f) / 180.0f);
                float pow2 = iVar2.f333313a * ((float) Math.pow(((double) this.f333276c) / 100.0d, (1.0d / ((double) iVar2.f333316d)) / ((double) iVar2.f333322j)));
                float cos = ((float) (Math.cos(2.0d + d) + 3.8d)) * 0.25f * 3846.1538f * iVar2.f333317e * iVar2.f333315c;
                float f4 = pow2 / iVar2.f333314b;
                float sin = (float) Math.sin(d);
                float cos2 = (float) Math.cos(d);
                float f5 = (((0.305f + f4) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f4 * 460.0f;
                float f9 = (((451.0f * f6) + f8) + (288.0f * f7)) / 1403.0f;
                float f15 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f16 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f9) * (100.0f / iVar2.f333320h) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
                float signum2 = Math.signum(f15) * (100.0f / iVar2.f333320h) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))))), 2.380952380952381d));
                float[] fArr = iVar2.f333319g;
                float f17 = signum / fArr[0];
                float f18 = signum2 / fArr[1];
                float signum3 = ((Math.signum(f16) * (100.0f / iVar2.f333320h)) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = C111316b.f333281b;
                float[] fArr3 = fArr2[0];
                float f19 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * signum3);
                float[] fArr4 = fArr2[1];
                float[] fArr5 = fArr2[2];
                return C90885a.m113998c((double) f19, (double) ((fArr4[0] * f17) + (fArr4[1] * f18) + (fArr4[2] * signum3)), (double) ((f17 * fArr5[0]) + (f18 * fArr5[1]) + (signum3 * fArr5[2])));
            }
        }
        f = 0.0f;
        float pow3 = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) iVar2.f333318f), 0.73d), 1.1111111111111112d);
        double d2 = (double) ((this.f333274a * 3.1415927f) / 180.0f);
        float pow22 = iVar2.f333313a * ((float) Math.pow(((double) this.f333276c) / 100.0d, (1.0d / ((double) iVar2.f333316d)) / ((double) iVar2.f333322j)));
        float cos3 = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * iVar2.f333317e * iVar2.f333315c;
        float f44 = pow22 / iVar2.f333314b;
        float sin2 = (float) Math.sin(d2);
        float cos22 = (float) Math.cos(d2);
        float f54 = (((0.305f + f44) * 23.0f) * pow3) / (((cos3 * 23.0f) + ((11.0f * pow3) * cos22)) + ((pow3 * 108.0f) * sin2));
        float f64 = cos22 * f54;
        float f74 = f54 * sin2;
        float f84 = f44 * 460.0f;
        float f94 = (((451.0f * f64) + f84) + (288.0f * f74)) / 1403.0f;
        float f152 = ((f84 - (891.0f * f64)) - (261.0f * f74)) / 1403.0f;
        float f162 = ((f84 - (f64 * 220.0f)) - (f74 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f94) * (100.0f / iVar2.f333320h) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f94)) * 27.13d) / (400.0d - ((double) Math.abs(f94))))), 2.380952380952381d));
        float signum22 = Math.signum(f152) * (100.0f / iVar2.f333320h) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f152)) * 27.13d) / (400.0d - ((double) Math.abs(f152))))), 2.380952380952381d));
        float[] fArr6 = iVar2.f333319g;
        float f172 = signum4 / fArr6[0];
        float f182 = signum22 / fArr6[1];
        float signum32 = ((Math.signum(f162) * (100.0f / iVar2.f333320h)) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f162)) * 27.13d) / (400.0d - ((double) Math.abs(f162))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = C111316b.f333281b;
        float[] fArr32 = fArr22[0];
        float f192 = (fArr32[0] * f172) + (fArr32[1] * f182) + (fArr32[2] * signum32);
        float[] fArr42 = fArr22[1];
        float[] fArr52 = fArr22[2];
        return C90885a.m113998c((double) f192, (double) ((fArr42[0] * f172) + (fArr42[1] * f182) + (fArr42[2] * signum32)), (double) ((f172 * fArr52[0]) + (f182 * fArr52[1]) + (signum32 * fArr52[2])));
    }
}
