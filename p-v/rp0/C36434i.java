package rp0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50726os3;
import te3.C50870ps3;

/* renamed from: rp0.i */
public final class C36434i extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f96941d = "MicroMsg.webview.NetSceneReportOpenWxaOrder";

    /* renamed from: e */
    public final C47350c f96942e;

    /* renamed from: f */
    public C11385n f96943f;

    public C36434i(boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50726os3 os32 = new C50726os3();
        os32.f139354d = z;
        bVar.f127066a = os32;
        bVar.f127067b = new C50870ps3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaboss/reportopenwxaorder";
        bVar.f127069d = 1954;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f96942e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f96943f = nVar;
        return dispatch(gVar, this.f96942e, this);
    }

    public int getType() {
        return 1954;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i(this.f96941d, "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f96943f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
