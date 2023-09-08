package androidx.lifecycle;

import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import f14.C58901s;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReference;
import wx3.C15601d;

/* renamed from: androidx.lifecycle.q */
public final class C54217q {
    /* renamed from: a */
    public static final C54213l m60905a(C39623j jVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        C87412m.m108594g(jVar, "$this$coroutineScope");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) jVar.mInternalScopeRef.get();
            if (lifecycleCoroutineScopeImpl2 == null) {
                z = true;
                C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
                C53896h0 h0Var = C53872d1.f151117a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(jVar, ((C53884f2) a).plus(C58901s.f168555a.mo74590i0()));
                AtomicReference<Object> atomicReference = jVar.mInternalScopeRef;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                return lifecycleCoroutineScopeImpl2;
            }
        } while (!z);
        C53896h0 h0Var2 = C53872d1.f151117a;
        C53895h.m60466d(lifecycleCoroutineScopeImpl, C58901s.f168555a.mo74590i0(), (C53934p0) null, new C54214m(lifecycleCoroutineScopeImpl, (C15601d) null), 2, (Object) null);
        return lifecycleCoroutineScopeImpl;
    }
}
