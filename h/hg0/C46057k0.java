package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49755hv;
import te3.C49901iv;

/* renamed from: hg0.k0 */
public class C46057k0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f124180d;

    /* renamed from: e */
    public C47350c f124181e;

    public C46057k0(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49755hv();
        bVar.f127067b = new C49901iv();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkunbind";
        bVar.f127069d = 254;
        bVar.f127070e = 131;
        bVar.f127071f = 1000000131;
        C47350c a = bVar.mo72403a();
        this.f124181e = a;
        ((C49755hv) a.f127055a.f127080a).f134894d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124180d = nVar;
        return dispatch(gVar, this.f124181e, this);
    }

    public int getType() {
        return 254;
    }

    /* renamed from: j1 */
    public String mo71475j1() {
        try {
            String str = ((C49901iv) this.f124181e.f127056b.f127083a).f135686d;
            Log.m105918d("MicroMsg.NetSceneCheckUnBind", "getRandomPasswd() " + str);
            return str;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneCheckUnBind", e, "", new Object[0]);
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f124180d.onSceneEnd(i2, i3, str, this);
    }
}
