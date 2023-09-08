package p175j0;

import hy3.C33145a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p708u0.C111061a;

/* renamed from: j0.i0 */
public final class C24701i0 implements C111061a, Iterable<Object>, C33145a {

    /* renamed from: d */
    public final /* synthetic */ C24704j0 f70451d;

    /* renamed from: e */
    public final /* synthetic */ int f70452e;

    public C24701i0(C24704j0 j0Var, int i) {
        this.f70451d = j0Var;
        this.f70452e = i;
    }

    public Iterator<Object> iterator() {
        C24704j0 j0Var = this.f70451d;
        C24729z1 z1Var = j0Var.f70459d;
        if (z1Var.f70559j == j0Var.f70462g) {
            int i = this.f70452e;
            return new C24704j0(z1Var, i + 1, i + C24659a2.m30850b(z1Var.f70553d, i));
        }
        throw new ConcurrentModificationException();
    }
}
