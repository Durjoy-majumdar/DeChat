package zf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51320t;
import te3.C51471u;

/* renamed from: zf0.a */
public class C53771a extends C75128o0<C51471u> {
    public C53771a(String str, long j, int i, String str2, String str3, String str4) {
        C51320t tVar = new C51320t();
        tVar.f141855d = str;
        tVar.f141856e = j;
        tVar.f141857f = i;
        tVar.f141858g = str2;
        tVar.f141859h = str3;
        tVar.f141860i = str4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = tVar;
        bVar.f127067b = new C51471u();
        bVar.f127069d = 1344;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaapaysucc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105925i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", tVar.f141855d, Long.valueOf(tVar.f141856e), Integer.valueOf(tVar.f141857f), tVar.f141858g, tVar.f141859h, tVar.f141860i);
    }
}
