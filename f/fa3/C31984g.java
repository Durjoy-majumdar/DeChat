package fa3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51078ra0;
import te3.C64706sa0;

/* renamed from: fa3.g */
public class C31984g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f85167d;

    /* renamed from: e */
    public final C47350c f85168e;

    public C31984g(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51078ra0 ra02 = new C51078ra0();
        C64706sa0 sa02 = new C64706sa0();
        bVar.f127066a = ra02;
        bVar.f127067b = sa02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
        bVar.f127069d = 971;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f85168e = bVar.mo72403a();
        ra02.f140783d = str;
        Log.m105919d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "[oneliang][NetSceneExtDeviceLoginConfirmGet]loginUrl:%s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f85167d = nVar;
        return dispatch(gVar, this.f85168e, this);
    }

    public int getType() {
        return 971;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " errMsg:" + str);
        this.f85167d.onSceneEnd(i2, i3, str, this);
    }
}
