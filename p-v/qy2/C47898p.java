package qy2;

import rz2.C48201c;
import uz2.C52691j0;

/* renamed from: qy2.p */
public interface C47898p extends C47901s {

    /* renamed from: qy2.p$a */
    public static final class C47899a {
        /* renamed from: a */
        public static /* synthetic */ void m53214a(C47898p pVar, String str, C48201c cVar, C52691j0 j0Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    j0Var = new C52691j0();
                }
                pVar.mo72646a(str, cVar, j0Var);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
    }

    /* renamed from: a */
    void mo72646a(String str, C48201c cVar, C52691j0 j0Var);
}
