package j63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51375tc;
import te3.C51524uc;

/* renamed from: j63.e */
public class C46446e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125116d;

    /* renamed from: e */
    public C47350c f125117e;

    /* renamed from: f */
    public C51524uc f125118f;

    public C46446e(String str, String str2, String str3, String str4, String str5, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51375tc();
        bVar.f127067b = new C51524uc();
        bVar.f127069d = 1986;
        bVar.f127068c = "/cgi-bin/mmpay-bin/bindecard";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125117e = a;
        C51375tc tcVar = (C51375tc) a.f127055a.f127080a;
        tcVar.f142112d = str;
        tcVar.f142113e = str2;
        tcVar.f142114f = str3;
        tcVar.f142115g = str4;
        tcVar.f142116h = i;
        Log.m105925i("MicroMsg.NetSceneBindECard", "cardType: %s, reqSerial: %s, openScene: %s, verifyCode: %s, bindToken: %s", str, str2, Integer.valueOf(i), str3, str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125116d = nVar;
        return dispatch(gVar, this.f125117e, this);
    }

    public int getType() {
        return 1986;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBindECard", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51524uc ucVar = (C51524uc) ((C47350c) uVar).f127056b.f127083a;
        this.f125118f = ucVar;
        Log.m105925i("MicroMsg.NetSceneBindECard", "ret_code: %d, ret_msg: %s", Integer.valueOf(ucVar.f142730d), this.f125118f.f142731e);
        C11385n nVar = this.f125116d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
