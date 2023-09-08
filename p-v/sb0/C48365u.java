package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51849wl3;
import te3.C51992xl3;

/* renamed from: sb0.u */
public class C48365u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129481d;

    /* renamed from: e */
    public C47350c f129482e;

    public C48365u(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51849wl3();
        bVar.f127067b = new C51992xl3();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/quitbizchat";
        bVar.f127069d = 1358;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129482e = a;
        C51849wl3 wl32 = (C51849wl3) a.f127055a.f127080a;
        wl32.f144125d = str;
        wl32.f144126e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129481d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneQuitBizChat", "do scene");
        return dispatch(gVar, this.f129482e, this);
    }

    public int getType() {
        return 1358;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneQuitBizChat", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129481d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
