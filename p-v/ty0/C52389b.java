package ty0;

import com.tencent.p014mm.app.C28686o1;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C27051f0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C87412m;
import p875ci.C67379u;
import rx3.C13598b0;

/* renamed from: ty0.b */
public abstract class C52389b<SESSION, CONVERSATION> implements C27051f0 {

    /* renamed from: ty0.b$a */
    public static final class C52390a {

        /* renamed from: a */
        public final PString f146445a;

        /* renamed from: b */
        public final PString f146446b;

        public C52390a(PString pString, PString pString2) {
            C87412m.m108594g(pString, "digestStr");
            C87412m.m108594g(pString2, "digestUser");
            this.f146445a = pString;
            this.f146446b = pString2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C52390a)) {
                return false;
            }
            C52390a aVar = (C52390a) obj;
            return C87412m.m108589b(this.f146445a, aVar.f146445a) && C87412m.m108589b(this.f146446b, aVar.f146446b);
        }

        public int hashCode() {
            return (this.f146445a.hashCode() * 31) + this.f146446b.hashCode();
        }

        public String toString() {
            return "DigestData(digestStr=" + this.f146445a + ", digestUser=" + this.f146446b + ')';
        }
    }

    /* renamed from: B */
    public abstract CONVERSATION mo70736B(String str);

    /* renamed from: D */
    public C52390a mo70737D(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "latestMsg");
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        PString pString = new PString();
        PString pString2 = new PString();
        PInt pInt = new PInt();
        ((C28686o1) ((C44660i2) Ku).mo69741L()).getClass();
        C67379u.m79740d(f4Var, pString, pString2, pInt, false);
        return new C52390a(pString, pString2);
    }

    /* renamed from: O */
    public abstract SESSION mo70738O(String str);

    /* renamed from: Q */
    public abstract void mo70739Q(String str);

    /* renamed from: S */
    public abstract void mo70740S(CONVERSATION conversation);

    /* renamed from: V4 */
    public void mo54204V4(C72963f4 f4Var, C75875l.C45886e eVar, boolean[] zArr) {
        C72963f4 f4Var2 = f4Var;
        C75875l.C45886e eVar2 = eVar;
        boolean[] zArr2 = zArr;
        C87412m.m108594g(eVar2, "notifyInfo");
        C87412m.m108594g(zArr2, "isConsumed");
        String str = eVar2.f123844a;
        if (str != null && mo70742f0(str)) {
            C13598b0 b0Var = null;
            if (f4Var2 != null) {
                C72963f4 f4Var3 = (f4Var.getMsgId() > 0 ? 1 : (f4Var.getMsgId() == 0 ? 0 : -1)) != 0 ? f4Var2 : null;
                if (f4Var3 != null) {
                    C52390a D = mo70737D(f4Var3);
                    int i = C87412m.m108589b(eVar2.f123845b, "insert") ? eVar2.f123847d : 0;
                    Object B = mo70736B(str);
                    mo70745q(B, f4Var2, eVar2);
                    Object g0 = mo70743g0(B, mo70738O(str), f4Var3, D, i, eVar);
                    if (g0 != null) {
                        mo70740S(g0);
                        mo70741d(g0, i, f4Var3);
                        b0Var = C13598b0.f38549a;
                    }
                }
            }
            if (b0Var == null) {
                mo70739Q(str);
            }
            zArr2[0] = true;
        }
    }

    /* renamed from: a2 */
    public void mo54205a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
    }

    /* renamed from: d */
    public abstract void mo70741d(CONVERSATION conversation, int i, C72963f4 f4Var);

    /* renamed from: f0 */
    public abstract boolean mo70742f0(String str);

    /* renamed from: g0 */
    public abstract CONVERSATION mo70743g0(CONVERSATION conversation, SESSION session, C72963f4 f4Var, C52390a aVar, int i, C75875l.C45886e eVar);

    /* renamed from: k3 */
    public void mo54206k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
    }

    /* renamed from: q */
    public abstract void mo70745q(CONVERSATION conversation, C72963f4 f4Var, C75875l.C45886e eVar);
}
