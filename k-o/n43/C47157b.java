package n43;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82956d;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.du4;
import te3.eu4;

/* renamed from: n43.b */
public class C47157b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126686d;

    /* renamed from: e */
    public C47350c f126687e;

    public C47157b(long j, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new du4();
        bVar.f127067b = new eu4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/csvoipheartbeat";
        bVar.f127069d = C82956d.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126687e = a;
        du4 du4 = (du4) a.f127055a.f127080a;
        du4.f132538d = j;
        du4.f132539e = j2;
        du4.f132540f = System.currentTimeMillis();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126686d = nVar;
        return dispatch(gVar, this.f126687e, this);
    }

    public int getType() {
        return C82956d.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneVoipCSHeartBeat", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126686d.onSceneEnd(i2, i3, str, this);
    }
}
