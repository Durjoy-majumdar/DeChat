package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54985m;
import cl1.C54991o;
import te3.C64740tw0;

/* renamed from: qj1.s1 */
public final class C62969s1<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f178673d;

    public C62969s1(C12690u1 u1Var) {
        this.f178673d = u1Var;
    }

    public void onChanged(Object obj) {
        C54985m.C54987c cVar = (C54985m.C54987c) obj;
        Class cls = C54991o.class;
        boolean z = true;
        if (cVar == null || !cVar.f154169b) {
            z = false;
        }
        if (z) {
            ((C54991o) this.f178673d.mo87696x0(cls)).f154278X1.f1589e = 2;
            C12690u1 u1Var = this.f178673d;
            C64740tw0 tw02 = cVar.f154168a;
            C12690u1.m12191Z0(u1Var, new C54985m.C0671b(tw02.f185685d, tw02.f185686e, tw02.f185687f ? 1 : 0));
            return;
        }
        ((C54991o) this.f178673d.mo87696x0(cls)).f154278X1.f1589e = 0;
        C12690u1 u1Var2 = this.f178673d;
        C12690u1.m12191Z0(u1Var2, ((C54985m) u1Var2.mo87696x0(C54985m.class)).f154166q);
    }
}
