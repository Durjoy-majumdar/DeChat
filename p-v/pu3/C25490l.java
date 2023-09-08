package pu3;

import java.util.Arrays;
import pu3.C25499u;
import ru3.C26118c;

/* renamed from: pu3.l */
public final class C25490l extends C25499u.C25500a.C25501a<C25490l> {

    /* renamed from: e */
    public byte[] f72139e;

    public C25490l(int i, byte[] bArr) {
        super(i);
        this.f72139e = bArr;
    }

    public int compareTo(Object obj) {
        return C26118c.m33546d(this.f72139e, ((C25490l) obj).f72139e);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25490l) && C26118c.m33546d(this.f72139e, ((C25490l) obj).f72139e) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f72139e);
    }
}
