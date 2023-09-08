package p384tk;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tk.c */
public final class C101899c {

    /* renamed from: a */
    public final int f300057a;

    /* renamed from: b */
    public final int[] f300058b;

    /* renamed from: c */
    public boolean f300059c;

    /* renamed from: d */
    public int f300060d;

    public C101899c(int i) {
        this.f300057a = i;
        this.f300058b = new int[i];
    }

    /* renamed from: a */
    public final int mo141396a(int i) {
        if (this.f300057a <= 0) {
            return -1;
        }
        boolean z = this.f300059c;
        if (!z && i > this.f300060d) {
            return -1;
        }
        if (z) {
            i %= this.f300060d;
        }
        int i2 = 0;
        int i3 = this.f300058b[0];
        while (i3 < i) {
            i2++;
            i3 += this.f300058b[i2];
        }
        return i2;
    }

    /* renamed from: b */
    public final void mo141397b(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i < this.f300057a)) {
            Log.m105924i("MicroMsg.FramePicker", "setFrameTime: invalid index " + i);
        }
        int i3 = this.f300060d;
        int[] iArr = this.f300058b;
        iArr[i] = i2;
        this.f300060d = (i3 - iArr[i]) + i2;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (!(iArr[i4] > 0)) {
                z = false;
                break;
            }
            i4++;
        }
        this.f300059c = z;
    }
}
