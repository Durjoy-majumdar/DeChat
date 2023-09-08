package eg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.ik4;
import te3.jk4;

/* renamed from: eg0.d */
public class C7649d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f25979d;

    /* renamed from: e */
    public final C47350c f25980e;

    public C7649d(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ik4();
        bVar.f127067b = new jk4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/unbindlinkedincontact";
        bVar.f127069d = C82341m.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f25980e = a;
        ((ik4) a.f127055a.f127080a).f135436d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25979d = nVar;
        return dispatch(gVar, this.f25980e, this);
    }

    public int getType() {
        return C82341m.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneUnBindLinkedinContact", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        C47350c cVar = this.f25980e;
        ik4 ik4 = (ik4) cVar.f127055a.f127080a;
        jk4 jk4 = (jk4) cVar.f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            C86709a0.m107535s().mo121142i().mo119676J(286722, "");
            C86709a0.m107535s().mo121142i().mo119676J(286721, "");
            C86709a0.m107535s().mo121142i().mo119676J(286723, "");
        }
        this.f25979d.onSceneEnd(i2, i3, str, this);
    }
}
