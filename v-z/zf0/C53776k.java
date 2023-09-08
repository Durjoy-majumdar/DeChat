package zf0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52044y;
import te3.C78021z;

/* renamed from: zf0.k */
public class C53776k extends C75123k0 {

    /* renamed from: d */
    public C47350c f150931d;

    /* renamed from: e */
    public C52044y f150932e;

    /* renamed from: f */
    public C78021z f150933f;

    /* renamed from: g */
    public C11385n f150934g;

    public C53776k(String str, int i, String str2, String str3, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52044y();
        bVar.f127067b = new C78021z();
        bVar.f127069d = 1695;
        bVar.f127068c = "/cgi-bin/mmpay-bin/newaaquerydetail";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f150931d = a;
        C52044y yVar = (C52044y) a.f127055a.f127080a;
        this.f150932e = yVar;
        yVar.f145048d = str;
        yVar.f145049e = i;
        yVar.f145050f = str2;
        if (i == 5) {
            Log.m105924i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
            C52044y yVar2 = this.f150932e;
            yVar2.f145051g = str3;
            yVar2.f145052h = i2;
        }
        Log.m105925i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", str, Integer.valueOf(i), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneAAQueryDetail", "doScene");
        this.f150934g = nVar;
        return dispatch(gVar, this.f150931d, this);
    }

    public int getType() {
        return 1695;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C78021z zVar = (C78021z) ((C47350c) uVar).f127056b.f127083a;
        this.f150933f = zVar;
        Log.m105925i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", Integer.valueOf(zVar.f228659d), this.f150933f.f228660e);
        C11385n nVar = this.f150934g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
