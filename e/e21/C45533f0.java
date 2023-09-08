package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49176dp;
import te3.C49314ep;

/* renamed from: e21.f0 */
public class C45533f0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f123201d;

    /* renamed from: e */
    public C11385n f123202e;

    /* renamed from: f */
    public C49314ep f123203f;

    public C45533f0() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49176dp();
        bVar.f127067b = new C49314ep();
        bVar.f127069d = 1256;
        bVar.f127068c = "/cgi-bin/mmpay-bin/f2fannounce";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f123201d = bVar.mo72403a();
        Log.m105918d("MicroMsg.NetSceneF2fAnnouce", "do cgi");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123202e = nVar;
        return dispatch(gVar, this.f123201d, this);
    }

    public int getType() {
        return 1256;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneF2fAnnouce", "errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f123203f = (C49314ep) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f123202e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
