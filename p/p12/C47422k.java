package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51980xi3;
import te3.C52122yi3;

/* renamed from: p12.k */
public class C47422k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127212d = null;

    /* renamed from: e */
    public C51980xi3 f127213e = null;

    /* renamed from: f */
    public C52122yi3 f127214f = null;

    /* renamed from: g */
    public C11385n f127215g = null;

    public C47422k(int i, long j, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51980xi3();
        bVar.f127067b = new C52122yi3();
        bVar.f127069d = 726;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnredirect";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127212d = a;
        C51980xi3 xi32 = (C51980xi3) a.f127055a.f127080a;
        this.f127213e = xi32;
        xi32.f144690d = i;
        xi32.f144691e = j;
        xi32.f144692f = j2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127215g = nVar;
        return dispatch(gVar, this.f127212d, this);
    }

    public int getType() {
        return 726;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallRedirect", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f127214f = (C52122yi3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f127215g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
