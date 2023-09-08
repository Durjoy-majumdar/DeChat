package androidx.lifecycle;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53896h0;
import a14.C53959v2;
import a14.C53973z1;
import f14.C58901s;
import gy3.C87412m;

/* renamed from: androidx.lifecycle.j0 */
public final class C54208j0 {
    /* renamed from: a */
    public static final C0000n0 m60899a(C39622i0 i0Var) {
        C87412m.m108594g(i0Var, "$this$viewModelScope");
        C0000n0 n0Var = (C0000n0) i0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (n0Var != null) {
            return n0Var;
        }
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        Object tagIfAbsent = i0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C54203c(((C53884f2) a).plus(C58901s.f168555a.mo74590i0())));
        C87412m.m108593f(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C0000n0) tagIfAbsent;
    }
}
