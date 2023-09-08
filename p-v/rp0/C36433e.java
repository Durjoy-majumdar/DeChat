package rp0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49977jd2;
import te3.C50115kd2;

/* renamed from: rp0.e */
public final class C36433e extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f96938d = "MicroMsg.webview.NetSceneGetWxaOrderInfo";

    /* renamed from: e */
    public final C47350c f96939e;

    /* renamed from: f */
    public C11385n f96940f;

    public C36433e() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49977jd2();
        bVar.f127067b = new C50115kd2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaboss/getwxaorderinfo";
        bVar.f127069d = 1893;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f96939e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f96940f = nVar;
        return dispatch(gVar, this.f96939e, this);
    }

    public int getType() {
        return 1893;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f96938d, "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f96940f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
