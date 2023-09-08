package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import yy1.C53642d;
import yy1.C53643e;

/* renamed from: zy1.a */
public final class C16410a extends C89132b<C53643e> {
    public C16410a(String str) {
        C87412m.m108594g(str, "userName");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C53642d dVar = new C53642d();
        dVar.f150691d = str;
        bVar.f127066a = dVar;
        bVar.f127067b = new C53643e();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getblacklist";
        bVar.f127069d = 2982;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53643e eVar = (C53643e) eu32;
        Log.m105924i("MicroMsg.CgiGetBlackList", "onCgiBack, errType = " + i + ", errCode = " + i2);
    }
}
