package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import yy1.C53644f;
import yy1.C53645g;

/* renamed from: zy1.b */
public final class C16411b extends C89132b<C53645g> {
    public C16411b(LinkedList<String> linkedList) {
        C87412m.m108594g(linkedList, "sessionIdList");
        C53644f fVar = new C53644f();
        C47350c.C47352b bVar = new C47350c.C47352b();
        fVar.f150694d = linkedList;
        bVar.f127066a = fVar;
        bVar.f127067b = new C53645g();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatsessiondata";
        bVar.f127069d = 1910;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53645g gVar = (C53645g) eu32;
        Log.m105924i("MicroMsg.CgiGetChatSessionData", "onCgiBack, errType = " + i + ", errCode = " + i2);
    }
}
