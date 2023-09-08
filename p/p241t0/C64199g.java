package p241t0;

import fy3.C32227p;
import java.util.ArrayList;
import java.util.Set;
import rx3.C13598b0;

/* renamed from: t0.g */
public final class C64199g implements C64198e {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Set<? extends Object>, C110849h, C13598b0> f181920a;

    public C64199g(C32227p<? super Set<? extends Object>, ? super C110849h, C13598b0> pVar) {
        this.f181920a = pVar;
    }

    public final void dispose() {
        C32227p<Set<? extends Object>, C110849h, C13598b0> pVar = this.f181920a;
        synchronized (C110865n.f331651c) {
            ((ArrayList) C110865n.f331655g).remove(pVar);
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
