package p175j0;

import gy3.C87412m;
import java.util.Arrays;

/* renamed from: j0.k0 */
public final class C24708k0 {

    /* renamed from: a */
    public int[] f70474a = new int[10];

    /* renamed from: b */
    public int f70475b;

    /* renamed from: a */
    public final int mo51654a() {
        int[] iArr = this.f70474a;
        int i = this.f70475b - 1;
        this.f70475b = i;
        return iArr[i];
    }

    /* renamed from: b */
    public final void mo51655b(int i) {
        int i2 = this.f70475b;
        int[] iArr = this.f70474a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            this.f70474a = copyOf;
        }
        int[] iArr2 = this.f70474a;
        int i3 = this.f70475b;
        this.f70475b = i3 + 1;
        iArr2[i3] = i;
    }
}
