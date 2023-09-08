package p495dq;

import com.tencent.p014mm.storage.C30764p2;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import jg3.C98942a;
import p441aq.C92054g;
import z51.C39315g;
import zc3.C103010b;
import zc3.C39343a;

@C86522b
/* renamed from: dq.e */
public class C31238e extends C86301e implements C39315g {

    /* renamed from: d */
    public final C103010b[] f83692d = {null};

    /* renamed from: Cd */
    public C30764p2 mo58033Cd() {
        return ((C92054g) C86312j.m106911c(C92054g.class)).mo126027Cd();
    }

    /* renamed from: O6 */
    public C30790w2 mo58034O6() {
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        return C30790w2.m39221h();
    }

    /* renamed from: cm */
    public C39343a mo58035cm() {
        return ((C92054g) C86312j.m106911c(C92054g.class)).xx0();
    }

    public C103010b getProvider() {
        C103010b[] bVarArr = this.f83692d;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                C103010b[] bVarArr2 = this.f83692d;
                if (bVarArr2[0] == null) {
                    bVarArr2[0] = new C98942a();
                }
            }
        }
        return this.f83692d[0];
    }
}
