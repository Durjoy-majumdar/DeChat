package zy1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;
import yy1.C53639a;
import yy1.C53654p;
import yy1.C53655q;

/* renamed from: zy1.e */
public final class C16414e extends C89132b<C53655q> {
    public C16414e(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "userName");
        C47350c.C47352b bVar = new C47350c.C47352b();
        C53654p pVar = new C53654p();
        C53639a aVar = new C53639a();
        aVar.f150679d = str;
        aVar.f150680e = z;
        pVar.f150716d = aVar;
        pVar.f150717e = z2;
        bVar.f127066a = pVar;
        bVar.f127067b = new C53655q();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setblacklist";
        bVar.f127069d = 1102;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C53655q qVar = (C53655q) eu32;
        Log.m105924i("MicroMsg.CgiSetBlackList", "onCgiBack, errType = " + i + ", errCode = " + i2);
    }
}
