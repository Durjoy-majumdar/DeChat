package pu3;

import java.util.Arrays;
import pu3.C25499u;
import ru3.C26118c;

/* renamed from: pu3.b */
public class C25467b extends C25499u.C25500a.C25501a<C25467b> {

    /* renamed from: e */
    public int[] f72084e;

    public C25467b(int i, int[] iArr) {
        super(i);
        this.f72084e = iArr;
    }

    /* renamed from: a */
    public int compareTo(C25467b bVar) {
        int length = this.f72084e.length;
        int length2 = bVar.f72084e.length;
        if (length != length2) {
            return C26118c.m33548f(length, length2);
        }
        for (int i = 0; i < length; i++) {
            int i2 = this.f72084e[i];
            int i3 = bVar.f72084e[i];
            if (i2 != i3) {
                return C26118c.m33548f(i2, i3);
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25467b) && compareTo((C25467b) obj) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f72084e);
    }
}
