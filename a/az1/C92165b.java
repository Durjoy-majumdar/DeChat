package az1;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import p215oo.C11586g;
import pc0.C100760a0;
import ty0.C101932a;
import ty0.C101936i;
import xy1.C53475k;
import z51.C102974e;

/* renamed from: az1.b */
public final class C92165b extends C101932a implements C101936i {
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
            aVar.f295177a = ((C11586g) C86312j.m106911c(C11586g.class)).mo11515Pv(3, str, str2, str3, b, fVar.f295192f);
        }
        return aVar;
    }

    /* renamed from: S */
    public boolean mo126119S(C100760a0.C100764f fVar) {
        C87412m.m108594g(fVar, "params");
        if (fVar instanceof C92855q0) {
            String str = ((C92855q0) fVar).f267460C;
            String str2 = C72994y1.f212832a;
            if (str != null && str.endsWith("gamelifesess")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo126120d(C100760a0.C100764f fVar) {
        if (C72996z1.m85832c5((String) null)) {
            return true;
        }
        C87412m.m108591d(fVar);
        return C72996z1.m85832c5(fVar.f295187a) || mo126119S(fVar);
    }

    /* renamed from: g0 */
    public int mo126121g0() {
        return 3;
    }

    /* renamed from: j0 */
    public String mo126122j0(String str) {
        C87412m.m108594g(str, "sessionId");
        String t1 = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str).mo59158t1();
        C87412m.m108593f(t1, "getService(IGameLifeSess…d(sessionId).selfUsername");
        return t1;
    }

    /* renamed from: n0 */
    public String mo126123n0(String str) {
        C87412m.m108594g(str, "sessionId");
        String t = ((C53475k) C86312j.m106911c(C53475k.class)).mo59160G2(str).mo59157t();
        C87412m.m108593f(t, "getService(IGameLifeSess…ssionId(sessionId).talker");
        return t;
    }
}
