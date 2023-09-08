package bz1;

import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import xy1.C53475k;

/* renamed from: bz1.e */
public final class C0395e implements C44668u3.C44670b {
    /* renamed from: J1 */
    public void mo433J1(C44668u3 u3Var, C72996z1 z1Var) {
    }

    /* renamed from: K4 */
    public int mo434K4(C72996z1 z1Var, boolean z) {
        return (z1Var != null && C72996z1.m85832c5(z1Var.getUsername())) ? 1 : -1;
    }

    public C72996z1 get(String str) {
        if ((str == null || str.length() == 0) || !C72996z1.m85832c5(str)) {
            return null;
        }
        C0394d vx02 = ((C0396g) C86312j.m106911c(C0396g.class)).mo440X3(((C53475k) C86312j.m106911c(C53475k.class)).mo59162n(str));
        C72996z1 V = vx02 != null ? vx02.mo423V() : new C72996z1();
        V.setUsername(str);
        return V;
    }
}
