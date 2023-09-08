package wi2;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import te3.pj4;
import te3.qj4;

/* renamed from: wi2.e */
public class C66127e extends C53178a {

    /* renamed from: t */
    public qj4 f190058t;

    public C66127e(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new pj4();
        bVar.f127067b = new qj4();
        bVar.f127069d = 1903;
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonesuccpage";
        C47350c a = bVar.mo72403a();
        this.f148360r = a;
        pj4 pj4 = (pj4) a.f127055a.f127080a;
        pj4.f184819d = str;
        pj4.f184820e = str2;
        pj4.f184821f = str3;
        pj4.f184822g = str4;
        pj4.f184823h = i;
        pj4.f184824i = str5;
        pj4.f184825j = str6;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "do scene NetSceneMobileRemitGetSuccPage out_trade_no:%s trans_id:%s rcvr_openid:%s rcvr_token:%s amount:%s placeorder_token:%s placeorder_ext:%s", str, str2, str3, str4, Integer.valueOf(i), str5, str6);
    }

    public int getType() {
        return 1903;
    }

    /* renamed from: j1 */
    public void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        qj4 qj4 = (qj4) ((C47350c) uVar).f127056b.f127083a;
        this.f190058t = qj4;
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "ret_code: %s, ret_msg: %s", Integer.valueOf(qj4.f185040d), this.f190058t.f185041e);
        C11385n nVar = this.f148361s;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }

    /* renamed from: k1 */
    public void mo66608k1(C114799u uVar) {
        qj4 qj4 = (qj4) ((C47350c) uVar).f127056b.f127083a;
        this.f221036f = qj4.f185040d;
        this.f221038h = qj4.f185041e;
    }
}
