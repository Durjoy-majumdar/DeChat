package w63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48843bd3;
import te3.C48989cd3;
import te3.C51090rc3;

/* renamed from: w63.c */
public class C53086c extends C75123k0 {

    /* renamed from: d */
    public C11385n f148158d;

    /* renamed from: e */
    public C47350c f148159e;

    /* renamed from: f */
    public C51090rc3 f148160f = null;

    public C53086c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48843bd3();
        bVar.f127067b = new C48989cd3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payuqueryuserroll";
        bVar.f127069d = 1520;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148159e = a;
        C48843bd3 bd32 = (C48843bd3) a.f127055a.f127080a;
        if (!Util.isNullOrNil(str)) {
            bd32.f131060d = str;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148158d = nVar;
        return dispatch(gVar, this.f148159e, this);
    }

    public int getType() {
        return 1520;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105928w("MicroMsg.NetScenePayUQueryUserRoll", "errType = " + i2 + " errCode " + i3 + " errMsg " + str);
        this.f148158d.onSceneEnd(i2, i3, str, this);
        if (i2 == 0 && i3 == 0) {
            C48989cd3 cd32 = (C48989cd3) ((C47350c) uVar).f127056b.f127083a;
            C51090rc3 rc32 = cd32.f131669d;
            this.f148160f = rc32;
            if (rc32 != null) {
                Log.m105918d("MicroMsg.NetScenePayUQueryUserRoll", "rr" + cd32.f131669d.f140817d);
                return;
            }
            Log.m105920e("MicroMsg.NetScenePayUQueryUserRoll", "hy: user roll is null!!!");
        }
    }
}
