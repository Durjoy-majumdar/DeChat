package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import yy1.C53646h;
import yy1.C53647i;

/* renamed from: zy1.c */
public final class C16412c extends C89132b<C53647i> {
    public C16412c(String str, String str2, int i, C89349b bVar) {
        C87412m.m108594g(str2, "toUserName");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C53646h hVar = new C53646h();
        hVar.f150696d = str;
        hVar.f150697e = str2;
        hVar.f150698f = i;
        hVar.f150699g = bVar;
        bVar2.f127066a = hVar;
        bVar2.f127067b = new C53647i();
        Log.m105924i("MicroMsg.CgiGetChatSessionId", "fromUserName[" + hVar.f150696d + "], toUserName[" + hVar.f150697e + "], scene[" + hVar.f150698f + "], extInfo[" + hVar.f150699g + ']');
        bVar2.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessionid";
        bVar2.f127069d = 1103;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53647i iVar = (C53647i) eu32;
        Log.m105924i("MicroMsg.CgiGetChatSessionId", "onCgiBack, errType = " + i + ", errMsg = " + str);
    }
}
