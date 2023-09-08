package p175j0;

import hy3.C33145a;
import java.util.Iterator;

/* renamed from: j0.c2 */
public final class C24664c2 implements Iterator<Object>, C33145a {

    /* renamed from: d */
    public int f70329d;

    /* renamed from: e */
    public final /* synthetic */ int f70330e;

    /* renamed from: f */
    public final /* synthetic */ C24661b2 f70331f;

    public C24664c2(int i, int i2, C24661b2 b2Var) {
        this.f70330e = i2;
        this.f70331f = b2Var;
        this.f70329d = i;
    }

    public boolean hasNext() {
        return this.f70329d < this.f70330e;
    }

    public Object next() {
        if (!hasNext()) {
            return null;
        }
        C24661b2 b2Var = this.f70331f;
        Object[] objArr = b2Var.f70309c;
        int i = this.f70329d;
        this.f70329d = i + 1;
        return objArr[b2Var.mo51517h(i)];
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
