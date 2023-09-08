package j24;

/* renamed from: j24.u */
public final class C21193u {

    /* renamed from: a */
    public int f59962a;

    /* renamed from: b */
    public final int[] f59963b = new int[10];

    /* renamed from: a */
    public int mo33163a() {
        if ((this.f59962a & 128) != 0) {
            return this.f59963b[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public C21193u mo33164b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f59963b;
            if (i < iArr.length) {
                this.f59962a = (1 << i) | this.f59962a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
