package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import yy1.C53648j;
import yy1.C53649k;

/* renamed from: zy1.d */
public final class C16413d extends C89132b<C53649k> {
    public C16413d(LinkedList<String> linkedList) {
        C87412m.m108594g(linkedList, "userNameList");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C53648j jVar = new C53648j();
        jVar.f150702d = linkedList;
        bVar.f127066a = jVar;
        bVar.f127067b = new C53649k();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatuserinfo";
        bVar.f127069d = 1111;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53649k kVar = (C53649k) eu32;
        Log.m105924i("MicroMsg.CgiGetChatUserInfo", "errType = " + i + ", errCode = " + i2);
    }
}
