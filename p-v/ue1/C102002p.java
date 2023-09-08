package ue1;

import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60179k4;
import pc0.C100760a0;
import ty0.C101932a;
import ty0.C101936i;

/* renamed from: ue1.p */
public final class C102002p extends C101932a implements C101936i {
    /* renamed from: S */
    public boolean mo126119S(C100760a0.C100764f fVar) {
        C87412m.m108594g(fVar, "params");
        if (fVar instanceof C92855q0) {
            String str = ((C92855q0) fVar).f267460C;
            String str2 = C72994y1.f212832a;
            if (str != null && str.endsWith("findermsg")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo126120d(C100760a0.C100764f fVar) {
        C87412m.m108591d(fVar);
        return ((C60179k4) C86312j.m106911c(C60179k4.class)).p70(fVar.f295187a) || mo126119S(fVar);
    }

    /* renamed from: g0 */
    public int mo126121g0() {
        return 1;
    }

    /* renamed from: j0 */
    public String mo126122j0(String str) {
        C87412m.m108594g(str, "sessionId");
        String d3 = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78768d3(str);
        C87412m.m108593f(d3, "getService(IFinderSessio…tSessionSender(sessionId)");
        return d3;
    }

    /* renamed from: n0 */
    public String mo126123n0(String str) {
        C87412m.m108594g(str, "sessionId");
        String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(str);
        C87412m.m108593f(n, "getService(IFinderSessio…alkerFromLocal(sessionId)");
        return n;
    }
}
