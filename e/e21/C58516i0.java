package e21;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50434mq;
import te3.C64531lq;

/* renamed from: e21.i0 */
public class C58516i0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f167553d;

    /* renamed from: e */
    public C11385n f167554e;

    /* renamed from: f */
    public C64531lq f167555f;

    public C58516i0(int i, int i2, String str, String str2, C89349b bVar) {
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C64531lq();
        bVar2.f127067b = new C50434mq();
        bVar2.f127069d = 3781;
        bVar2.f127068c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        C47350c a = bVar2.mo72403a();
        this.f167553d = a;
        C64531lq lqVar = (C64531lq) a.f127055a.f127080a;
        this.f167555f = lqVar;
        lqVar.f184143d = i;
        lqVar.f184144e = i2;
        lqVar.f184145f = str;
        lqVar.f184146g = str2;
        lqVar.f184147h = (int) (System.currentTimeMillis() / 1000);
        this.f167555f.f184148i = bVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f167554e = nVar;
        return dispatch(gVar, this.f167553d, this);
    }

    public int getType() {
        return 3781;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneF2fQrcodeSaveNotify", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C50434mq mqVar = (C50434mq) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f167554e.onSceneEnd(i2, i3, str, this);
    }
}
