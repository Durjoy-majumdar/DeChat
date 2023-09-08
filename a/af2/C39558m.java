package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.ad4;
import te3.c64;
import te3.zc4;

/* renamed from: af2.m */
public class C39558m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106197d;

    /* renamed from: e */
    public C47350c f106198e;

    public C39558m(c64 c64, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new zc4();
        bVar.f127067b = new ad4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/submitmallfreeorder";
        bVar.f127069d = JsApiGetLabInfo.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106198e = a;
        ((zc4) a.f127055a.f127080a).f145833d = c64;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106197d = nVar;
        return dispatch(gVar, this.f106198e, this);
    }

    public int getType() {
        return JsApiGetLabInfo.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        ad4 ad4 = (ad4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "resp.PrepareId " + ad4.f130463d);
        }
        Log.m105918d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "errCode " + i3 + ", errMsg " + str);
        this.f106197d.onSceneEnd(i2, i3, str, this);
    }
}
