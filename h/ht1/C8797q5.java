package ht1;

import java.util.List;
import te3.C49098d51;
import te3.C49236e51;

/* renamed from: ht1.q5 */
public interface C8797q5 {

    /* renamed from: ht1.q5$a */
    public static final class C8798a {
        /* renamed from: a */
        public static /* synthetic */ void m8619a(C8797q5 q5Var, C49236e51 e512, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    e512 = null;
                }
                if ((i & 2) != 0) {
                    str = "";
                }
                q5Var.mo9628a(e512, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showList");
        }
    }

    /* renamed from: ht1.q5$b */
    public interface C8799b {
        /* renamed from: a */
        void mo9630a(List<C49098d51> list, int i);
    }

    /* renamed from: a */
    void mo9628a(C49236e51 e512, String str);

    /* renamed from: b */
    void mo9629b(C8799b bVar);
}
