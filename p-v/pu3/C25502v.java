package pu3;

import java.util.Arrays;
import pu3.C25499u;
import ru3.C26118c;

/* renamed from: pu3.v */
public final class C25502v extends C25499u.C25500a.C25501a<C25502v> {

    /* renamed from: f */
    public static final C25502v f72186f = new C25502v(0, C25478i.f72124e);

    /* renamed from: e */
    public short[] f72187e;

    public C25502v(int i, short[] sArr) {
        super(i);
        this.f72187e = sArr;
    }

    public int compareTo(Object obj) {
        return C26118c.m33547e(this.f72187e, ((C25502v) obj).f72187e);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C25502v) && C26118c.m33547e(this.f72187e, ((C25502v) obj).f72187e) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f72187e);
    }
}
