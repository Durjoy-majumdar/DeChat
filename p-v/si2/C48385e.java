package si2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52061y30;
import te3.C52209z30;

/* renamed from: si2.e */
public class C48385e extends C48382b {

    /* renamed from: r */
    public C47350c f129513r;

    /* renamed from: s */
    public C52209z30 f129514s;

    /* renamed from: t */
    public C11385n f129515t;

    /* renamed from: u */
    public String f129516u;

    public C48385e(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52061y30();
        bVar.f127067b = new C52209z30();
        bVar.f127069d = 1395;
        bVar.f127068c = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129513r = a;
        ((C52061y30) a.f127055a.f127080a).f145096d = str;
        this.f129516u = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129515t = nVar;
        return dispatch(gVar, this.f129513r, this);
    }

    public int getType() {
        return 1395;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C52209z30 z302 = (C52209z30) ((C47350c) uVar).f127056b.f127083a;
        this.f129514s = z302;
        Log.m105925i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", Integer.valueOf(z302.f145665d), this.f129514s.f145666e);
        C11385n nVar = this.f129515t;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        C52209z30 z302 = (C52209z30) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = z302.f145665d;
        this.f221038h = z302.f145666e;
    }
}
