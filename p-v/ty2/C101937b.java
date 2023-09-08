package ty2;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import pc0.C100760a0;
import qy2.C12935w;
import sy0.C48503b;
import ty0.C101932a;
import ty0.C101936i;
import z51.C102974e;

/* renamed from: ty2.b */
public final class C101937b extends C101932a implements C101936i {
    /* renamed from: O */
    public C100760a0.C100761a mo126118O(C100760a0.C100764f fVar) {
        C100760a0.C100761a aVar = new C100760a0.C100761a();
        if (fVar instanceof C102974e) {
            String str = fVar.f295187a;
            C87412m.m108593f(str, "sessionId");
            fVar.f295187a = mo126123n0(str);
            fVar.f295188b = mo126122j0(str);
            String str2 = fVar.f295188b;
            C87412m.m108593f(str2, "params.fromUser");
            String str3 = fVar.f295187a;
            C87412m.m108593f(str3, "params.toUser");
            IEmojiInfo b = ((C102974e) fVar).mo141687b();
            C87412m.m108593f(b, "params.emojiInfo");
            aVar.f295177a = new C48503b(4, str, str2, str3, b, fVar.f295192f);
        }
        return aVar;
    }

    /* renamed from: S */
    public boolean mo126119S(C100760a0.C100764f fVar) {
        C87412m.m108594g(fVar, "params");
        if (fVar instanceof C92855q0) {
            String str = ((C92855q0) fVar).f267460C;
            String str2 = C72994y1.f212832a;
            if (str != null && str.endsWith("statussquaremsg")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo126120d(C100760a0.C100764f fVar) {
        C87412m.m108591d(fVar);
        return C72996z1.m85799F5(fVar.f295187a) || mo126119S(fVar);
    }

    /* renamed from: g0 */
    public int mo126121g0() {
        return 4;
    }

    /* renamed from: j0 */
    public String mo126122j0(String str) {
        C87412m.m108594g(str, "sessionId");
        String d3 = ((C12935w) C86312j.m106911c(C12935w.class)).mo12484d3(str);
        C87412m.m108593f(d3, "getService(ITextStatusSe…tSessionSender(sessionId)");
        return d3;
    }

    /* renamed from: n0 */
    public String mo126123n0(String str) {
        C87412m.m108594g(str, "sessionId");
        String n = ((C12935w) C86312j.m106911c(C12935w.class)).mo12485n(str);
        C87412m.m108593f(n, "getService(ITextStatusSe…alkerFromLocal(sessionId)");
        return n;
    }
}
