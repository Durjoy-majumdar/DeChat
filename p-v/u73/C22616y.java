package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22494eb3;
import te3.C49404fb3;

/* renamed from: u73.y */
public class C22616y extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f65055d;

    /* renamed from: e */
    public C47350c f65056e;

    /* renamed from: f */
    public C49404fb3 f65057f;

    public C22616y(C22494eb3 eb32) {
        eb32.f63785n = C85875k4.m106211z() ? 1 : 0;
        eb32.f63779e = C101987v0.m134273g();
        eb32.f63788q = C101987v0.m134272f();
        C49404fb3 fb32 = new C49404fb3();
        this.f65057f = fb32;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1076;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/pardussearch";
        bVar.f127066a = eb32;
        bVar.f127067b = fb32;
        this.f65056e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f65055d = nVar;
        return dispatch(gVar, this.f65056e, this);
    }

    public int getType() {
        return 1076;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.FTS.NetScenePardusSearch", "netId %d errType %d errCode %d errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f65055d.onSceneEnd(i2, i3, str, this);
    }
}
