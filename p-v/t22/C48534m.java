package t22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115568o;
import com.tencent.p014mm.plugin.location.p069ui.impl.C42503p;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49806i62;
import te3.C49951j62;

/* renamed from: t22.m */
public class C48534m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129802d;

    /* renamed from: e */
    public C115568o f129803e;

    /* renamed from: f */
    public C42503p f129804f;

    /* renamed from: g */
    public final C47350c f129805g;

    public C48534m(C115568o oVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49806i62();
        bVar.f127067b = new C49951j62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getpoidetail";
        bVar.f127069d = 11363;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129805g = a;
        this.f129803e = oVar;
        C49806i62 i622 = (C49806i62) a.f127055a.f127080a;
        i622.f135126d = oVar.f346612e;
        i622.f135127e = LocaleUtil.getApplicationLanguage();
        i622.f135128f = 2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiDetail done.");
        this.f129802d = nVar;
        return dispatch(gVar, this.f129805g, this);
    }

    public int getType() {
        return 11363;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetPoiList", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + "errMsg:" + str);
        C49951j62 j622 = (C49951j62) this.f129805g.f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            this.f129804f = new C42503p(j622);
        }
        this.f129802d.onSceneEnd(i2, i3, str, this);
    }
}
