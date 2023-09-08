package xy2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import p629ny.C76979h;
import rz2.C48212k;
import z04.C112551y;

/* renamed from: xy2.e */
public final class C38914e implements C44668u3.C44670b {
    /* renamed from: J1 */
    public void mo433J1(C44668u3 u3Var, C72996z1 z1Var) {
    }

    /* renamed from: K4 */
    public int mo434K4(C72996z1 z1Var, boolean z) {
        return (z1Var != null && C72996z1.m85799F5(z1Var.getUsername())) ? 1 : -1;
    }

    public C72996z1 get(String str) {
        C72996z1 z1Var;
        boolean z = false;
        if ((str == null || C112551y.m153811k(str)) || !C72996z1.m85799F5(str)) {
            return null;
        }
        C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(str);
        if (wx02 != null) {
            z1Var = new C72996z1();
            String str2 = wx02.field_nickname;
            if (str2 == null || C112551y.m153811k(str2)) {
                z = true;
            }
            z1Var.mo62878U2(z ? "​" : wx02.field_nickname);
            z1Var.f214114V1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), wx02.field_nickname);
            z1Var.setUsername(wx02.field_userName);
            z1Var.f108320R1 = z1Var.systemRowid;
        } else {
            z1Var = new C72996z1();
        }
        z1Var.setUsername(str);
        return z1Var;
    }
}
