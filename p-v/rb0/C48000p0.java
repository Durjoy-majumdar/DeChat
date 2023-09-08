package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49390f72;
import te3.C49525g72;

/* renamed from: rb0.p0 */
public class C48000p0 extends C117747y implements C1311n, C47967f0 {

    /* renamed from: d */
    public final C47350c f128744d;

    /* renamed from: e */
    public C11385n f128745e;

    /* renamed from: f */
    public C49525g72 f128746f;

    /* renamed from: g */
    public C47968g0 f128747g;

    public C48000p0(C47968g0 g0Var) {
        this();
        this.f128747g = g0Var;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128745e = nVar;
        return dispatch(gVar, this.f128744d, this);
    }

    public int getType() {
        return 1769;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105929w("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f128746f = (C49525g72) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f128745e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C47968g0 g0Var = this.f128747g;
        if (g0Var != null) {
            g0Var.mo67591a(i2, i3, str, this);
        }
    }

    public C48000p0() {
        Log.m105924i("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "NetSceneGetReceiptAssisPluginMenu begin");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1769;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getreceiptassismenu";
        C49390f72 f722 = new C49390f72();
        f722.f133329d = C31543z5.m39453c();
        bVar.f127066a = f722;
        bVar.f127067b = new C49525g72();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f128744d = bVar.mo72403a();
    }
}
