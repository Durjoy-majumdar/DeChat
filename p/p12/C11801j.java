package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.sx4;
import te3.tx4;

/* renamed from: p12.j */
public class C11801j extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f34523d = null;

    /* renamed from: e */
    public sx4 f34524e = null;

    /* renamed from: f */
    public C11385n f34525f = null;

    public C11801j(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new sx4();
        bVar.f127067b = new tx4();
        bVar.f127069d = C1650c.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/wcopurchasepackage";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f34523d = a;
        sx4 sx4 = (sx4) a.f127055a.f127080a;
        this.f34524e = sx4;
        sx4.f141819d = str;
        Log.m105925i("MicroMsg.NetSceneIPCallPurchasePackage", "NetSceneIPCallPurchasePackage ProductID:%s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34525f = nVar;
        return dispatch(gVar, this.f34523d, this);
    }

    public int getType() {
        return C1650c.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallPurchasePackage", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        tx4 tx4 = (tx4) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f34525f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
