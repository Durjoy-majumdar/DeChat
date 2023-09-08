package n63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C77987qh2;
import te3.C77991rh2;
import te3.qp4;
import te3.rp4;

/* renamed from: n63.n */
public class C47166n extends C75123k0 {

    /* renamed from: d */
    public C47350c f126708d;

    /* renamed from: e */
    public C11385n f126709e;

    /* renamed from: f */
    public String f126710f;

    public C47166n(int i, int i2, String str, C77991rh2 rh22, C77987qh2 qh22) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new qp4();
        bVar.f127067b = new rp4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/boss/verifyandroidiappackage";
        bVar.f127069d = 1306;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126708d = a;
        qp4 qp4 = (qp4) a.f127055a.f127080a;
        qp4.f140449d = i;
        qp4.f140450e = i2;
        this.f126710f = str;
        qp4.f140452g = rh22;
        qp4.f140451f = qh22;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126709e = nVar;
        return dispatch(gVar, this.f126708d, this);
    }

    public int getType() {
        return 1306;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105920e("MicroMsg.NetSceneVerifyAndroidIapPackage", "ErrType:" + i2 + ",errCode:" + i3 + ",errMsg:" + str);
        if (i2 == 0 && i3 == 0) {
            rp4 rp4 = (rp4) this.f126708d.f127056b.f127083a;
            Log.m105920e("MicroMsg.NetSceneVerifyAndroidIapPackage", "business: errCode:" + rp4.f141074d + ",errMsg:" + rp4.f141075e);
            this.f126709e.onSceneEnd(i2, rp4.f141074d, str, this);
            return;
        }
        this.f126709e.onSceneEnd(i2, i3, str, this);
    }
}
