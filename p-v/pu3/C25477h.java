package pu3;

import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.h */
public class C25477h extends C25499u.C25500a.C25501a<C25477h> {

    /* renamed from: e */
    public int f72121e;

    /* renamed from: f */
    public int[] f72122f;

    /* renamed from: g */
    public byte[] f72123g;

    public C25477h(int i, int i2, int[] iArr, byte[] bArr) {
        super(i);
        this.f72121e = i2;
        this.f72122f = iArr;
        this.f72123g = bArr;
    }

    /* renamed from: a */
    public int compareTo(C25477h hVar) {
        int i = this.f72121e;
        int i2 = hVar.f72121e;
        if (i != i2) {
            return i - i2;
        }
        int[] iArr = this.f72122f;
        int[] iArr2 = hVar.f72122f;
        int length = iArr.length;
        int length2 = iArr2.length;
        int i3 = 0;
        if (length < length2) {
            i3 = -1;
        } else if (length > length2) {
            i3 = 1;
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                int f = C26118c.m33548f(iArr[i4], iArr2[i4]);
                if (f != 0) {
                    i3 = f;
                    break;
                }
                i4++;
            }
        }
        return i3 != 0 ? i3 : C26118c.m33546d(this.f72123g, hVar.f72123g);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25477h) && compareTo((C25477h) obj) == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Integer.valueOf(this.f72121e), this.f72122f, this.f72123g);
    }
}
