package com.tencent.neattextview.textview.layout;

import android.text.TextPaint;
import android.text.TextUtils;
import j20.C117292a;
import k20.C9556a;
import wr3.C111862a;
import yr3.C112481c;
import yr3.C112482d;

public class NeatLayout extends C112481c {

    /* renamed from: L */
    public int f319992L = 0;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("linebreak");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/neattextview/textview/layout/NeatLayout", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/neattextview/textview/layout/NeatLayout", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public NeatLayout(CharSequence charSequence, float[] fArr) {
        super(charSequence, fArr);
    }

    private native int nComputeBreak(String str, float[] fArr, float[] fArr2, float f, int[] iArr, float[] fArr3, float f2, boolean[] zArr, char[] cArr, float[] fArr4, char[] cArr2, float[] fArr5, boolean[] zArr2);

    /* renamed from: f */
    public void mo154967f(TextPaint textPaint, float[] fArr, float f, float f2, float f3, int i, TextUtils.TruncateAt truncateAt, boolean z) {
        float f4;
        NeatLayout neatLayout = this;
        float[] fArr2 = fArr;
        int i2 = i;
        float round = (float) Math.round(textPaint.getTextSize() / 2.0f);
        float textSize = z ? textPaint.getTextSize() / 6.0f : 0.0f;
        int length = neatLayout.f336800b.length();
        int[] iArr = new int[length];
        float[] fArr3 = new float[length];
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 < fArr2.length; i3++) {
            fArr2[i3] = fArr2[i3] + round;
        }
        boolean[] zArr2 = zArr;
        float[] fArr4 = fArr3;
        int[] iArr2 = iArr;
        float f5 = round;
        int i4 = i2;
        int nComputeBreak = nComputeBreak(neatLayout.f336800b, neatLayout.f336803e, fArr, f + round, iArr, fArr3, textSize, zArr, C111862a.f334906b, neatLayout.f336806h, C111862a.f334905a, neatLayout.f336805g, neatLayout.f336795F);
        neatLayout.f319992L = nComputeBreak;
        int i5 = 0;
        float f6 = 0.0f;
        while (i5 < nComputeBreak && i5 < i4) {
            float f7 = fArr4[i5];
            float[] fArr5 = fArr;
            int i6 = i4;
            float f8 = i5 < fArr5.length ? fArr5[i5] : f;
            if (f6 < f7) {
                f6 = Math.min(f7, f8);
            }
            i5++;
            i4 = i6;
        }
        float[] fArr6 = fArr;
        int i7 = i4;
        int i8 = 0;
        int i9 = 0;
        while (i9 < nComputeBreak && i9 < i7) {
            int i15 = iArr2[i9];
            boolean z2 = zArr2[i9];
            int i16 = i15 - i8;
            float f9 = i9 < fArr6.length ? fArr6[i9] - f5 : f;
            float f15 = f9 - fArr4[i9];
            if (f15 > 0.0f) {
                f15 -= 2.0f;
            }
            boolean z3 = f15 < 0.0f || Math.abs(f15) - 1.0f <= f5;
            if (z3) {
                int i17 = i15 - 1;
                if (i17 >= 0 && neatLayout.f336801c[i17] == 10) {
                    i16--;
                }
                for (int i18 = i8; i18 < i15; i18++) {
                    if (neatLayout.f336801c[i18] != 10 && neatLayout.f336803e[i18] == 0.0f) {
                        i16--;
                    }
                }
                f4 = f15 / ((float) (Math.max(2, i16) - 1));
            } else {
                f4 = 0.0f;
            }
            float f16 = z3 ? f9 : fArr4[i9];
            char[] cArr = neatLayout.f336801c;
            float[] fArr7 = neatLayout.f336803e;
            int size = neatLayout.f336808j.size();
            float f17 = z3 ? f9 : f6;
            float f18 = neatLayout.f336813o;
            if (neatLayout.f336804f != null) {
                for (int i19 = i8; i19 < i15; i19++) {
                    float f19 = neatLayout.f336804f[i19];
                    if (f19 > neatLayout.f336813o) {
                        f18 = f19;
                    }
                }
            }
            float f25 = f18;
            C112482d dVar = r0;
            C112482d dVar2 = new C112482d(this, cArr, i8, i15, 0.0f, neatLayout.f336793D, fArr7, f16, f25, f4, neatLayout.f336802d, z2, textSize, size, neatLayout.f336817s, f17);
            this.f336793D += f25;
            this.f336808j.add(dVar);
            i9++;
            fArr6 = fArr;
            i7 = i;
            neatLayout = this;
            nComputeBreak = nComputeBreak;
            i8 = i15;
        }
        NeatLayout neatLayout2 = neatLayout;
    }

    /* renamed from: l0 */
    public int mo109128l0() {
        return this.f319992L;
    }
}
