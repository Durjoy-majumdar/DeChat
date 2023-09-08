package zf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51620v;
import te3.C51761w;

/* renamed from: zf0.b */
public class C53772b extends C75128o0<C51761w> {
    public C53772b(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51620v vVar = new C51620v();
        vVar.f143206d = str;
        vVar.f143207e = str2;
        vVar.f143208f = i;
        bVar.f127066a = vVar;
        bVar.f127067b = new C51761w();
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaapayurge";
        bVar.f127069d = 1644;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", str, str2, Integer.valueOf(i));
    }
}
