package d14;

import a14.C53921m;
import e14.C58476c;
import e14.C58479d;
import f14.C58872c0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;

/* renamed from: d14.l1 */
public final class C58060l1 extends C58479d<C58052j1<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f166065a = AtomicReferenceFieldUpdater.newUpdater(C58060l1.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    /* renamed from: a */
    public boolean mo82814a(Object obj) {
        C58052j1 j1Var = (C58052j1) obj;
        if (this._state != null) {
            return false;
        }
        this._state = C58056k1.f166052a;
        return true;
    }

    /* renamed from: b */
    public C15601d[] mo82815b(Object obj) {
        C58052j1 j1Var = (C58052j1) obj;
        this._state = null;
        return C58476c.f167459a;
    }

    /* renamed from: c */
    public final Object mo82837c(C15601d<? super C13598b0> dVar) {
        boolean z = true;
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f166065a;
        C58872c0 c0Var = C58056k1.f166052a;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != c0Var) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            Result.Companion companion = Result.Companion;
            mVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        Object o = mVar.mo74608o();
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
