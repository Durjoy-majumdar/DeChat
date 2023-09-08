package com.tencent.p014mm.p136ui.indicator;

import android.graphics.Color;

/* renamed from: com.tencent.mm.ui.indicator.a */
public class C106713a {

    /* renamed from: a */
    public int[] f319048a;

    /* renamed from: b */
    public int[] f319049b;

    public C106713a(int i, int i2, int i3) {
        this.f319048a = mo153713b(i);
        this.f319049b = mo153713b(i2);
    }

    /* renamed from: a */
    public int mo153712a(int i) {
        int[] iArr = new int[4];
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f319049b;
            if (i2 >= iArr2.length) {
                return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            int i3 = this.f319048a[i2];
            iArr[i2] = (int) (((double) i3) + (((((double) (iArr2[i2] - i3)) * 1.0d) / ((double) 100)) * ((double) i)));
            i2++;
        }
    }

    /* renamed from: b */
    public final int[] mo153713b(int i) {
        return new int[]{Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i)};
    }
}
