package j63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50142kk3;
import te3.C50277lk3;

/* renamed from: j63.h */
public class C46448h extends C75123k0 {

    /* renamed from: d */
    public C11385n f125124d;

    /* renamed from: e */
    public C47350c f125125e;

    /* renamed from: f */
    public C50277lk3 f125126f;

    public C46448h(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50142kk3();
        bVar.f127067b = new C50277lk3();
        bVar.f127069d = 1988;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qryecardbanklist4bind";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125125e = a;
        C50142kk3 kk32 = (C50142kk3) a.f127055a.f127080a;
        kk32.f136859d = str;
        kk32.f136860e = i;
        Log.m105925i("MicroMsg.NetSceneQryBankList4Bind", "cardType: %s, openScene: %s", str, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125124d = nVar;
        return dispatch(gVar, this.f125125e, this);
    }

    public int getType() {
        return 1988;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneQryBankList4Bind", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C50277lk3 lk32 = (C50277lk3) ((C47350c) uVar).f127056b.f127083a;
        this.f125126f = lk32;
        Log.m105925i("MicroMsg.NetSceneQryBankList4Bind", "ret_code: %d, ret_msg: %s", Integer.valueOf(lk32.f137492d), this.f125126f.f137493e);
        C11385n nVar = this.f125124d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
