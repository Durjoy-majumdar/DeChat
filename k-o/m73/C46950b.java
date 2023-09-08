package m73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1807j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75604z3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.r15;
import te3.s15;

/* renamed from: m73.b */
public class C46950b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126235d;

    /* renamed from: e */
    public C47350c f126236e;

    public C46950b(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = C1807j0.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendyo";
        bVar.f127066a = new r15();
        bVar.f127067b = new s15();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126236e = a;
        r15 r15 = (r15) a.f127055a.f127080a;
        r15.f140665d = str;
        r15.f140669h = r15.f140668g;
        r15.f140668g = (int) C75604z3.m90843o(str);
        r15.f140666e = 63;
        r15.f140671j = 1;
        r15.f140667f = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126235d = nVar;
        return dispatch(gVar, this.f126236e, this);
    }

    public int getType() {
        return C1807j0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.Wear.NetSceneSendYo", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f126235d.onSceneEnd(i2, i3, str, this);
    }
}
