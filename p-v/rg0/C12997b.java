package rg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.XWebCleaner;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49371f30;
import te3.C49508g30;

/* renamed from: rg0.b */
public class C12997b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f37055d;

    /* renamed from: e */
    public C11385n f37056e;

    /* renamed from: f */
    public String f37057f;

    public C12997b(String str) {
        this.f37057f = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49371f30();
        bVar.f127067b = new C49508g30();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delsafedevice";
        bVar.f127069d = XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f37055d = a;
        ((C49371f30) a.f127055a.f127080a).f133261d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(this.f37057f)) {
            Log.m105920e("MicroMsg.NetSceneDelSafeDevice", "null device id");
            return -1;
        }
        this.f37056e = nVar;
        return dispatch(gVar, this.f37055d, this);
    }

    public int getType() {
        return XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, errType= " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C49508g30 g302 = (C49508g30) this.f37055d.f127056b.f127083a;
            C86709a0.m107535s().mo121142i().mo119676J(64, Integer.valueOf(g302.f133824d));
            Log.m105918d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, get safedevice state = " + g302.f133824d);
        }
        this.f37056e.onSceneEnd(i2, i3, str, this);
    }
}
