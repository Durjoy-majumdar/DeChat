package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import yy1.C53656r;
import yy1.C53657s;

/* renamed from: zy1.f */
public final class C16415f extends C89132b<C53657s> {
    public C16415f(String str, long j, boolean z) {
        C87412m.m108594g(str, "sessionId");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C53656r rVar = new C53656r();
        rVar.f150718d = str;
        rVar.f150719e = j;
        rVar.f150720f = z;
        bVar.f127066a = rVar;
        bVar.f127067b = new C53657s();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setchatsessiondata";
        bVar.f127069d = 1910;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53657s sVar = (C53657s) eu32;
        Log.m105924i("MicroMsg.CgiSetChatSessionData", "onCgiBack, errType = " + i + ", errMsg = " + str);
    }
}
