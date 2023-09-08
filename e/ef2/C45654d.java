package ef2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.td4;
import te3.ud4;

/* renamed from: ef2.d */
public class C45654d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123451d;

    /* renamed from: e */
    public C47350c f123452e;

    public C45654d(String str, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new td4();
        bVar.f127067b = new ud4();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/switchbrand";
        bVar.f127069d = 1394;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123452e = a;
        td4 td4 = (td4) a.f127055a.f127080a;
        td4.f142139d = str;
        td4.f142140e = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123451d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneSwitchBrand", "do scene");
        return dispatch(gVar, this.f123452e, this);
    }

    public int getType() {
        return 1394;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneSwitchBrand", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f123451d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
