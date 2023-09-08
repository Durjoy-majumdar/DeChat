package p331dj;

/* renamed from: dj.b */
public class C20460b {

    /* renamed from: a */
    public int f57492a = 0;

    /* renamed from: b */
    public int f57493b = 0;

    /* renamed from: c */
    public byte[] f57494c = null;

    /* renamed from: d */
    public int f57495d = 0;

    /* renamed from: e */
    public int f57496e = 0;

    /* renamed from: a */
    public int mo32009a() {
        int i = this.f57495d;
        int i2 = this.f57496e;
        if (i == i2) {
            return 0;
        }
        if (i < i2) {
            this.f57493b = i2 - i;
        } else if (i > i2) {
            this.f57493b = (i2 + this.f57492a) - i;
        }
        return this.f57493b;
    }

    /* renamed from: b */
    public int mo32010b(byte[] bArr, int i) {
        int i2 = -1;
        if (i > 0 && i <= mo32009a() && bArr != null) {
            int i3 = this.f57495d;
            int i4 = this.f57496e;
            if (i3 == i4) {
                return -1;
            }
            i2 = 0;
            if (i3 < i4) {
                System.arraycopy(this.f57494c, i3, bArr, 0, i);
                this.f57495d += i;
            } else {
                int i5 = this.f57492a;
                if (i <= i5 - i3) {
                    System.arraycopy(this.f57494c, i3, bArr, 0, i);
                    this.f57495d += i;
                } else {
                    System.arraycopy(this.f57494c, i3, bArr, 0, i5 - i3);
                    byte[] bArr2 = this.f57494c;
                    int i6 = this.f57492a;
                    int i7 = this.f57495d;
                    System.arraycopy(bArr2, 0, bArr, i6 - i7, i - (i6 - i7));
                    this.f57495d = i - (this.f57492a - this.f57495d);
                }
            }
        }
        return i2;
    }
}
