package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C64316dj3;
import te3.C64343ej3;

/* renamed from: p12.o */
public class C62188o extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f176808d = null;

    /* renamed from: e */
    public C64316dj3 f176809e = null;

    /* renamed from: f */
    public C64343ej3 f176810f = null;

    /* renamed from: g */
    public C11385n f176811g;

    public C62188o(int i, long j, int i2, long j2, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64316dj3();
        bVar.f127067b = new C64343ej3();
        bVar.f127069d = 819;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnsync";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f176808d = bVar.mo72403a();
        long currentTimeMillis = System.currentTimeMillis();
        C64316dj3 dj32 = (C64316dj3) this.f176808d.f127055a.f127080a;
        this.f176809e = dj32;
        dj32.f182755d = C75592q0.m90789s();
        C64316dj3 dj33 = this.f176809e;
        dj33.f182756e = i;
        dj33.f182757f = j;
        dj33.f182758g = currentTimeMillis;
        dj33.f182759h = i2;
        dj33.f182760i = j2;
        if (!z) {
            dj33.f182761j = 0;
        } else {
            dj33.f182761j = 1;
        }
        Log.m105925i("MicroMsg.NetSceneIPCallSync", "roomId: %d, roomKey: %d, syncKey: %d, callSeq: %d,dataFlag: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(this.f176809e.f182761j), Long.valueOf(currentTimeMillis));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f176811g = nVar;
        return dispatch(gVar, this.f176808d, this);
    }

    public int getType() {
        return 819;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallSync", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f176810f = (C64343ej3) ((C47350c) uVar).f127056b.f127083a;
        this.f176811g.onSceneEnd(i2, i3, str, this);
    }
}
