package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.iu4;
import te3.ju4;

/* renamed from: n43.d */
public class C47159d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126690d;

    /* renamed from: e */
    public C47350c f126691e;

    public C47159d(long j, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new iu4();
        bVar.f127067b = new ju4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/csvoipredirect";
        bVar.f127069d = C1821q0.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126691e = a;
        iu4 iu4 = (iu4) a.f127055a.f127080a;
        iu4.f135683d = j;
        iu4.f135684e = j2;
        iu4.f135685f = System.currentTimeMillis();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126690d = nVar;
        return dispatch(gVar, this.f126691e, this);
    }

    public int getType() {
        return C1821q0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSRedirect", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126690d.onSceneEnd(i2, i3, str, this);
    }
}
