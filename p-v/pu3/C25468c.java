package pu3;

import java.util.Arrays;
import pu3.C25499u;
import ru3.C26118c;

/* renamed from: pu3.c */
public class C25468c extends C25499u.C25500a.C25501a<C25468c> {

    /* renamed from: e */
    public int[] f72085e;

    public C25468c(int i, int[] iArr) {
        super(i);
        this.f72085e = iArr;
    }

    /* renamed from: a */
    public int compareTo(C25468c cVar) {
        int length = this.f72085e.length;
        int length2 = cVar.f72085e.length;
        if (length != length2) {
            return C26118c.m33548f(length, length2);
        }
        for (int i = 0; i < length; i++) {
            int i2 = this.f72085e[i];
            int i3 = cVar.f72085e[i];
            if (i2 != i3) {
                return C26118c.m33548f(i2, i3);
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25468c) && compareTo((C25468c) obj) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f72085e);
    }
}
