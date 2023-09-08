package ax0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49408fc2;
import te3.C49542gc2;

/* renamed from: ax0.a */
public class C39637a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106398d;

    /* renamed from: e */
    public C47350c f106399e;

    /* renamed from: f */
    public long f106400f;

    /* renamed from: g */
    public String f106401g;

    /* renamed from: h */
    public C49542gc2 f106402h;

    public C39637a(String str, String str2) {
        this.f106401g = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1869;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getweappbox";
        bVar.f127066a = new C49408fc2();
        bVar.f127067b = new C49542gc2();
        C47350c a = bVar.mo72403a();
        this.f106399e = a;
        ((C49408fc2) a.f127055a.f127080a).f133431d = str2;
        Log.m105925i("MicroMsg.Box.NetSceneBox", "Create NetSceneBox %s %s", str, str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106400f = System.currentTimeMillis();
        this.f106398d = nVar;
        return dispatch(gVar, this.f106399e, this);
    }

    public int getType() {
        return 1869;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Box.NetSceneBox", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f106400f));
        this.f106402h = (C49542gc2) this.f106399e.f127056b.f127083a;
        this.f106398d.onSceneEnd(i2, i3, str, this);
    }
}
