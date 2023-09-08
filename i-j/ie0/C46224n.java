package ie0;

import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: ie0.n */
public final class C46224n implements C44668u3.C44670b {
    /* renamed from: J1 */
    public void mo433J1(C44668u3 u3Var, C72996z1 z1Var) {
    }

    /* renamed from: K4 */
    public int mo434K4(C72996z1 z1Var, boolean z) {
        return (z1Var == null || !C72996z1.m85846q5(z1Var.getUsername())) ? -1 : 1;
    }

    public C72996z1 get(String str) {
        boolean z = true;
        C72996z1 z1Var = null;
        if ((str == null || str.length() == 0) || !C72996z1.m85846q5(str)) {
            return null;
        }
        C46225p pVar = C46225p.f124603a;
        if (str == null || str.length() == 0) {
            return null;
        }
        C101611g<String, C72996z1> gVar = C46225p.f124606d;
        C72996z1 z1Var2 = (C72996z1) ((C101062d) gVar).mo139556b(str);
        if (z1Var2 != null) {
            String username = z1Var2.getUsername();
            if (!(username == null || username.length() == 0)) {
                z = false;
            }
            if (!z) {
                return z1Var2;
            }
        }
        C46220j b = C46225p.m51524b(str);
        if (b != null) {
            z1Var = b.mo71631V();
        }
        C46225p pVar2 = C46225p.f124603a;
        if (z1Var == null) {
            return z1Var;
        }
        ((C101062d) gVar).mo139557c(str, z1Var);
        return z1Var;
    }
}
