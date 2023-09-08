package x24;

/* renamed from: x24.a */
public class C91135a implements Cloneable {

    /* renamed from: d */
    public char[] f261353d;

    /* renamed from: e */
    public int f261354e;

    public C91135a() {
        this(32);
    }

    /* renamed from: a */
    public C91135a mo125201a(String str) {
        int length;
        if (str != null && (length = str.length()) > 0) {
            int i = this.f261354e;
            mo125202b(i + length);
            str.getChars(0, length, this.f261353d, i);
            this.f261354e += length;
        }
        return this;
    }

    /* renamed from: b */
    public C91135a mo125202b(int i) {
        char[] cArr = this.f261353d;
        if (i > cArr.length) {
            char[] cArr2 = new char[(i * 2)];
            this.f261353d = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.f261354e);
        }
        return this;
    }

    public Object clone() {
        C91135a aVar = (C91135a) super.clone();
        char[] cArr = new char[this.f261353d.length];
        aVar.f261353d = cArr;
        char[] cArr2 = this.f261353d;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C91135a)) {
            return false;
        }
        C91135a aVar = (C91135a) obj;
        if (this != aVar) {
            int i = this.f261354e;
            if (i != aVar.f261354e) {
                return false;
            }
            char[] cArr = this.f261353d;
            char[] cArr2 = aVar.f261353d;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (cArr[i2] != cArr2[i2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        char[] cArr = this.f261353d;
        int i = 0;
        for (int i2 = this.f261354e - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    public String toString() {
        return new String(this.f261353d, 0, this.f261354e);
    }

    public C91135a(int i) {
        this.f261353d = new char[(i <= 0 ? 32 : i)];
    }
}
