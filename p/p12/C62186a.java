package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50835pi3;
import te3.C64608oi3;
import yl0.C91493k;

/* renamed from: p12.a */
public class C62186a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f176801d = null;

    /* renamed from: e */
    public C64608oi3 f176802e = null;

    /* renamed from: f */
    public C11385n f176803f = null;

    public C62186a(int i, long j, String str, String str2, int i2, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64608oi3();
        bVar.f127067b = new C50835pi3();
        bVar.f127069d = C91493k.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstncancelinvite";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f176801d = bVar.mo72403a();
        long currentTimeMillis = System.currentTimeMillis();
        C64608oi3 oi32 = (C64608oi3) this.f176801d.f127055a.f127080a;
        this.f176802e = oi32;
        oi32.f184661d = i;
        oi32.f184662e = j;
        oi32.f184663f = str;
        oi32.f184664g = currentTimeMillis;
        oi32.f184665h = i2;
        oi32.f184666i = str2;
        oi32.f184667j = j2;
        Log.m105919d("MicroMsg.NetSceneIPCallCancel", "roomId: %d, roomKey: %d, toUsername: %s, timestamp: %d, inviteId: %d, phoneNumber: %s, callseq: %d", Integer.valueOf(i), Long.valueOf(j), str, Long.valueOf(currentTimeMillis), Integer.valueOf(i2), str2, Long.valueOf(j2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f176803f = nVar;
        return dispatch(gVar, this.f176801d, this);
    }

    public int getType() {
        return C91493k.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C50835pi3 pi32 = (C50835pi3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f176803f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
