package e14;

import c14.C54624g;
import d14.C58050i1;
import d14.C58100z0;
import gy3.C87412m;

/* renamed from: e14.b0 */
public final class C58475b0 extends C58100z0<Integer> implements C58050i1<Integer> {
    public C58475b0(int i) {
        super(1, Integer.MAX_VALUE, C54624g.DROP_OLDEST);
        mo82832d(Integer.valueOf(i));
    }

    public Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f166163n;
            C87412m.m108591d(objArr);
            valueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f166164o + ((long) ((int) ((mo82845p() + ((long) this.f166166q)) - this.f166164o)))) - 1))]).intValue());
        }
        return valueOf;
    }
}
