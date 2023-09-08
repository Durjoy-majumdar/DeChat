package o63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50112kc3;
import te3.C50244lc3;

/* renamed from: o63.b */
public class C47331b extends C75123k0 {

    /* renamed from: d */
    public final C47350c f127018d;

    /* renamed from: e */
    public C11385n f127019e;

    /* renamed from: f */
    public C50244lc3 f127020f;

    public C47331b(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50112kc3();
        bVar.f127067b = new C50244lc3();
        bVar.f127069d = 2540;
        bVar.f127068c = "/cgi-bin/mmpay-bin/payibgquickgetoverseawallet";
        C47350c a = bVar.mo72403a();
        this.f127018d = a;
        ((C50112kc3) a.f127055a.f127080a).f136666d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127019e = nVar;
        return dispatch(gVar, this.f127018d, this);
    }

    public int getType() {
        return 2540;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetScenePayIBGQuickGetOverseaWallet", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f127020f = (C50244lc3) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f127019e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
