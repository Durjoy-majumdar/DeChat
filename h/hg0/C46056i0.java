package hg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49126dd;
import te3.C49265ed;

/* renamed from: hg0.i0 */
public class C46056i0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f124178d;

    /* renamed from: e */
    public C11385n f124179e;

    public C46056i0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 870;
        C49126dd ddVar = new C49126dd();
        ddVar.f132241d = str;
        bVar.f127066a = ddVar;
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindoldwx";
        bVar.f127067b = new C49265ed();
        this.f124178d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124179e = nVar;
        return dispatch(gVar, this.f124178d, this);
    }

    public int getType() {
        return 870;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneBindOldWx", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f124179e.onSceneEnd(i2, i3, str, this);
    }
}
