package a14;

import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a14.e2 */
public abstract class C53879e2 extends C53852a0 implements C53883f1, C53954u1 {

    /* renamed from: g */
    public C53884f2 f151124g;

    /* renamed from: a */
    public boolean mo74502a() {
        return true;
    }

    /* renamed from: b */
    public C53920l2 mo74503b() {
        return null;
    }

    public void dispose() {
        boolean z;
        C53884f2 u = mo74505u();
        do {
            Object d0 = u.mo74531d0();
            if (d0 instanceof C53879e2) {
                if (d0 == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C53884f2.f151129d;
                    C53902i1 i1Var = C53899h2.f151151g;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(u, d0, i1Var)) {
                            if (atomicReferenceFieldUpdater.get(u) != d0) {
                                z = false;
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else if ((d0 instanceof C53954u1) && ((C53954u1) d0).mo74503b() != null) {
                mo75558q();
                return;
            } else {
                return;
            }
        } while (!z);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C53942r0.m60572a(this) + "[job@" + C53942r0.m60572a(mo74505u()) + ']';
    }

    /* renamed from: u */
    public final C53884f2 mo74505u() {
        C53884f2 f2Var = this.f151124g;
        if (f2Var != null) {
            return f2Var;
        }
        C87412m.m108603p("job");
        throw null;
    }
}
