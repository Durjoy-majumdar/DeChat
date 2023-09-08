package nd0;

/* renamed from: nd0.a */
public class C117622a {

    /* renamed from: a */
    public int f351850a = 0;

    /* renamed from: b */
    public int f351851b = 0;

    /* renamed from: c */
    public int f351852c = 0;

    /* renamed from: d */
    public short[] f351853d;

    public C117622a(int i) {
        this.f351853d = new short[(i <= 1 ? 512 : i)];
    }

    /* renamed from: a */
    public int mo182347a(short[] sArr, int i) {
        if (i > sArr.length) {
            i = sArr.length;
        }
        if (i == 0) {
            return 0;
        }
        short[] sArr2 = this.f351853d;
        int length = sArr2.length;
        int i2 = this.f351852c;
        if (i >= i2) {
            i = i2;
        }
        int i3 = this.f351850a;
        if (i <= length - i3) {
            System.arraycopy(sArr2, i3, sArr, 0, i);
            int i4 = this.f351850a + i;
            this.f351850a = i4;
            if (i4 >= length) {
                this.f351850a = 0;
            }
        } else {
            int i5 = length - i3;
            System.arraycopy(sArr2, i3, sArr, 0, i5);
            int i6 = i - i5;
            System.arraycopy(this.f351853d, 0, sArr, i5, i6);
            this.f351850a = i6;
        }
        this.f351852c -= i;
        return i;
    }
}
