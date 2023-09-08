package z53;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import ob0.C47350c;
import te3.C49874in3;
import te3.C50014jn3;

/* renamed from: z53.h */
public final class C53750h extends C75128o0<C50014jn3> {
    public C53750h(String str, String str2, String str3) {
        C87412m.m108594g(str, "guardian");
        C87412m.m108594g(str2, "sessionId");
        C87412m.m108594g(str3, StateEvent.Name.MESSAGE);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127067b = new C50014jn3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/tenpay/realnameverifyguardian";
        bVar.f127069d = 4877;
        C49874in3 in32 = new C49874in3();
        in32.f135522d = str;
        in32.f135523e = str2;
        in32.f135524f = str3;
        bVar.f127066a = in32;
        mo123453j(bVar.mo72403a());
    }
}
