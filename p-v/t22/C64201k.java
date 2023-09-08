package t22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C64717sy1;
import te3.C64742ty1;

/* renamed from: t22.k */
public class C64201k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f181922d;

    /* renamed from: e */
    public C47350c f181923e;

    /* renamed from: f */
    public String f181924f;

    /* renamed from: g */
    public String f181925g;

    /* renamed from: h */
    public String f181926h;

    public C64201k(double d, double d2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64717sy1();
        bVar.f127067b = new C64742ty1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcurlocation";
        bVar.f127069d = 665;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f181923e = a;
        C64717sy1 sy12 = (C64717sy1) a.f127055a.f127080a;
        sy12.f185454e = d;
        sy12.f185453d = d2;
        Log.m105918d("MicroMsg.NetSceneGetCurLocation", "latitude:" + d + ", longitude:" + d2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f181922d = nVar;
        return dispatch(gVar, this.f181923e, this);
    }

    public int getType() {
        return 665;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetCurLocation", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            C64742ty1 ty12 = (C64742ty1) this.f181923e.f127056b.f127083a;
            this.f181926h = ty12.f185696f;
            this.f181924f = ty12.f185694d;
            this.f181925g = ty12.f185695e;
        }
        this.f181922d.onSceneEnd(i2, i3, str, this);
    }
}
