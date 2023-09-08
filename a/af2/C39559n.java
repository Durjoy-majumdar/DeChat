package af2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.bd4;
import te3.c64;
import te3.cd4;

/* renamed from: af2.n */
public class C39559n extends C75123k0 {

    /* renamed from: d */
    public C11385n f106199d;

    /* renamed from: e */
    public C47350c f106200e;

    /* renamed from: f */
    public String f106201f;

    public C39559n(c64 c64, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bd4();
        bVar.f127067b = new cd4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/submitmallorder";
        bVar.f127069d = 556;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106200e = a;
        bd4 bd4 = (bd4) a.f127055a.f127080a;
        bd4.f131061d = c64;
        bd4.f131062e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106199d = nVar;
        return dispatch(gVar, this.f106200e, this);
    }

    public int getType() {
        return 556;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        cd4 cd4 = (cd4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneMallSubmitMallOrder", "resp.ReqKey " + cd4.f131670d);
            this.f106201f = cd4.f131670d;
        }
        Log.m105918d("MicroMsg.NetSceneMallSubmitMallOrder", "errCode " + i3 + ", errMsg " + str);
        this.f106199d.onSceneEnd(i2, i3, str, this);
    }
}
