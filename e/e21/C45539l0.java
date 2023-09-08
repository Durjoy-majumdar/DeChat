package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51775w24;
import te3.C51915x24;

/* renamed from: e21.l0 */
public class C45539l0 extends C75123k0 {

    /* renamed from: d */
    public C47350c f123209d;

    /* renamed from: e */
    public C11385n f123210e;

    public C45539l0(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51775w24();
        bVar.f127067b = new C51915x24();
        bVar.f127069d = 304;
        bVar.f127068c = "/cgi-bin/micromsg-bin/setpushsound";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123209d = a;
        C51775w24 w242 = (C51775w24) a.f127055a.f127080a;
        w242.f143838d = i;
        w242.f143839e = str;
        Log.m105925i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", Integer.valueOf(i), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123210e = nVar;
        return dispatch(gVar, this.f123209d, this);
    }

    public int getType() {
        return 304;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C11385n nVar = this.f123210e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
