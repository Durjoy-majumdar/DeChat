package com.tencent.p014mm.plugin.sport.model;

import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85796t4;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import p156gj.C87203t;
import qe3.C89625d;
import te3.rz4;
import te3.sz4;

/* renamed from: com.tencent.mm.plugin.sport.model.e */
public class C115766e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f347328d;

    /* renamed from: e */
    public C47350c f347329e;

    /* renamed from: f */
    public sz4 f347330f;

    public C115766e() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1947;
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
        bVar.f127066a = new rz4();
        bVar.f127067b = new sz4();
        C47350c a = bVar.mo72403a();
        this.f347329e = a;
        rz4 rz4 = (rz4) a.f127055a.f127080a;
        rz4.f354317g = C89625d.f257838d;
        rz4.f354314d = C85796t4.m105983jo();
        rz4.f354315e = Build.BRAND;
        String k = C87203t.m108275k();
        rz4.f354316f = k;
        rz4.f354318h = C87200o.f252872e;
        String str = C89625d.f257839e;
        rz4.f354319i = str;
        String str2 = C87200o.f252873f;
        rz4.f354320j = str2;
        String str3 = BuildInfo.CLIENT_VERSION;
        rz4.f354321n = str3;
        String str4 = Build.MANUFACTURER;
        rz4.f354322o = str4;
        Log.m105925i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", rz4.f354314d, rz4.f354315e, k, rz4.f354317g, str2, str, str2, str3, str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f347328d = nVar;
        return dispatch(gVar, this.f347329e, this);
    }

    public int getType() {
        return 1947;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f347330f = (sz4) this.f347329e.f127056b.f127083a;
            this.f347328d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f347328d.onSceneEnd(i2, i3, str, this);
    }
}
