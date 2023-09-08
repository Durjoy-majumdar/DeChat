package d14;

import e14.C58479d;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: d14.b1 */
public final class C58021b1 extends C58479d<C58100z0<?>> {

    /* renamed from: a */
    public long f165971a = -1;

    /* renamed from: b */
    public C15601d<? super C13598b0> f165972b;

    /* renamed from: a */
    public boolean mo82814a(Object obj) {
        C58100z0 z0Var = (C58100z0) obj;
        if (this.f165971a >= 0) {
            return false;
        }
        long j = z0Var.f166164o;
        if (j < z0Var.f166165p) {
            z0Var.f166165p = j;
        }
        this.f165971a = j;
        return true;
    }

    /* renamed from: b */
    public C15601d[] mo82815b(Object obj) {
        long j = this.f165971a;
        this.f165971a = -1;
        this.f165972b = null;
        return ((C58100z0) obj).mo82851v(j);
    }
}
