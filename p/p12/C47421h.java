package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51251si3;
import te3.C51403ti3;

/* renamed from: p12.h */
public class C47421h extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127209d = null;

    /* renamed from: e */
    public C51251si3 f127210e = null;

    /* renamed from: f */
    public C11385n f127211f = null;

    public C47421h(int i, long j, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51251si3();
        bVar.f127067b = new C51403ti3();
        bVar.f127069d = 824;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnheartbeat";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f127209d = bVar.mo72403a();
        long currentTimeMillis = System.currentTimeMillis();
        C51251si3 si32 = (C51251si3) this.f127209d.f127055a.f127080a;
        this.f127210e = si32;
        si32.f141540d = i;
        si32.f141541e = j;
        si32.f141543g = j2;
        si32.f141542f = currentTimeMillis;
        Log.m105919d("MicroMsg.NetSceneIPCallHeartBeat", "heartbeat, roomId: %d, roomKey: %d, callSeq: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(currentTimeMillis));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127211f = nVar;
        return dispatch(gVar, this.f127209d, this);
    }

    public int getType() {
        return 824;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallHeartBeat", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C51403ti3 ti32 = (C51403ti3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f127211f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
