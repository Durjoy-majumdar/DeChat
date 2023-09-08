package zf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C48785b;
import te3.C48931c;

/* renamed from: zf0.d */
public class C53773d extends C75128o0<C48931c> {
    public C53773d(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C48785b bVar2 = new C48785b();
        bVar2.f130857d = str;
        bVar2.f130858e = str2;
        bVar.f127066a = bVar2;
        bVar.f127067b = new C48931c();
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaclosenotify";
        bVar.f127069d = 1672;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", str, str2);
    }
}
