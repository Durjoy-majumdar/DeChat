package w63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51680vc3;
import te3.C51815wc3;

/* renamed from: w63.a */
public class C53084a extends C75123k0 {

    /* renamed from: d */
    public C11385n f148154d;

    /* renamed from: e */
    public C47350c f148155e;

    public C53084a(int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51680vc3();
        bVar.f127067b = new C51815wc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payubatchuserroll";
        bVar.f127069d = 1519;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148155e = a;
        C51680vc3 vc32 = (C51680vc3) a.f127055a.f127080a;
        vc32.f143432d = i;
        vc32.f143433e = i2;
        Log.m105918d("MicroMsg.NetScenePayUPayQueryUserRoll", "limit:" + i + ",offset:" + i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148154d = nVar;
        return dispatch(gVar, this.f148155e, this);
    }

    public int getType() {
        return 1519;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105928w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + i2 + " errCode " + i3 + " errMsg " + str);
        this.f148154d.onSceneEnd(i2, i3, str, this);
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetScenePayUPayQueryUserRoll", "rr" + ((C51815wc3) ((C47350c) uVar).f127056b.f127083a).f143963d);
        }
    }
}
