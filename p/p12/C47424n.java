package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48865bj3;
import te3.C49010cj3;

/* renamed from: p12.n */
public class C47424n extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127219d = null;

    /* renamed from: e */
    public C48865bj3 f127220e = null;

    /* renamed from: f */
    public C11385n f127221f = null;

    public C47424n(int i, long j, long j2, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48865bj3();
        bVar.f127067b = new C49010cj3();
        bVar.f127069d = 723;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnshutdown";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f127219d = bVar.mo72403a();
        long currentTimeMillis = System.currentTimeMillis();
        C48865bj3 bj32 = (C48865bj3) this.f127219d.f127055a.f127080a;
        this.f127220e = bj32;
        bj32.f131151d = C75592q0.m90789s();
        C48865bj3 bj33 = this.f127220e;
        bj33.f131152e = i;
        bj33.f131153f = j;
        bj33.f131155h = j2;
        bj33.f131156i = i2;
        bj33.f131154g = currentTimeMillis;
        Log.m105925i("MicroMsg.NetSceneIPCallShutDown", "roomId: %d, roomKey: %d, callSeq: %d, status: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Long.valueOf(currentTimeMillis));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127221f = nVar;
        return dispatch(gVar, this.f127219d, this);
    }

    public int getType() {
        return 723;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallShutDown", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C49010cj3 cj32 = (C49010cj3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f127221f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
