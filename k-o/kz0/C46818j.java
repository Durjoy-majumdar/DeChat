package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C51337t30;
import te3.C51488u30;

/* renamed from: kz0.j */
public final class C46818j extends C46827q<C51488u30> {
    public C46818j(String str) {
        C87412m.m108594g(str, "cardId");
        C51337t30 t302 = new C51337t30();
        C51488u30 u302 = new C51488u30();
        t302.f141915d = str;
        mo72033k(t302, u302, 1739, "/cgi-bin/mmpay-bin/mktdeletecardinticketlist");
        Log.m105925i("MicroMsg.CgiDeleteCardInTicketList", "cardid: %s", str);
    }
}
