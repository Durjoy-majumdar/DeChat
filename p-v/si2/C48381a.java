package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49523g7;
import te3.C49667h7;

/* renamed from: si2.a */
public class C48381a extends C48382b {

    /* renamed from: r */
    public C47350c f129503r;

    /* renamed from: s */
    public C49667h7 f129504s;

    /* renamed from: t */
    public C11385n f129505t;

    /* renamed from: u */
    public String f129506u;

    public C48381a(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49523g7();
        bVar.f127067b = new C49667h7();
        bVar.f127069d = 1348;
        bVar.f127068c = "/cgi-bin/mmpay-bin/appointbank_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129503r = a;
        C49523g7 g7Var = (C49523g7) a.f127055a.f127080a;
        g7Var.f133898d = str;
        g7Var.f133900f = str2;
        g7Var.f133899e = str3;
        this.f129506u = str;
        Log.m105925i("MicroMsg.NetSceneBankRemitAppointBank", "seqno: %s, timing_id: %s, bankType: %s", str, str2, str3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129505t = nVar;
        return dispatch(gVar, this.f129503r, this);
    }

    public int getType() {
        return 1348;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitAppointBank", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49667h7 h7Var = (C49667h7) ((C47350c) uVar).f127056b.f127083a;
        this.f129504s = h7Var;
        Log.m105925i("MicroMsg.NetSceneBankRemitAppointBank", "retcode: %s, retmsg: %s", Integer.valueOf(h7Var.f134471d), this.f129504s.f134472e);
        C11385n nVar = this.f129505t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C49667h7 h7Var = (C49667h7) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = h7Var.f134471d;
        this.f221038h = h7Var.f134472e;
    }
}
