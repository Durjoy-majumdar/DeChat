package zf0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49071d;
import te3.C49207e;

/* renamed from: zf0.e */
public class C53774e extends C75123k0 {

    /* renamed from: d */
    public C47350c f150923d;

    /* renamed from: e */
    public C49207e f150924e;

    /* renamed from: f */
    public C11385n f150925f;

    /* renamed from: g */
    public int f150926g;

    public C53774e(String str, int i, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49071d();
        bVar.f127067b = new C49207e();
        bVar.f127069d = 1530;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaclose";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150923d = a;
        C49071d dVar = (C49071d) a.f127055a.f127080a;
        dVar.f132049f = str2;
        dVar.f132047d = str;
        dVar.f132048e = i;
        this.f150926g = i;
        Log.m105919d("MicroMsg.NetSceneAAClose", "NetSceneAAClose, billNo: %s, scene: %s", str, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneAAClose", "doScene");
        this.f150925f = nVar;
        return dispatch(gVar, this.f150923d, this);
    }

    public int getType() {
        return 1530;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C49207e eVar = (C49207e) ((C47350c) uVar).f127056b.f127083a;
        this.f150924e = eVar;
        Log.m105925i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", Integer.valueOf(eVar.f132598d), this.f150924e.f132599e);
        C11385n nVar = this.f150925f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
